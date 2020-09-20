package org.acottage.scabbard.core.common.runner;

import cn.hutool.core.date.DateUtil;
import org.acottage.scabbard.core.common.constant.DateConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/09/20 下午 5:05
 * @Version 1.0
 */
@Component
public class ScabbardApplicationRunner implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScabbardApplicationRunner.class);

    @Value("${server.port}")
    private int port;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.info("程序部署完成，当前时间：" + DateUtil.format(new Date(), DateConst.YYYY_MM_DD_HH_MM_SS_EN));
        LOGGER.info("服务地址 ：http://localhost:" + port);
    }

}
