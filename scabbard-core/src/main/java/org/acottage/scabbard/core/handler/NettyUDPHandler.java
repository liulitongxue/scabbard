package org.acottage.scabbard.core.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;


/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2024年7月21日 下午1:00
 * @Version 1.0
 */
public class NettyUDPHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket packet) throws Exception {
        String msg = packet.content().toString(CharsetUtil.UTF_8);
        System.out.println("Received: " + msg);
        ctx.writeAndFlush(new DatagramPacket(packet.content().copy(), packet.sender()));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
