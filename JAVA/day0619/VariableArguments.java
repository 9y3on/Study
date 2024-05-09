package day0619;

public class VariableArguments {

	//1. method 선언
	//variable arguments는 배열 형태로 변환됨
	//즉, 배열로 처리되므로 참조형 데이터형이고 주소가 출력된다.
	public void useVariableArgs(int ... param) {
		//System.out.println(param);
		for(int i=0; i < param.length ; i++) {
			System.out.println(param[i]); //변수에는 주소가 저장되어 출력되므로 배열에 직접 접근
		}//end for
	}//useVariableArgs
	
	public void useVariableArgs2(int j, char c, int ... param) {
		System.out.println("int:" + j + ", char:" + c);
		for(int i=0; i < param.length ; i++) {
			System.out.println(param[i]); //변수에는 주소가 저장되어 출력되므로 배열에 직접 접근
		}//end for		
	}//useVariableArgs2
	
	//V.A는 매개변수를 정의할 때 가장 마지막에만 정의할 수 있다. : Err
//	public void useVariableArgs3(int j, int ... param, char c) {
//	
//	}
	
	public static void main(String[] args) {
		//일반적인 method는 호출 시 정의된 method의 parameter 개수와 데이터형이 method와 일치해야한다.
		//ex. int maxNume(int i, int j) -> 호출 시 객체명.maxNum(10,20) -> 개수와 데이터형이 일치
		//가변인수는 데이터형만 같다면 파라미터의 개수는 상관없다. 아예 안 넣어도 되고 여러개를 넣어도 됨
		
		//2. 객체 생성
		VariableArguments va = new VariableArguments();
		
		//3. method 호출
		va.useVariableArgs(1,2,3,4,5,6);
		System.out.println("--------------------------");
		
		//일반 parameter는 값을 반드시 입력해야하고, Variable arguments는 생략 가능
		va.useVariableArgs2(2023, 'A');
		va.useVariableArgs2(2023, 'B', 2023, 6, 19, 12, 30);
	}//main

}//class
