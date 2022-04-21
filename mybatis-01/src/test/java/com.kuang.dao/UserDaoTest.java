package com.kuang.dao;

import com.kuang.dao.UserDao;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDao userdao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userdao.getUserList();
        for (User user : userList){
            System.out.println(user);
        }
        //关闭SqlSession
        sqlSession.close();
    }
}
