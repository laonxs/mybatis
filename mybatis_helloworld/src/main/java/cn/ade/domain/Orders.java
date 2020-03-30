package cn.ade.domain;

import java.util.Date;
import java.util.List;

/**
 * 需求描述：订单的实体类
 *
 * @author ade
 * @version 1.0，2018-01-13 09:56:37
 */
public class Orders {

    private int id;

    /** 订单号 */
    private String number;

    /** 备注 */
    private String note;
    private Date createtime;
    private int user_id;

    private User user;

    private List<Orderdetail> orderdetails;

    public List<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", note='" + note + '\'' +
                ", createtime=" + createtime +
                ", user_id=" + user_id +
                ", user=" + user +
                ", orderdetails=" + orderdetails +
                '}';
    }

}
