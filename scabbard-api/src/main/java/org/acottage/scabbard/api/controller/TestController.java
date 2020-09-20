package org.acottage.scabbard.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/api/test")
@Api(value="测试接口",tags = "接口信息")
public class TestController {

    @GetMapping()
    @ApiOperation(value="测试controller",tags = "测试controller")
    public ResponseEntity test() {
        return ResponseEntity.ok("测试"+"\n"+"测试devtools");
    }

}
