package kr.co.dodream.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import kr.co.dodream.beans.TestBean;
import kr.co.dodream.beans.TestBean2;
import kr.co.dodream.beans.TestBean3;
import kr.co.dodream.beans.TestBean4;

public class mainClass {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/co/dodream/config/beans.xml");
		// list : String
		TestBean t1 = (TestBean) context.getBean("tb1", TestBean.class);//약결합 형식 이용.		
		List<String> list1 = t1.getList1();
		
		for(String str : list1) {
			System.out.println("list1: " + str);
		}
		// list  : integer	
		TestBean2 t2 = (TestBean2) context.getBean("tb2", TestBean2.class);//약결합 형식 이용.		
		List<Integer> list2 = t2.getList2();
		
		for(Integer str : list2) {
			System.out.println("list2: " + str);
		}

		// Set : String, Integer, double
		TestBean3 t3 = (TestBean3) context.getBean("tb3", TestBean3.class);//약결합 형식 이용.		
		
		Set<String> s1 = t3.getSet1();
		Set<Integer> s2 = t3.getSet2();
		Set<Double> s3 = t3.getSet3();
		
		for(String str : s1) {
			System.out.println("Set1: " + str);
		}
		
		for(Integer i : s2) {
			System.out.println("Set2: " + i);
		}
		
		for(double d : s3) {
			System.out.println("Set3: " + d);
		}
		
		// Map 구조 테스트
		TestBean4 t4 = (TestBean4) context.getBean("tb4", TestBean4.class);//약결합 형식 이용.		
		
		Map<String, Object> map1 = t4.getMap1();
		
		String string = (String) map1.get("a1");
		int i = (Integer) map1.get("a2");
		double d = (double) map1.get("a3");
		
		System.out.println("map1.a1: " + string);//
		System.out.println("map1.a2: " + i);
		System.out.println("map1.a3: " + d);	
		
		
		context.close();
		
	}

}
