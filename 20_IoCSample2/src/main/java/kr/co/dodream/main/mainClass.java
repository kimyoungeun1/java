package kr.co.dodream.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.dodream.beans.addDAO;

//DI의 적용 예제
public class mainClass {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/co/dodream/config/beans.xml");
		
		Scanner sc = new Scanner(System.in);
		//addDAO dao = new addDAO();
		System.out.println("덧셈1 숫자 입력");
		int x = sc.nextInt();
		System.out.println("덧셈2 숫자 입력");
		int y = sc.nextInt();
		
		addDAO dao = (addDAO) context.getBean("aDAO");
				
		int sum = dao.addTwoNumber(x, y);
		System.out.println("덧셈의 결과: " + sum); 	
		
	}

}
