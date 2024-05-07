package day0607;
//1. 소스코드 작성
// 콘솔에 출력하는 일을 하는 자바 소스코드 작성
class UsePrintMethod {

	public static void main(String[] args){

		//System.out.print("안녕");
		//System.out.print("하세요?");
		System.out.println("---------------상수 출력---------------");
		System.out.println(2023); //정수 상수
		System.out.println(2023.06); //실수 상수
		System.out.println(true); //불린 상수
		System.out.println('A'); //문자 상수
		System.out.println("2023년 6월 7일"); //문자열 상수
		System.out.println("-------------연산결과 출력-------------");
		System.out.println(6+7);
		System.out.println("6+7 = " + (6+7));

	}

} //class

//2. 저장 UsePrintMethod.java

//3. 컴파일 javac UsePrintMethod.java

//4. 실행 java UsePrintMethode