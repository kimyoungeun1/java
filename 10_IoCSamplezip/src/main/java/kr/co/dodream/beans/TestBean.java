package kr.co.dodream.beans;

public class TestBean {

	// default constructor : 데이터 초기화, 리셋
	public TestBean() {
		System.out.println("TestBean의 생성자...");
	}
	
	public void add(int x, int y) {
		int sum = x + y;
		System.out.println("두수의 합계: " + sum); 
	}
	
	
}
