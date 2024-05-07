package day0609;
/*
외부 클래스에 존재하는 Constant 사용
*/

class UseConstant {
	public static void main(String[] args) {
		// System.out.println(MAX_SCORE); - MAX_SCORE가 외부클래스에 있음
		// Constant를 가지고 있는 클래스를 명시하여 사용
		System.out.println(CreateConstant.MAX_SCORE); // ctrl 누르고 있으면 해당 상수가 있는 클래스로 이동 가능
		System.out.println("byte의 최고값 : " + Byte.MAX_VALUE);
		System.out.println("byte의 최고값 : " + Byte.MIN_VALUE);
	}//main
}//class
