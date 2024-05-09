package day0616;

/**
 * static(class) variable의 사용 <br>
 * 객체화없이 클래스명. 변수명으로 클래스의 모든 영역에서 사용할 수 있는 변수 <br>
 * 1.선언 - 자동초기화 <br>
 * -> 접근지정자 static 데이터형 변수명;<br>
 * 2.값 할당 <br>
 * -> 클래스명.변수명 = 값;<br>
 * 3.값 사용 <br>
 * -> 클래스명.변수명
 * @author user
 */
public class UseStaticVariable {
	//class field 영역 : 변수 선언, method의 정의만 기술 가능 (할당,사용 불가!)
	
	//1.선언 - static변수는 하나만 생성되고 사용된다. (공용 변수, 모든 객체가 하나의 변수를 사용)
	//값을 변경하면 변경된 값을 계속 사용하게된다.
	public static int age;
	static int year; //접근지정자 생략(default)
	
	public void test() { //static변수는 static이 붙어있지않은 instance 영역에서도 사용가능
		age=20;
		System.out.println("test영역 " + age + " / " + year);
	}
	
	public static void main(String[] args) {
		//영역이 달라도 사용 가능
		UseStaticVariable usv = new UseStaticVariable();
		usv.test(); //다른 영역 호출
		
//		//2.값 할당
//		UseStaticVariable.age = 10;
//		year = 2023; //클래스명 생략 가능(같은 static 영역이므로 객체 생성x)
		
		//3.값 사용
		System.out.println("나이 : " + age + ", 올해 : " + UseStaticVariable.year);
		
		//공용의 특징 (모든 객체가 하나의 변수를 사용)
		//클래스명 객체명 = new 클래스명();
		
		UseStaticVariable usv2 = new UseStaticVariable();
		UseStaticVariable usv3 = new UseStaticVariable();
		
		//usv2객체와 usv3객체는 같은 static 변수를 사용한다.
		//**static 변수는 특정 객체에 속해있는 변수가 아니다.** 
		//->> 객체명.변수명 - 사용은 되나 올바른 표현x (우리집 전화번호=O, 내집 전화번호=X)
		usv2.year = 2024; //특정 객체 usv2의 year변수를 값 변경 했는데
		System.out.println("usv2.객체의 year : " + usv2.year);
		System.out.println("usv3.객체의 year : " + usv3.year); //usv3까지 함께 변경된다. -> 공용 변수이므로
	}

}
