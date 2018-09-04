package test;

import mapper.UserMapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author Xie Chenxi
 * @Date 2018/8/31 12:30
 */
public class MyTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String resource = "configuration.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void method1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.getMapper(UserMapper.class).getById(1);
        System.out.println(user);
    }

}
