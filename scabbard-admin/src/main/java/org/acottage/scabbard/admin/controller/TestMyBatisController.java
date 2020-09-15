package org.acottage.scabbard.admin.controller;

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
@RequestMapping("/admin/test/my/batis")
public class TestMyBatisController {

    @Resource
    private TestMyBatisService testMyBatisService;

    @PostMapping("/insert")
    public ResponseEntity insertTestMybatis(@RequestBody TestMyBatis testMyBatis) {
        return ResponseEntity.ok("插入数据的id为：" + testMyBatisService.insertTestMybatis(testMyBatis));
    }

}
