package day0613;

/**
 * 단일 if문 사용 <br>
 * 조건에 맞을 때에만 코드를 실행해야할 때 <br>
 * 문법 -- <br>
 * if(조건식) { <br>
 *  조건에 맞을 때 수행할 문장들... <br>
 * }
 * @author user
 */
public class UseIf {

	public static void main(String[] args) {
		//매개변수로 입력된 수의 절대값
		//arguments 입력 -> run configurations - arguments 탭
		int num = Integer.parseInt(args[0]); //반드시 실행
		System.out.print(num + "의 절대값은 "); //반드시 실행
		
		//단일if	
		if(num < 0) {
			num = -num; //상황에 따라 실행	
		}//end if
		
		System.out.println(num + "입니다."); //반드시 실행
		
		
		//char형의 변수를 만들고 임의의 문자를 넣는다.
		//입력 된 문자가 대문자, 소문자인 경우에만 해당 문자를 출력하는 코드를 작성.
		char inputChar = '가';
		if((inputChar > 64 && inputChar < 91) || (inputChar > 96 && inputChar < 123)) //A(65), Z(90), a(97), z(122)
			System.out.println(inputChar);
		
		// int형의 변수를 만들고 임의의 숫자를 할당한다.
		// 입력된 숫자가 0~100 사이인 경우에만 
		// 과락 - 40점 이하
		// 다른 과목 참조 - 60점 미만
		// 합격을 출력한다. - 60점 이상
		
		int inputInt = 101;
		if(inputInt > -1 && inputInt < 101) {
			if(inputInt < 40)
				System.out.println("과락");
			if(inputInt < 60 && inputInt > 39)
				System.out.println("다른 과목 참조");
			if(inputInt > 59)
				System.out.println("합격");
		}
		
		// src - new - package
	
	}//main

}//class
