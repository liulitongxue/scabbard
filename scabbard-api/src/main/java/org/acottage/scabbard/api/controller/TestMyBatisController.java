package org.acottage.scabbard.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.acottage.scabbard.core.entity.TestMyBatis;
import org.acottage.scabbard.core.service.TestMyBatisService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/08/22 下午 9:19
 * @Version 1.0
 */
@Controller
@RequestMapping("/api/test/my/batis")
@Api(value="测试接口",tags = "接口信息")
public class TestMyBatisController {

    @Resource
    private TestMyBatisService testMyBatisService;

    @PostMapping("/insert")
    @ApiOperation(value="测试myBatis",tags = "测试myBatis")
    public ResponseEntity<String> insert(@RequestBody TestMyBatis testMyBatis) {
        return ResponseEntity.ok("插入数据的id为：" + testMyBatisService.insert(testMyBatis));
    }

}
