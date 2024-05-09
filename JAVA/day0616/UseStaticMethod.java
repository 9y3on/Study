package day0616;

/**
 * static method <br>
 * - instance variable의 값을 사용하지 않고, 입력된 값으로만 업무처리를 하는 메소드 
 * @author user
 */
public class UseStaticMethod {
	
	public static void printHelloMsg() {
		System.out.println("안녕하세요? 오늘은 금요일입니다.");
		System.out.println("내일은 쉽니다. 포항항항항 ^ㅇ^");
	}
	
	public static void main(String[] args) {
		//static method는 객체화 없이(=instance변수를 사용하지않으므로) 클래스명.method명으로 호출
		UseStaticMethod.printHelloMsg();
		printHelloMsg(); //static은 클래스명 생략가능
	}//main

}//class
