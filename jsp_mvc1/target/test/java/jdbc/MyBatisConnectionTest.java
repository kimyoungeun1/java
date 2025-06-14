package jdbc;

import org.apache.ibatis.session.SqlSessionFactory;

public class MyBatisConnectionTest {
  SqlSessionFactory sqlSessionFactory  = MyBatisManager.getSqlSessionFactory();
  SqlSessionFactory sqlSession = sqlSessionFactory.openSession();
}
