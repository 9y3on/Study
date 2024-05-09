package day0616;

/**
 * instance variable, static variable는 선언하면 기본값을 가진다.
 * @author user
 */
public class TestDefaultValue {
	
	//기본형 데이터형
	int a; // 0
	char b; // \u0000 - unicode 0
	double c; // 0.0
	boolean d; // false

	//참조형 데이터형
	TestDefaultValue tdv; // null	class 변수
	String s; //문자열 // null
	int[] arr; //배열 // null
	
	public static void main(String[] args) {
		//객체 생성 - 인스턴스 변수가 생성됨. 초기값을 가진다. 
		//(인스턴스 - 객체마다 변수를 다르게 해야할 때
		TestDefaultValue test = new TestDefaultValue();
		System.out.println("정수형 : " + test.a); // 0
		System.out.println("문자형 : [" + test.b + "]"); // \u0000 = 이 유니코드에 대응되는 문자가 없으므로 공백 출력
		System.out.println("실수형 : " + test.c); // 0.0
		System.out.println("불린형 : " + test.d); // false
		
		System.out.println("참조형-클래스 : " + test.tdv);  // null
		System.out.println("참조형-String : " + test.s);  // null
		System.out.println("참조형-array : " + test.arr); // null
	}//main

}//class
