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

	@Bean(initMethod = "Java_init", destroyMethod = "Java_destory") // call by Name : byName 
	@Lazy
	public TestBean java1() {
		TestBean t1 = new TestBean();
		System.out.println("1.뭉쳐야찬다2");
		return t1;
	}
	
}
