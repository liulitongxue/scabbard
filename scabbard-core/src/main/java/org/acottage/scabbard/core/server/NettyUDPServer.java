package org.acottage.scabbard.core.server;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramChannel;
import io.netty.channel.socket.nio.NioDatagramChannel;
import org.acottage.scabbard.core.handler.NettyUDPHandler;
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
public class NettyUDPServer {

    @Value("${netty.server.port.udp:}")
    private Integer port;


    private EventLoopGroup group;
    // 在这个场景中，它表示服务器的绑定操作的结果
    private ChannelFuture future;


    @PostConstruct
    public void start() throws InterruptedException {
        // 使用异步任务启动 Netty 服务器
        CompletableFuture.runAsync(() -> {
            group = new NioEventLoopGroup();
            try {
                Bootstrap b = new Bootstrap();
                b.group(group)
                        .channel(NioDatagramChannel.class)
                        .handler(new ChannelInitializer<DatagramChannel>() {
                            @Override
                            public void initChannel(DatagramChannel ch) throws Exception {
                                ch.pipeline().addLast(new NettyUDPHandler());
                            }
                        });

                future = b.bind(port).sync();
                System.out.println("UDP server started at port " + port);
                future.channel().closeFuture().await();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            } finally {
                group.shutdownGracefully();
            }
            System.out.println("UDP server end ");
        });
    }


    @PreDestroy
    public void stop() {
        if (future != null && !future.isDone()) {
            future.cancel(true);
        }
        group.shutdownGracefully();
    }

}
