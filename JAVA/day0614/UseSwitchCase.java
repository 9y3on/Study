package day0614;

/**
 * 일치하는 정수를 비교할 때 사용하는 switch~case
 * @author user
 */
public class UseSwitchCase {

	public static void main(String[] args) {
		int i = 3;
		//break : for, while, switch~case 안에서만 사용 가능
		//break는 실행을 멈추고 빠져나갈 때 사용
		
		switch (i) {//일치하는 case를 찾고 순차적인 흐름을 가진다. 또한 조건에 맞지않는 case는 건너뜀
		case 0:
			System.out.println("영");
		case 1:
			System.out.println("일");
		case 2:
			System.out.println("이"); break; //필요에 따라 사용
		case 3:
			System.out.println("삼");
		default: 
			System.out.println("해당 case 없음");
		}
		
		int key = 'A'; //byte,short,int,char를 받을 수 있다.(추후 String 가능) char = 0 -> 48, 1 -> 49 
		switch (key) { 
		//case의 상수는 입력되는 데이터형이 범위까지만 사용할 수 있다.
		case 65: //char는 유니코드도 되고 문자도 가능(65 or 'A')
			System.out.println("값0");
			break;
		case 1:
			System.out.println("값1");
			break;
		case 2:
			System.out.println("값2");
			break;
		default:
			System.out.println("해당 case 없음");
			break;
		}//end switch
		
		String s = "Java"; //Java compiler가 JDK1.7이상 부터 사용가능
		switch (s) {
		case "Java":
			System.out.println("WORA 완벽한 OOP언어");
			break;
		case "Oracle":
			System.out.println("대용량 DBMS");
			break;
		}//end switch
		
	}//main

}//class
