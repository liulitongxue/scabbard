package org.acottage.scabbard.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/08/24 下午 5:27
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("org.acottage.scabbard")
public class ScabbardAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScabbardAdminApplication.class);
    }

}
