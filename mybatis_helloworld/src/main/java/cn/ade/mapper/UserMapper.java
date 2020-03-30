package cn.ade.mapper;

import cn.ade.domain.User;
import java.util.List;

/**
 * 需求描述：用户的数据访问接口
 *
 * @author 传智播客黑马程序员 ·张博
 * @version 1.0 ，2018-01-11 15:44:07
 */
public interface UserMapper {

    public List<User> findUserById(int id) throws Exception;

    public List<User> findUserByUsername(String username) throws Exception;

    public User findUserByIdResultMap(int id) throws Exception;

    List<User> findUserAndItems();

}
