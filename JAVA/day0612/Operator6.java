package day0612;
/*
삼항(조건) 연산자
연산식 ? 항1 : 항2
*/

class Operator6 {
	public static void main(String[] args) {
		int age = 19;
		System.out.println(age + "살은 " + ( age < 20 ? "아이" : "어른"));

		// 6월에 퇼은 3, 4, 10, 11, 17, 18, 24, 25일이다.
		// 일자를 저장하는 변수를 만들고, 일자와 퇼인지 평일인지를 출력하는 코드를 작성
		int day = 13;
		System.out.println(day + "일은 " + (day == 3 || day == 4 || day == 11 ||
														day == 17 || day == 18 || day == 24 || day == 25 ? "퇼" : "평일") + "입니다.");

		// 임의의 정수값을 저장하는 변수를 만들고, 변수에 할당된 값이 양수인지, 음수인지를 출력하는 코드를 작성
		int num = 2;
		System.out.println(num + "값은 " + (num >= 0 ? "양수" : "음수"));

		// 위의 수가 홀수인지 짝수인지 출력하는 코드를 작성
		System.out.println(num + "값은 " + (num % 2 == 0 ? "짝수" : "홀수"));

	}// main
}// class
