package day0627;

public class OverrideSuper {
	int super_i;
	
	//final은 오버라이딩 불가 -> 자식 클래스에서 err
	public /*final*/ void print() {
		System.out.println("부모 super_i : " + super_i);
	}
	
	//private는 자식 클래스도 접근x 오버라이딩 불가
	//접근지정자 연습
	protected void overTest() {
		
	}
	

}
