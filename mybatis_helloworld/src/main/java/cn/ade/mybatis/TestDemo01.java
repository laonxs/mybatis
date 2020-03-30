package cn.ade.mybatis;

import cn.ade.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * 需求描述：测试用例一
 *
 * @author ade
 * @version 1.0，2018-01-11 10:01:59
 */
public class TestDemo01 {

    /** 会话工厂 */
    private SqlSessionFactory factory;

    @Before
    public void createSqlSessionFactory() throws IOException {
        // mybatis全局配置文件
        String resource = "SqlMapConfig.xml";

        // 构造全局配置文件的输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建SqlSessionFactory会话工厂
        factory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserById() throws IOException {
        // 创建session会话
        SqlSession session = factory.openSession();

        // 根据session查询用户
        User user = session.selectOne("test.findUserById", 1);
        System.out.println(user);

        // 关闭session
        session.close();
    }

    @Test
    public void findUserByUsername() throws IOException {
        // 创建会话
        SqlSession session = factory.openSession();

        // 根据session查询用户
        List<User> users = session.selectList("test.findUserByUsername", "五");
        System.out.println(users);

        // 关闭会话
        session.close();
    }

    @Test
    public void insertUser() throws IOException {
        // mybatis全局配置文件
        String resource = "SqlMapConfig.xml";

        // 构造全局配置文件的输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建SqlSessionFactory会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        // 创建会话
        SqlSession session = factory.openSession();

        // 添加用户
        User user = new User();
        user.setUsername("赵六1");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("西安");

        session.insert("test.insertUser", user);
        System.out.println(user.getId());

        // 提交事务
        session.commit();

        // 关闭会话
        session.close();
    }

    @Test
    public void deleteUser() throws IOException {
        // mybatis全局配置文件
        String resource = "SqlMapConfig.xml";

        // 构造全局配置文件的输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 构造SqlSessionFactory会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        // 创建会话
        SqlSession session = factory.openSession();

        // 删除用户
        session.delete("test.deleteUser", 24);

        // 提交事务
        session.commit();

        // 关闭会话
        session.close();
    }

    @Test
    public void updateUser() throws IOException {
        // mybatis全局配置文件
        String resource = "SqlMapConfig.xml";

        // 构造全局配置文件的输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建SqlSessionFactory会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        // 创建会话
        SqlSession session = factory.openSession();

        // 更新用户
        User user = new User();
        user.setId(35);
        user.setUsername("赵六3");
        user.setBirthday(new Date());
        user.setAddress("郑州");
        user.setSex("1");
        session.update("test.updateUser", user);

        // 提交事务
        session.commit();

        // 关闭会话
        session.close();
    }

}
