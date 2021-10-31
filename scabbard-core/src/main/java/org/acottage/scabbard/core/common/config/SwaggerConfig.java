package org.acottage.scabbard.core.common.config;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/09/20 下午 5:05
 * @Version 1.0
 * <p>
 * Swagger接口文档配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.show:true}")
    private boolean swaggerShow;

    /**
     * 定义分隔符,配置Swagger多包
     */
    private static final String DELIMITER = ";";

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(swaggerShow)
                // 详细定制
                .apiInfo(apiInfo())
                .select()
                // 指定当前包路径，这里就添加了两个包，注意方法变成了basePackage，中间加上成员变量splitor
                .apis(basePackage("org.acottage.scabbard.admin" + DELIMITER + "org.acottage.scabbard.api"))
                // 扫描所有 .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 构建 api文档的详细信息函数
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 页面标题
                .title("API 文档 ")
                .version("1.0")
                // 描述
                .description("API 文档")
                .contact(new Contact("Powered By liulitongxue", "https://www.acottage.com/", "liulitongxue@126.com"))
                .termsOfServiceUrl("https://www.acottage.com/")
                .build();
    }

    /**
     * 声明基础包
     *
     * @param basePackage 基础包路径
     * @return
     */
    @SuppressWarnings("all")
    private static Predicate<RequestHandler> basePackage(final String basePackage) {
        return input -> declaringClass(input).transform(handlerPackage(basePackage)).or(true);
    }

    /**
     * 校验基础包
     *
     * @param basePackage 基础包路径
     * @return
     */
    @SuppressWarnings("all")
    private static Function<Class<?>, Boolean> handlerPackage(final String basePackage) {
        return input -> {
            for (String strPackage : basePackage.split(DELIMITER)) {
                boolean isMatch = input.getPackage().getName().startsWith(strPackage);
                if (isMatch) {
                    return true;
                }
            }
            return false;
        };
    }

    /**
     * 检验基础包实例
     *
     * @param requestHandler 请求处理类
     * @return
     */
    @SuppressWarnings("all")
    private static Optional<? extends Class<?>> declaringClass(RequestHandler requestHandler) {
        return Optional.fromNullable(requestHandler.declaringClass());
    }

}