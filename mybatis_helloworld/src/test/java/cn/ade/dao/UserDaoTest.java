package cn.ade.dao;

import cn.ade.dao.impl.UserDaoImpl;
import cn.ade.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;

/**
 * 需求描述：UserDao的接口测试
 *
 * @author ade
 * @version 1.0，2018-01-11 16:13:05
 */
public class UserDaoTest {

    private SqlSessionFactory factory;

    @Before
    public void setUp() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserById(){
        UserDao userDao = new UserDaoImpl(factory);
        User user = userDao.findUserById(1);
        System.out.println(user);
    }

}