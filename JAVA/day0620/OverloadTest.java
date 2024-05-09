package day0620;

public class OverloadTest {
	//메소드 오버로딩 : method명은 같고 매개변수의 데이터형이나 개수를 다르게 생성
	//(변수명이 아니라 데이터형!이 중요)

	//호출하면 *을 하나 출력하는 method
	/**
	 * 별을 하나 출력하는 일
	 */
	public void printStar() {
		System.out.println("★");
	}//printStar
	
	//호출하면 *을 입력되는 개수만큼 method
	/**
	 * 입력하는 수만큼의 별을 출력하는 일
	 * @param cnt (출력할 별의 개수)
	 */
	public void printStar(int cnt) {
		for(int i = 0; i < cnt ; i++) {
			System.out.print("☆");
		}//end for
	}//printStar
	
	public static void main(String[] args) {

		OverloadTest ot = new OverloadTest();
		
		ot.printStar(4); //오버로딩이므로 값을 입력하지 않으면 첫 번째 메소드로, 입력하면 두 번째 메소드로 자동실행
		
		
	}//main

}//class
