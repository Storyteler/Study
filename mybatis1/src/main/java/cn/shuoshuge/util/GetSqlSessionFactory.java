package cn.shuoshuge.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class GetSqlSessionFactory {

    public static SqlSessionFactory sqlSessionFactory = buildSqlSessionFactory();

    public static SqlSessionFactory buildSqlSessionFactory() {

        try {
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            return new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            throw new RuntimeException("读取配置文件异常",e);
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static SqlSession getSqlSession(boolean auto) {
        return sqlSessionFactory.openSession(auto);
    }

}
