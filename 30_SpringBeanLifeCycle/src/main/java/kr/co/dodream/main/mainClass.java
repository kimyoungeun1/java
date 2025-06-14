package kr.co.dodream.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import kr.co.dodream.beans.TestBean;

public class mainClass {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/co/dodream/config/beans.xml");
		
		TestBean t1 = (TestBean) context.getBean("testBean");
		System.out.println("t1: " + t1); // @741a8937	
		
		TestBean t2 = (TestBean) context.getBean("testBean2");
		System.out.println("t2: " + t2); // @306e95ec	
		
		TestBean t3 = (TestBean) context.getBean("testBean3");
		System.out.println("t3: " + t3); // @306e95ec	
		
		TestBean t4 = (TestBean) context.getBean("testBean");
		System.out.println("t4: " + t4); // @741a8937
		
		// lazy-init="default"
		TestBean t5 = (TestBean) context.getBean("testBean3");
		System.out.println("t5: " + t5); // @52af26ee
		
		// scope = "prototype"
		TestBean t6 = (TestBean) context.getBean("testBean4");
		System.out.println("t6: " + t6); // @6fd83fc1
		
		TestBean t7 = (TestBean) context.getBean("testBean4");
		System.out.println("t6: " + t7); // @4f2b503c
		
		TestBean t8 = (TestBean) context.getBean("testBean4");
		System.out.println("t8: " + t8); // @bae7dc0
		
	}

}
