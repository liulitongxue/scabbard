package org.acottage.scabbard.core.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;


/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2024年7月15日 上午12:05
 * @Version 1.0
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig{

    @Bean
    public ServerEndpointExporter serverEndpoint() {
        return new ServerEndpointExporter();
    }

}
