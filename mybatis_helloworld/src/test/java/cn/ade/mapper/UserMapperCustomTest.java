package cn.ade.mapper;

import cn.ade.domain.QueryUserVo;
import cn.ade.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 需求描述：pojo包装类的测试
 *
 * @author ade
 * @version 1.0，2018-01-12 14:13:07
 */
public class UserMapperCustomTest {

    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserList() throws Exception {
        SqlSession session = factory.openSession();
        UserMapperCustom mapper = session.getMapper(UserMapperCustom.class);
        User user = new User();
        user.setId(1);
        user.setUsername("王五");
        QueryUserVo queryUserVo = new QueryUserVo();
        queryUserVo.setUser(user);
        List<User> userList = mapper.findUserList(queryUserVo);
        System.out.println(userList);
        session.close();
    }

    @Test
    public void findUserByHashmap() throws Exception {
        SqlSession session = factory.openSession();
        UserMapperCustom mapper = session.getMapper(UserMapperCustom.class);
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("username", "王五");
        List<User> userList = mapper.findUserByHashmap(map);
        System.out.println(userList);
        session.close();
    }

}