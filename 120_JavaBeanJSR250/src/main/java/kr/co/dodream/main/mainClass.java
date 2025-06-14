package kr.co.dodream.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import kr.co.dodream.beans.TestBean;
import kr.co.dodream.beans.TestBean2;
import kr.co.dodream.beans.TestBean3;
import kr.co.dodream.config.BeanConfiguration;

public class mainClass {

	public static void main(String[] args) {
		// XML방식
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/co/dodream/config/beans.xml");
		
		TestBean xml1 = (TestBean) context.getBean("xml1");
		System.out.println(xml1);//
			
		
		System.out.println("-----------------xml1----------------------");		
		context.close();
		
		// Java방식
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		TestBean java1 = (TestBean) context2.getBean("java1");
		System.out.println(java1);//
		
		
		context2.close();
	}

}
