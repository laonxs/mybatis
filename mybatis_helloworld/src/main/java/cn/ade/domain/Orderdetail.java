package cn.ade.domain;

/**
 * 需求描述：订单详情的实体类
 *
 * @author ade
 * @version 1.0，2018-01-13 11:24:46
 */
public class Orderdetail {

    private int id;
    private int items_id;
    private int items_num;
    private int orders_id;

    private Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }

    public int getItems_num() {
        return items_num;
    }

    public void setItems_num(int items_num) {
        this.items_num = items_num;
    }

    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }
}
