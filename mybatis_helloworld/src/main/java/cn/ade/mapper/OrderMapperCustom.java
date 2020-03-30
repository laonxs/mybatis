package cn.ade.mapper;

import cn.ade.domain.Orders;
import cn.ade.domain.Orders_Custom;

import java.util.List;

/**
 * 需求描述：订单的数据访问接口
 *
 * @author ade
 * @version 1.0，2018-01-13 10:09:26
 */
public interface OrderMapperCustom {

    List<Orders_Custom> findOrdersAndUserByResultType();

    List<Orders> findOrdersAndUserByResultMap();

    List<Orders> findOrdersAndOrderDetailByResultMap();

}
