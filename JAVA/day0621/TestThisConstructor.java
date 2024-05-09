package day0621;

/**
 * 생성자에서 다른 생성자를 호출할 때 사용하는 this <br>
 * - 생성자의 첫번째 줄에서만 사용할 수 있다.
 * @author user
 */
public class TestThisConstructor {
	
	public TestThisConstructor() {
		//this(2,3); //재귀호출 기본생성자 호출 -> 인수 2개인 생성자 호출 -> 
					 //다시 기본생성자 호출 -> ... 반복 -> 프로그램이 안 끝남
		this(2);	 //인수가 1개인 생성자 호출
		System.out.println("기본생성자");
	}//TestThisConstructor
	
	public TestThisConstructor(int i) {
		System.out.println("i를 받는 생성자");
	}//TestThisConstructor

	//매개변수 2개인 생성자는 기본생성자가 먼저 일을 한 후 그 다음으로 일을 해야한다.
	//생성자는 직접 호출 불가, new를 통해서만
	public TestThisConstructor(int i, int j) {
		//new TestThisConstructor(); //기본 생성자 호출 => 객체가 생성됨 => 객체가 2개가 됨 
								     //(처음 호출했을 때 객체, 기본생성자 호출했을 때 객체 = 총 2개)
		this(); //객체는 하나만 생성되며, 다른 생성자를 호출하여 일을 수행한다.
				//기본 생성자 호출, 호출 후 다시 돌아와서 남은 코드 실행
				//this는 생성자의 첫번째 줄에서만 사용가능
				
		System.out.println("i와 j를 받는 생성자");
	}//TestThisConstructor

	public static void main(String[] args) {
		//TestThisConstructor ttc = new TestThisConstructor(); 
		//객체의 기능(메소드)을 사용하지 않는다면 굳이 객체명을 가질 필요가 없음.
		//현재 이 클래스는 생성자만 있으므로 기능x
		new TestThisConstructor(0,0); //-> 객체명을 가질 필요가 없으므로 생성자만 기술해도 됨 

	}

}
