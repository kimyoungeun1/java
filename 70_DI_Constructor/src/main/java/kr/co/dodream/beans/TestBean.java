package kr.co.dodream.beans;

public class TestBean {

  private int data1;// 0
  private double data2;// 0.0
  private String data3;// null

  public TestBean() {
    System.out.println("TestBean의 기본 생성자...");
    
    this.data1 = 0;
    this.data2 = 0.0;
    this.data3 = null;    
  }
  //생성자 오버로딩, 클래스로부터 넘어온 매개변수의 데이터를 주입
  public TestBean(int data1) {
    System.out.println("TestBean의 기본 생성자...");
    
    this.data1 = data1;
    this.data2 = 0.0;
    this.data3 = null;    
  }
  
  
  
  
  public void printData() {
    System.out.println("data1: " + data1); 
    System.out.println("data2: " + data2);
    System.out.println("data3: " + data3);
  }
}
