package cn.ade.mybatis.dao;

import cn.ade.mybatis.domain.User;

/**
 * 需求描述：用户模块的数据访问接口
 *
 * @author ade
 * @version 1.0，2018-01-15 19:01:25
 */
public interface UserDao {

    User fincUserById(int id) throws Exception;

}
