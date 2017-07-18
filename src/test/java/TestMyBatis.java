/**
 * Created by intern07 on 16/12/23.
 */

import javax.annotation.Resource;

import org.apache.log4j.Logger;
//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import com.alibaba.fastjson.JSON;
import com.example.pojo.TestUser;
import com.example.service.HelloWorldService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    // private ApplicationContext ac = null;
    @Resource
    private HelloWorldService service = null;

    // @Before
    // public void before() {
    // ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    // userService = (IUserService) ac.getBean("userService");
    // }

    @Test
    public void test() {
        TestUser testUser = service.getUserById(1);
        // System.out.println(testUser.getUserName());
        // logger.info("值："+testUser.getUserName());
        logger.info(testUser.toString());
    }
}
