package cn.shuoshuge;

import cn.shuoshuge.pojo.User;
import cn.shuoshuge.util.GetSqlSessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class MybatisTestCase {

    @Test
    public void readxml() {

        try {
            //读取配置文件
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            //构建sqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //构建sqlSession对象
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //需要运行代码
            User user = sqlSession.selectOne("cn.shuoshuge.mapper.UserMapper.findById",1);
            System.out.println(user);
            //释放资源
            sqlSession.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void update() {

        SqlSession sqlSession = GetSqlSessionFactory.getSqlSession(true);
        User user = sqlSession.selectOne("cn.shuoshuge.mapper.UserMapper.findById",1);
        user.setName("fu");
        sqlSession.update("cn.shuoshuge.mapper.UserMapper.update",user);
        sqlSession.close();

    }

    @Test
    public void delete() {

        SqlSession sqlSession = GetSqlSessionFactory.getSqlSession(true);
        sqlSession.delete("cn.shuoshuge.mapper.UserMapper.delete",1);
        sqlSession.close();

    }

}
