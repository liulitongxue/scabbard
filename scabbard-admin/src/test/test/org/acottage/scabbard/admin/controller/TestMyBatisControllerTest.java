package org.acottage.scabbard.admin.controller;

import org.acottage.scabbard.BaseControllerTest;
import org.acottage.scabbard.core.entity.TestMyBatis;
import org.acottage.scabbard.core.service.TestMyBatisService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/12/21 下午 10:34
 * @Version 1.0
 */
//@WebMvcTest(TestMyBatisController.class)
public class TestMyBatisControllerTest extends BaseControllerTest {


    @Autowired
    private TestMyBatisController testMyBatisController;

    /**
     * 项目启动时排除掉的bean
     */
//    @Mock
//    @MockBean
//    @Spy
    @SpyBean
    private TestMyBatisService testMyBatisService;

    @Test
    public void insert() throws Exception {


        TestMyBatis testMyBatis = new TestMyBatis(1L, "七言", new Date(), new Date(), false);

//        Mockito.when(testMyBatisService.insert(testMyBatis))
//                .thenReturn(testMyBatis.getId());
        Mockito.doReturn(testMyBatis.getId()).when(testMyBatisService).insert(Mockito.any());

        String param = "{\"name\":\"七微\"}";

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post(host + "/admin/test/my/batis/insert")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(param))
                // 打印出执行结果
                .andDo(print())
                // todo 结果错误
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString(testMyBatis.getId().toString())))
                .andReturn();
        // todo 结果错误
        assertNotNull(mvcResult.getResponse().getContentAsString());
    }


    @Test
    public void insertList() {
        List<TestMyBatis> testMyBatisList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            TestMyBatis testMyBatis = new TestMyBatis();
            testMyBatis.setName("西延");
            testMyBatisList.add(testMyBatis);
        }
        Mockito.when(testMyBatisService.insertList(testMyBatisList))
                .thenReturn(Long.valueOf(testMyBatisList.size()));
        ResponseEntity responseEntity = testMyBatisController.insertList(testMyBatisList);
        System.out.println(responseEntity.toString());
        assertNull(responseEntity.toString());
    }
}