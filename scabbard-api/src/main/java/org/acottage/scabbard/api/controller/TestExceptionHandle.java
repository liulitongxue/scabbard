package org.acottage.scabbard.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.acottage.scabbard.api.common.exception.ApiGlobalException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/11/22 下午 1:46
 * @Version 1.0
 */

@Controller
@RequestMapping("/api/test/exception/handle")
@Api(value = "测试接口", tags = "接口信息")
public class TestExceptionHandle {
    private static final Logger logger = LoggerFactory.getLogger(TestExceptionHandle.class);

    @GetMapping()
    @ApiOperation(value = "测试全局统一异常处理", tags = "测试全局统一异常处理")
    public ResponseEntity test() {
        try {
            double i = 1 / 0;
        } catch (Exception e) {
//            e.printStackTrace();
            throw new ApiGlobalException("400", "页面发生错误");
        }
        return ResponseEntity.ok("测试" + "\n" + "测试全局统一异常处理");
    }

}
