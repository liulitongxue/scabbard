package org.acottage.scabbard.core.common.config;

import org.acottage.scabbard.core.handler.SpringWebSocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;


/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2024年7月15日 上午12:05
 * @Version 1.0
 */
@Configuration
@EnableWebSocket
public class SpringWebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new SpringWebSocketHandler(), "/springwebsocket").setAllowedOrigins("*");
    }


}
