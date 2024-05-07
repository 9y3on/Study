package day0608;
/**
	기본형 데이터 형 : 선언한 변수 자체에 값을 저장하는 데이터형
*/

class  UsePrimitiveType {
	public static void main(String[] args) {
		///// 정수형 데이터형 /////
		byte a = 10;	// byte : -128 ~ +127
		short b = 20;	// short : 약 30,000 정도의 값
		int c = 30;		// int : 약 21억 정도의 값
		long d = 40;	// long : 21억을 초과하는 값
		System.out.println("정수형 byte : " + a + ", short : " + b + ", int : " + c + ", long : " + d);

		// 아파트 가격을 저장하는 변수를 선언하고 54억을 입력하여 출력
		long apartPrice = 5400000000l; //형 명시 : literal이 4byte에서 8byte로 확장
		System.out.println("강남 아파트 가격은? " + apartPrice);

		///// 문자형 데이터형 /////
		//char e = 65; //unicode값에 해당하는 10진수를 할당할 수 있다.
		char e = '\uffff'; //unicode를 직접 사용할 수 있다.
		char f = '0';
		char g = '가';
		System.out.println("char : " + e + ", " + f + ", " + g);

		///// 실수형 데이터형 /////
		// float h = 6.8; ERR(리터럴이 float보다 커서 할당할 수 없음)
		//실수형 형명시 - f,F,d,D
		float h = 6.08f; // float은 실수 literal보다 작기 때문에 형명시 필수, float은 형명시 무조건~!
		double i = 2023.0608; //형 명시 생략
		double j = 2023.0608D; //형 명시 정의
		System.out.println("실수형 float : " + h + ", double : " + i + ", " + j);

		///// 불린형 데이터형 /////
		boolean k = true;
		boolean l = false;
		System.out.println("불린형 : " + k + ", " + l );

		///// 자동 형 변환(promotion) /////
		byte num1 = 10, num2 = 20;
		int result = num1+num2; // 연산 결과가 int에 저장되었기 때문에 err (promotion) -> int로 변경
		System.out.println(num1 + " + " + num2 + " = " + result);

		char c1 = 'A', c2 = 'B';
		int result2 = c1 + c2; 
		System.out.println(result2);

	} //main
} //class
