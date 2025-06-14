package kr.co.dodream.beans;

public class TestBean3 {

	// 같은 주소값을 가지는 중복 데이터 입력 불가.
	private int data7;
	private double data8;
	private String data9;
	
	public TestBean3(int data7, double data8, String data9) {
		this.data7 = data7;	
		this.data8 = data8;
		this.data9 = data9;
	}
	
	
	public int getData7() {
		return data7;
	}
	public void setData7(int data7) {
		this.data7 = data7;
	}
	public double getData8() {
		return data8;
	}
	public void setData8(double data8) {
		this.data8 = data8;
	}
	public String getData9() {
		return data9;
	}
	public void setData9(String data9) {
		this.data9 = data9;
	}
	
	

	
}
