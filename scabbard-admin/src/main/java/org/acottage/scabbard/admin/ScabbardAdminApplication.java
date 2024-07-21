package org.acottage.scabbard.admin;

import org.acottage.scabbard.core.service.NettyWebSocketServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.annotation.Resource;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/08/24 下午 5:27
 * @Version 1.0
 */
@EnableAsync
@MapperScan("org.acottage.scabbard.core.mapper")
@SpringBootApplication(scanBasePackages = "org.acottage.scabbard")
public class ScabbardAdminApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScabbardAdminApplication.class);
    }

    @Resource
    private NettyWebSocketServer nettyWebSocketServer;

    @Override
    public void run(String... args) throws Exception {
    }
}
