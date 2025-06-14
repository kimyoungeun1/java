package kr.co.dodream.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.dodream.beans.TestBean;
import kr.co.dodream.beans.TestBean2;

@Configuration // beans.xml
public class BeanConfiguration {

	@Bean
	public TestBean java1() {
		TestBean t1 = new TestBean();
		System.out.println("1.aaa");
		return t1;
	}
	
	@Bean
	@Lazy
	public TestBean java2() {
		TestBean t1 = new TestBean();
		System.out.println("2.bbb");
		return t1;
	}
	
	@Bean(name = "java500") //call byName
	public TestBean java3() {
		TestBean t1 = new TestBean();
		System.out.println("나야 나~~~");
		return t1;
	}
	
	@Bean
	@Lazy
	@Scope("prototype")
	//@Scope : singleton으로 동작합니다.
	public TestBean2 java4() {
		TestBean2 t1 = new TestBean2();
		System.out.println("3.ccc");
		return t1;
	}
	
	@Bean
	@Lazy
	@Primary
	public TestBean java222() {
		TestBean t1 = new TestBean();
		System.out.println("4.ddd...");
		return t1;
	}
	
}
