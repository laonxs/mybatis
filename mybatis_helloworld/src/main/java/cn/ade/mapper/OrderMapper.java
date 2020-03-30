package cn.ade.mapper;

import cn.ade.domain.Orders;

import java.util.List;

/**
 * 需求描述：订单模块的数据访问接口
 *
 * @author ade
 * @version 1.0，2018-01-13 15:51:52
 */
public interface OrderMapper {

    List<Orders> findAllOrders();

}
