package kr.co.dodream.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import kr.co.dodream.beans.TestBean;
import kr.co.dodream.beans.TestBean2;
import kr.co.dodream.beans.TestBean3;

public class mainClass {

  public static void main(String[] args) {
  
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/co/dodream/config/beans.xml");
    //Java
    TestBean test1 = new TestBean(15000);
    test1.printData();
    System.out.println("test1: " + test1); // @741a8937
    
    //XML
    TestBean test2 = (TestBean) context.getBean("tb1");
    test2.printData();
    System.out.println("test2: " + test2); // @
    
    
    context.close();
    
  }

}
