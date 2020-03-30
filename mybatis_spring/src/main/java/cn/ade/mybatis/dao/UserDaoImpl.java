package cn.ade.mybatis.dao;

import cn.ade.mybatis.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * 需求描述：用户模块的数据访问类
 *
 * @author ade
 * @version 1.0，2018-01-15 19:04:18
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User fincUserById(int id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.selectOne("test.findUserById", id);
    }

}
