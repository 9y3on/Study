package day0621;

/**
 * 클래스가 실행되면 static 영역이 가장 처음 로드(적재)
 * @author user
 */
public class TestClass {
	static int i; //첫 번째로 로드 됨
	int j; //인스턴스 변수(member 변수)는 객체화 후 메모리에 생성
	int k; //같은 이름의 변수가 객체마다 생성

	public static void main(String[] args) { //두 번째로 로드 됨
		//static이 제일 먼저 생성 됨 (static 변수 생성 -> static method 실행)
		//heap 영역 = 객체가 생성되는 영역
		//method영역에는 [static] 변수와 메소드 
		//stack영역에는 [객체명, 객체의 주소, 지역변수, 지역변수의 값] 저장 됨(주소 = 번지수) 객체는 heap, 객체명은 stack
		//heap영역에는 [객체]가 저장 됨(new로 의해 생성) (인스턴스 변수)
		//parameter는 지역변수 - stack영역에 주소와 함께 저장! (args)
		//main method 안 - 지역 변수
		//method안에 있는 메소드 = stack영역에 저장되는 frame = method명 frame
		//static은 instance를 참조하지 못 함 -> static이 메모리에 제일 처음 진입하므로
		//지역변수는 호출될 때 메모리에 올라가고 호출이 끝나면 메모리에서 사라짐
		//parameter와 인스턴스 변수명이 다르면 구분 가능
		//
		
		
		//main method는 static과 같은 영역
		i=10; //같은 영역이므로 바로 사용 가능
	  //j=10; //객체화를 하지 않았으므로 메모리에 x -> main method에서 사용 불가
			  //인스턴스 변수를 사용할려면 객체화를 한 후 사용해야한다.
			  //class : 참조형 데이터형 -> 값은 메모리의 다른 곳(heap)에 저장되고 그 시작주소(stack)를 변수에 저장
		
		//method 영역에서 바로 heap 영역 접근 불가 -> stack 영역을 거쳐서 접근
		//참조형 데이터형 = 주소를 저장
		
		TestClass tc = new TestClass();  //new로 객체 생성 후 tc에 주소를 할당
		TestClass tc2 = new TestClass(); //new TestClass() - [객체] , tc2 - [객체명] 
										 //객체명은 객체를 쉽게 사용할 수 있도록 부여한 이름일 뿐 객체가 아님
		
		System.out.println(tc);
		System.out.println(tc2);
		System.out.println(args);
		
		
		

	}//main

}//class
