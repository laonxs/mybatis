package cn.ade.mapper;

import cn.ade.domain.Orders;
import cn.ade.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 需求描述：OrderMapper接口的测试类
 *
 * @author ade
 * @version 1.0，2018-01-13 15:52:55
 */
public class OrderMapperTest {

    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findAllOrders() throws Exception {
        SqlSession session = factory.openSession();
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        List<Orders> allOrders = mapper.findAllOrders();
        System.out.println(allOrders);
        Orders orders = allOrders.get(0);
        User user = orders.getUser();
        System.out.println(user);
    }

}