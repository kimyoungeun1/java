package kr.co.dodream.beans;

public class TestBean {

	public TestBean() {
		int x=200, y=300, sum=0;
		sum = x + y;
		System.out.println("TestBean의 생성자...");
		System.out.println("덧셈의 결과: " + sum);
	} 
}
