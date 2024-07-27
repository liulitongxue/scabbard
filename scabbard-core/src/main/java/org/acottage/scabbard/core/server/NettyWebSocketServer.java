package org.acottage.scabbard.core.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import org.acottage.scabbard.core.handler.NettyWebSocketHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.CompletableFuture;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2024年7月21日 下午12:56
 * @Version 1.0
 */
@Component
public class NettyWebSocketServer {

    @Value("${netty.server.port.websocket:}")
    private Integer port;


    // 负责处理接受进来的链接
    private EventLoopGroup bossGroup;
    // 负责处理已经被接收的连接上的I/O操作
    private EventLoopGroup workerGroup;
    // 在这个场景中，它表示服务器的绑定操作的结果
    private ChannelFuture future;

    @PostConstruct
    public void start() throws InterruptedException {
        // 使用异步任务启动 Netty 服务器
        CompletableFuture.runAsync(() -> {
            bossGroup = new NioEventLoopGroup();
            workerGroup = new NioEventLoopGroup();
            try {
                ServerBootstrap b = new ServerBootstrap();
                b.group(bossGroup, workerGroup)
                        .channel(NioServerSocketChannel.class)
                        .childHandler(new ChannelInitializer<SocketChannel>() {
                            @Override
                            public void initChannel(SocketChannel ch) throws Exception {
                                ch.pipeline().addLast(new HttpServerCodec());
                                ch.pipeline().addLast(new HttpObjectAggregator(65536));
                                ch.pipeline().addLast(new ChunkedWriteHandler());
                                ch.pipeline().addLast(new WebSocketServerProtocolHandler("/nettywebsocket"));
                                ch.pipeline().addLast(new NettyWebSocketHandler());
                            }
                        })
                        .option(ChannelOption.SO_BACKLOG, 128)
                        .childOption(ChannelOption.SO_KEEPALIVE, true);
                // 绑定端口并开始接受进来的连接
                future = b.bind(port).sync();
                System.out.println("WebSocket server started at port " + port);
                // 等待服务器套接字关闭
                future.channel().closeFuture().sync();
                System.out.println("WebSocket server future closed");
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            } finally {
                workerGroup.shutdownGracefully();
                bossGroup.shutdownGracefully();
            }
            System.out.println("WebSocket server end ");
        });
    }


    @PreDestroy
    public void stop() {
        if (future != null && !future.isDone()) {
            future.cancel(true);
        }
        workerGroup.shutdownGracefully();
        bossGroup.shutdownGracefully();
    }
}
