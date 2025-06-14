package kr.co.dodream.beans;

public class TestBean {

  // 1.생성자
  public TestBean() {
    int x=200, y=300, sum=0;
    sum = x + y;
    System.out.println("TestBean의 생성자...");
    System.out.println("덧셈의 결과: " + sum);
  } 
  //2.bean_init()
  public void bean_init() {
    System.out.println("TestBean의 init method()...");
  }
  
  //3.  여기는 알고리즘 구현 부분등.....
  public void multy() {
    int sum = 25 * 25;
    System.out.println("곱셈의 결과: " + sum); 
  }
    
  //4.bean_destroy()
  public void bean_destroy() {
    System.out.println("TestBean의 destroy method()...");
  }
  
}
