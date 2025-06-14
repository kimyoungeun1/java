package jdbc;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import myBatis.MyBatisManager;


public class MyBatisConnectionTest {
  SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
  SqlSession sqlSession = sqlSessionFactory.openSession();

@Test
public void sqlSessionTest() {
  assertNotNuLL(sqlSession);
}
  
  
}