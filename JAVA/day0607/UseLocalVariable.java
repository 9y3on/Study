package day0607;
//1. 소스코드 작성
// 지역 변수를 사용하는 일을 하는 자바 소스코드 작성
class UseLocalVariable {
	//int i; // instance variable
	//static int j; // static variable

	public static void main(String[] args){
		//지역변수 영역
		//int k; // local variable

		int i;    		 //1. 변수의 선언
		i=2023; 		 //2. 값 할당
		System.out.println(i); //3. 변수의 사용

		i=6;
		System.out.println(i); //값 재할당 

		int j; 		//변수의 이름이 다르다면 몇 개의 변수든 선언 가능
		j = 8;
		System.out.println(j);

		//같은 이름의 변수는 데이터형과 상관없이 선언할 수 없다.

		//지역변수는 자동초기화가 되지 않는다. (초기화하지 않은 변수 사용시 error 발생)
		//int k;
		//System.out.println(k);

		//지역변수의 초기화 (default value)
		//데이터형 변수명 = 값;

		int k = 10;
		System.out.println(k);

	}//main

} //class

//2. 저장 UseLocalVariable.java

//3. 컴파일 javac UseLocalVariable.java

//4. 실행 java UseLocalVariable