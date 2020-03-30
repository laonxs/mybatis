package cn.ade.mapper;

import cn.ade.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 需求描述：UserMapper的实现
 *
 * @author ade
 * @version 1.0，2018-01-11 16:50:29
 */
public class UserMapperTest {

    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserById() throws Exception {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.findUserById(1);
        System.out.println(userList);
        session.close();
    }

    @Test
    public void findUserByIdResultMap() throws Exception {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.findUserByIdResultMap(1);
        System.out.println(user);
        session.close();
    }

    @Test
    public void findUserByUsername() throws Exception {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.findUserByUsername("小");
        System.out.println(users);
        session.close();
    }

    @Test
    public void findUserAndItems() throws Exception {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.findUserAndItems();
        System.out.println(userList);
        session.close();
    }

}