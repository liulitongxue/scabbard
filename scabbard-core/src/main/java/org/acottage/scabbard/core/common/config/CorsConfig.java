package org.acottage.scabbard.core.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/09/20 下午 5:05
 * @Version 1.0
 *
 * 跨域配置
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                /* 是否允许请求带有验证信息 */
                .allowCredentials(true)
                /* 允许访问的客户端域名 */
                .allowedOrigins("*")
                /* 允许服务端访问的客户端请求头 */
                .allowedHeaders("*")
                /* 允许访问的方法名,GET POST等 */
                .allowedMethods("*");
    }

}