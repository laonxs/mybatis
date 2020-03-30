package cn.ade.domain;

/**
 * 需求描述：自定义的订单实体类
 *
 * @author ade
 * @version 1.0，2018-01-13 10:07:09
 */
public class Orders_Custom extends Orders {

    private String username;

    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
