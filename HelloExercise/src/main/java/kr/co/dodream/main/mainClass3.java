package kr.co.dodream.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.dodream.beans.totalHello;

public class mainClass3 {

  public static void main(String[] args) {
    // XML 방식
    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("kr/co/dodream/config/beans.xml");
    
    totalHello tHello = (totalHello) appContext.getBean("th1");
    tHello.HelloSay();
    tHello.HangulSay();
    
    appContext.close();
    
    
    
    
  }

}
