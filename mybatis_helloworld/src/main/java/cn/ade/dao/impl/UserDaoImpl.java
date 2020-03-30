package cn.ade.dao.impl;

import cn.ade.dao.UserDao;
import cn.ade.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * 需求描述：用户模块的数据访问类
 *
 * @author ade
 * @version 1.0，2018-01-11 16:04:06
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.sqlSessionFactory = factory;
    }

    public User findUserById(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        User user = session.selectOne("test.findUserById", id);
        session.close();
        return user;
    }
}
