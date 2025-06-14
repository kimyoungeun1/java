package kr.co.dodream.main;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.dodream.beans.TestBean;

public class mainClass {
  
  public static void main(String[] args) {
     
     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr.co.dodream.beans.TestBean");
    
     TestBean test1 = (TestBean) context.getBean("testBean");
     test1.multy();
     System.out.println("test1: " + test1); 
     
     context.close();
     
  }
}    