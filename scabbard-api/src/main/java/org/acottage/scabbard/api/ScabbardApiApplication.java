package org.acottage.scabbard.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/08/24 下午 6:55
 * @Version 1.0
 */
@SpringBootApplication(scanBasePackages = "org.acottage.scabbard")
@MapperScan("org.acottage.scabbard")
@EnableAsync
public class ScabbardApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScabbardApiApplication.class);
    }

}
