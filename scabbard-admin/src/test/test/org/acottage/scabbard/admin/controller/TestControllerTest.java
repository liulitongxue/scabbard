package org.acottage.scabbard.admin.controller;

import org.acottage.scabbard.BaseControllerTest;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/12/21 下午 9:37
 * @Version 1.0
 */
public class TestControllerTest extends BaseControllerTest {


    /**
     * .perform() : 执行一个MockMvcRequestBuilders的请求；MockMvcRequestBuilders有.get()、.post()、.put()、.delete()等请求。
     * .andDo() : 添加一个MockMvcResultHandlers结果处理器,可以用于打印结果输出(MockMvcResultHandlers.print())。
     * .andExpect : 添加MockMvcResultMatchers验证规则，验证执行结果是否正确。
     */

    @Test
    public void test() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(host + "/admin/test"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                // 打印出执行结果
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Autowired
    private TestController testController;

    @Test
    public void testDevTools() {
        ResponseEntity responseEntity = testController.testDevTools();
        System.out.println(responseEntity.toString());
    }
}