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
		//TestBean xml2 = (TestBean) context.getBean("xml2");
		//System.out.println(xml2);//
		//TestBean xm22 = (TestBean) context.getBean("xml2");
		//System.out.println(xm22);//
		
		//TestBean3 xm3 = (TestBean3) context.getBean("xml3");
		//System.out.println(xm3);//
		
		TestBean2 xml22 = (TestBean2) context.getBean("xml2");
		System.out.println(xml22);//
		
		
		System.out.println("-----------------xml1----------------------");		
		context.close();
		
		// Java방식
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		TestBean java1 = (TestBean) context2.getBean("java1");
		System.out.println(java1);//
		TestBean java2 = (TestBean) context2.getBean("java2");
		System.out.println(java2);//
		//TestBean java3 = (TestBean) context2.getBean("java3");
		//System.out.println(java3);//
		TestBean java500 = (TestBean) context2.getBean("java500");
		System.out.println(java500);//
		
		TestBean2 java4 = (TestBean2) context2.getBean("java4");
		System.out.println(java4);//
		TestBean2 java44 = (TestBean2) context2.getBean("java4");
		System.out.println(java44);//
		
		TestBean java222 = (TestBean) context2.getBean("java222", TestBean.class);
		System.out.println(java222);//
		
		context2.close();
	}

}
