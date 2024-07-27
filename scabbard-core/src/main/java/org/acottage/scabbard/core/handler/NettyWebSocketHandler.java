package org.acottage.scabbard.core.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2024年7月21日 下午1:00
 * @Version 1.0
 */
public class NettyWebSocketHandler extends SimpleChannelInboundHandler<WebSocketFrame> {


    @Override
    public void handlerAdded(ChannelHandlerContext ctx) {
        System.out.println("Client connected: " + ctx.channel().id().asShortText());
    }


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, WebSocketFrame frame) throws Exception {
        if (frame instanceof TextWebSocketFrame) {
            String request = ((TextWebSocketFrame) frame).text();
            ctx.channel().writeAndFlush(new TextWebSocketFrame("Echo: " + request));
        }
    }



    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) {
        System.out.println("Client disconnected: " + ctx.channel().id().asShortText());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
