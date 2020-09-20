package org.acottage.scabbard.admin.controller;

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
public class TestController {

    @GetMapping()
    public ResponseEntity test() {
        return ResponseEntity.ok("测试"+"\n"+"测试devtools");
    }

}
