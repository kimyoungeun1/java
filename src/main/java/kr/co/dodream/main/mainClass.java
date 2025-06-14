package kr.co.dodream.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import kr.co.dodream.beans.TestBean;

public class mainClass {

	public static void main(String[] args) {
		// XML 방식, new : 메모리에 생성한 객체를 할당하는 역할을 하는 연산자.
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("kr/co/dodream/config/beans.xml");
		
		/* singleton 방식 처리: 같은 주소를 공유하여 처리
		 * prototype : 서로 다른 주소를 처리 
		 * 
		 */
		TestBean tBean = (TestBean) appContext.getBean("tb1");
		System.out.println(tBean);// memory address => @741a8937
		
		ClassPathResource appContext2 = new ClassPathResource("kr/co/dodream/config/beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(appContext2);
		
		TestBean tBean2 = (TestBean) appContext.getBean("tb1");
		System.out.println(tBean2);// memory address => @741a8937
		
		TestBean tBean3 = (TestBean) appContext.getBean("tb2");
		System.out.println(tBean3);// memory address => @5b03b9fe
		
		TestBean tBean4 = (TestBean) appContext.getBean("tb2");
		tBean4.add(100, 500);
		
		System.out.println(tBean4);// memory address => @5b03b9fe
		
		
		appContext.close();
	}

}
