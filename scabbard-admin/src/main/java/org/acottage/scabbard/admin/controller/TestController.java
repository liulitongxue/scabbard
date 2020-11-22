package org.acottage.scabbard.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author liuli email:liulitongxue@126.com
 * @Date 2020/08/09 下午 9:52
 * @Version 1.0
 */
@Controller
@RequestMapping("/admin/test")
@Api(value="测试接口",tags = "接口信息")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping()
    @ApiOperation(value="测试controller",tags = "测试controller")
    public ResponseEntity test() {
        long time = System.currentTimeMillis();
        logger.debug(String.valueOf(time));
        return ResponseEntity.ok("测试"+"\n"+"测试devtools");
    }

}
