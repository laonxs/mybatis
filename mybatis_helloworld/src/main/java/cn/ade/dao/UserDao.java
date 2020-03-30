package cn.ade.dao;

import cn.ade.domain.User;

/**
 * 需求描述：用户的数据访问接口
 *
 * @author 传智播客黑马程序员 ·张博
 * @version 1.0 ，2018-01-11 15:44:07
 */
public interface UserDao {

    public User findUserById(int id);

}
