package main;

import java.util.Calendar;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java_mybatis.common.MyBatisManager;
import model.MemberVO;

public class Step20_InsertTest {

  public static void main(String[] args) {

    SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession(false);// 만약 true로 하면 autocommit 처리됨

    MemberVO vo = new MemberVO();
    vo.setMemberid("duly");
    vo.setName("둘리");
    vo.setPw(1234);
    vo.setPhone("010-2222-2222");
    vo.setEmail("duly@a.com");
    vo.setRegtime(Calendar.getInstance().getTime());

    // sqlSession.insert("네임스페이스.구문id", MemberVO타입의 객체)
    int result = sqlSession.insert("member.save", vo);
    System.out.println("result = " + result);

    /*
     * 마이바티즈 트랜잭션 처리
     * 
     * insert, delete, update 문장은 DB에 바로 반영하지 말고 commit()/rollback()으로 최종 결정
     * sqlSession이 제공하는 commit()/rollback() 메소드를 호출하는 것과 동시에 트랜잭션이 종료된다. 트랜잭션에 대한
     * 제어를 마이바티즈가 담당한다.
     */
    if (result > 0) {
      sqlSession.commit();// 실제 DB에 반영
    } else {
      sqlSession.rollback();// 작업취소
    }

    sqlSession.close();

  }// main
}