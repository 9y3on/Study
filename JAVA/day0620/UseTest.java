package day0620;

public class UseTest {

	public static void main(String[] args) {
		//public인 변수는 클래스 외부에서 사용할 수 있다.
		Test t = new Test();
		
		//사람은 1~100살까지만 가능
		t.age = 99999; //외부에서 값을 넣으면 값에 대한 체크를 여러번 만들어야한다. -> public의 문제점
		if(!(t.age > 0 && t.age < 101)) { //변수의 값이 1~100 사이가 아니라면 1을 출력
			t.age = 1;
		}//end if
		System.out.println("나이 : " + t.age);

		t.age = 25;
		
		if(!(t.age > 0 && t.age < 101)) {
			t.age = 1;
		}//end if
		System.out.println("나이 : " + t.age);
		
		//-------------------------------------------------
		//private 사용 후 method를 이용하는 것이 편리
		
		t.setDay(33);
		System.out.println(t.getDay());

	}//main

}//class
