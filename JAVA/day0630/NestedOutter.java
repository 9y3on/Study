package day0630;

/**
 * 중첩 클래스
 * @author user
 */
public class NestedOutter {
	
	int out_i; //인스턴스 변수
	static int out_j; //static 변수

	public void outInstanceMethod() { //인스턴스 메소드
		System.out.println("외부 클래스의 instance method");
	}
	
	public static void outStaticMethod() {
		System.out.println("외부 클래스의 static method");
	}
	
	////////////////////////static class 시작////////////////////////
	//nested class는 안 쪽을 static으로 만든다.
	static class Inner {
		//객체화 하지 않고 사용하기 위해 생성
		//int in_i; -> static 영역이지만 instance 변수임
		//public void inMethod() {}; -> static 영역이지만 instance method임
		
		static int in_i; //static 키워드를 붙여야 static 변수
		public static void inMethod() {
			//외부 클래스의 instance 영역은 직접 접근할 수 없다. (객체화 후 사용)
			//outInstanceMethod(); //불가!
			
			//외부 클래스의 static 변수나 method는 직접 접근 가능
			//클래스명 생략 가능
			outStaticMethod(); 
			System.out.println("내부 클래스의 static method");
		}//inMethod
	}//class
	////////////////////////static class 끄읏////////////////////////

	public static void main(String[] args) {
		//static 영역은 객체화하지않고 사용
		Inner.in_i = 100;
		Inner.inMethod(); //클래스가 다르므로 클래스명 명시

	}//main

}//class
