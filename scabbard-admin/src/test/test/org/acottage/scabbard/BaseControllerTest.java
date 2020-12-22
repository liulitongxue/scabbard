package org.acottage.scabbard;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;


/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/12/21 下午 9:37
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
//@SpringBootTest
//@SpringBootTest(
//        classes = {ScabbardAdminApplication.class}
//)
// 不启动服务器,使用mockMvc进行测试http请求。启动了完整的Spring应用程序上下文，但没有启动服务器
@SpringBootTest(webEnvironment = RANDOM_PORT)
@AutoConfigureMockMvc
public class BaseControllerTest {

    protected String host = "http://localhost:11301";

    @Autowired
    protected MockMvc mockMvc;

    /**
     * 如果有登陆可以在在里处理
     */
//    @Before
//    public void init() {
//        System.out.println("初始化一些参数");
//    }
    @BeforeClass
    public static void initClass() {
        System.out.println("初始化一些参数");
    }

}
