package cn.ade.mapper;

import cn.ade.domain.QueryUserVo;
import cn.ade.domain.User;

import java.util.HashMap;
import java.util.List;

/**
 * 需求描述：pojo包装类的数据访问接口
 *
 * @author ade
 * @version 1.0，2018-01-12 14:11:26
 */
public interface UserMapperCustom {

    public List<User> findUserList(QueryUserVo queryUserVo) throws Exception;

    public List<User> findUserByHashmap(HashMap<Object, Object> hashMap) throws Exception;

}
