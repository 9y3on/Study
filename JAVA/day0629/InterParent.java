package day0629;

/**
 * 인터페이스는 상수와 추상 메소드로 이루어져있다.
 * @author user
 */
public interface InterParent {

	//int i; //인터페이스는 일반 변수x
	//instance 변수를 선언할 수 없다.
	
//	public InterParent() {
//		인터페이스는 생성자를 선언할 수 없다.
//		-> 객체화 불가
//	}
	
//	public void test() {
//		인터페이스는 일반 메소드를 선언할 수 없다.
//		-> 일을 할 수 없음
//	}
	
	public static final int VALUE = 10;

	//인터페이스에서는 추상 메소드만 선언할 수 있으므로
	//abstract 키워드가 없어도 자동으로 추상 메소드 처리가 됨
	public void test(); //abstract이 없어도 abstract method
	public abstract int test(String str);
	
	//default method는 JDK 1.8에서부터 추가 됨
	public default String msg() {
		String msg = "오늘은 목요일 입니다.";
		return msg;
	}

}
