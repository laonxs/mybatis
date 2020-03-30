package cn.ade.mybatis.domain;

import cn.ade.mybatis.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * 需求描述：UserDaoImpl的测试类
 *
 * @author ade
 * @version 1.0，2018-01-15 19:16:12
 */
public class UserDaoImplTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

    @Test
    public void fincUserById() throws Exception {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.fincUserById(1);
        System.out.println(user);
    }

}