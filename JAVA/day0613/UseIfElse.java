package day0613;

/**
 * if~else <br>
 * 둘 중 하나의 코드를 실행하기 위해
 * @author user
 */
public class UseIfElse {

	public static void main(String[] args) {
		//입력값을 받아 홀수인지 짝수인지 판단하는 코드
		int num = Integer.parseInt(args[0]);
		
		System.out.print(num + "은(는) ");
		
		if(num%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}//end else
		
		//arguments Java, C, Python이 입력되었을 때에만 동작하는 코드 작성
		//입력값이 "Java" 라면 1995를 그렇지 않다면 1991을 변수에 넣고
		//변수값을 출력

		int year = 0;
			
		if(args[1].equals("Java") || args[1].equals("C") || args[1].equals("Python")) {
			if(args[1].equals("Java"))
				year = 1995;
			else
				year = 1991;
			
			System.out.println(args[1] + "언어는 " + year + "년도 출시");
		}
		
	}//main

}//class
