package kr.co.dodream.beans;

public class TestBean2 {

	// 1.생성자
	public TestBean2() {
		int x=200, y=300, sum=0;
		sum = x + y;
		System.out.println("TestBean2의 생성자...");
		System.out.println("덧셈의 결과: " + sum);
	} 
	//2.default_init()
	public void default_init() {
		System.out.println("TestBean2의 dafault_init method()...");
	}
	
	//3.  여기는 알고리즘 구현 부분등.....
	public void multy() {
		int sum = 25 * 25;
		System.out.println("곱셈의 결과: " + sum); 
	}
		
	//4.default_destroy()
	public void default_destroy() {
		System.out.println("TestBean2의 default_destroy method()...");
	}
	
}
