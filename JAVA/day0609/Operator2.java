package day0609;
/**
산술 연산자
+, -, *, /, %(나눈 나머지 : 큰 수를 지정한 몇 가지의 수로 만들 때 사용)
*/

class Operator2 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num + "을 2가지의 수 : " + num % 2); // 0, 1중 하나가 나온다.
		System.out.println(num + "을 3가지의 수 : " + num % 3); // 0, 1, 2 중 하나가 나온다.
		System.out.println(num + "을 4가지의 수 : " + num % 4); // 0, 1, 2, 3 중 하나가 나온다.

		int birth = 1999;
		System.out.println(birth + "년 " + birth%12);
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 중 하나가 나온다. (12로 나눴으니까)

	}
}
