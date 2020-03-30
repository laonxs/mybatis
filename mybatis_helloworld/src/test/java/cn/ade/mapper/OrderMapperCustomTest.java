package cn.ade.mapper;

import cn.ade.domain.Orders;
import cn.ade.domain.Orders_Custom;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 需求描述：OrderMapperCustom接口的测试类
 *
 * @author ade
 * @version 1.0，2018-01-13 10:17:45
 */
public class OrderMapperCustomTest {

    private SqlSessionFactory factory;

    @Before
    public void setUp() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findOrdersAndUserByResultType() throws Exception {
        SqlSession session = factory.openSession();
        OrderMapperCustom mapper = session.getMapper(OrderMapperCustom.class);
        List<Orders_Custom> orders_customs = mapper.findOrdersAndUserByResultType();
        for (Orders_Custom orders_custom : orders_customs) {
            System.out.println(orders_custom.getId() + "----" + orders_custom.getUsername());
        }
    }

    @Test
    public void findOrdersAndUserByResultMap() {
        SqlSession session = factory.openSession();
        OrderMapperCustom mapper = session.getMapper(OrderMapperCustom.class);
        List<Orders> orders = mapper.findOrdersAndUserByResultMap();
        System.out.println(orders);
    }

    @Test
    public void findOrdersAndOrderDetailByResultMap() {
        SqlSession session = factory.openSession();
        OrderMapperCustom mapper = session.getMapper(OrderMapperCustom.class);
        List<Orders> orders = mapper.findOrdersAndOrderDetailByResultMap();
        System.out.println(orders);
    }

}