package kr.co.dodream.processor;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor {

	// init-method 호출전
		public Object postProcessBeforeInitialization(Object bean, String beanName) {

			System.out.println("before : ~전에");
			int sum,sum2;
			
			switch (beanName) {
			case "t1" : sum = 100 + 200;
				System.out.println("덧셈의 합계: " + sum); break;
			case "t2" : sum2 = 100 - 200;
				System.out.println("뺄셈의 합계: " + sum2); break; 
			default:
				System.out.println("tb1,tb2 객체가 아니므로 연산하지 않습니다.");
				break;
			}			
			
			return bean;
		}

		// destroy-method 호출후

		public Object postProcessAfterInitialization(Object bean, String beanName) {

			System.out.println("after : ~이후에");
			
			return bean;
		}
	
	
}
