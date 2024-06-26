package day0609;
/**
코딩 창에서 다양한 진수 사용해보기
*/

class TestRadix {
	public static void main(String[] args) {
		int i = 12;	// 10진수 : 10진수의 12
		int j = 012; // 8진수 : 8진수의 12
		int k = 0xA; // 16진수 : 16진수의 0xA

		// java는 어떤 수든 10진수로 바꿔서 출력
		System.out.println(i + " / " + j + " / " + k);
		// 서로 다른 진수는 연산이 될까? 된다. (이진수로 저장되어 연산된 후 10진수로 출력)
		System.out.println(i + j + k);
	} // main
}// class
