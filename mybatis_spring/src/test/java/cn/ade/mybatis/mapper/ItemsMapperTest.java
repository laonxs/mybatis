package cn.ade.mybatis.mapper;

import cn.ade.mybatis.domain.Items;
import cn.ade.mybatis.domain.ItemsExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 需求描述：ItemsMapper的测试类
 *
 * @author ade
 * @version 1.0，2018-01-15 21:39:45
 */
public class ItemsMapperTest {

    private ApplicationContext applicationContext;

    private ItemsMapper itemsMapper;

    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");
    }


    @Test
    public void selectByPrimaryKey() throws Exception {
        Items items = itemsMapper.selectByPrimaryKey(1);
        System.out.println(items);
    }

    //自定义条件查询
    @Test
    public void testSelectByExample() {
        ItemsExample itemsExample = new ItemsExample();
        ItemsExample.Criteria criteria = itemsExample.createCriteria();
        criteria.andNameEqualTo("台式机");
        criteria.andIdEqualTo(1);
        List<Items> list = itemsMapper.selectByExample(itemsExample);
        System.out.println(list);
    }

    //更新
    @Test
    public void testUpdateByPrimaryKey() {
        // 根据主键更新，不管更新对象的属性是否为空全部更新
		// itemsMapper.updateByPrimaryKey(record)
        // 根据主键更新，只更新不为空的属性，参考mapper.xml中的代码
        // itemsMapper.updateByPrimaryKeySelective(record);
    }

}