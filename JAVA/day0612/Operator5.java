package day0612;
/**
논리 연산자
- 일반 논리
   &&(AND) : 전항과 후항 모두 TRUE일 때만 TRUE 반환 
   ||(OR) : 전항과 후항 모두 FALSE일 때만 FALSE 반환
- 비트 논리
   &(AND) : 상위 비트와 하위 비트 모두 1인 경우 1내림
   |
*/

class Operator5 {
	public static void main(String[] args) {
		// 변수의 값이 unsigned 8진수 범위인지? (0~7)
		int i = 7;
		System.out.println( i + "는 8진수의 범위 ? " + (i > -1 && i < 8));
		boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;
		System.out.println("---------------------&&(AND)--------------------");
		System.out.println(flag1 + " && " + flag3 + " = " + (flag1 && flag3)); // T && T = T
		System.out.println(flag1 + " && " + flag2 + " = " + (flag1 && flag2)); // T && F = F
		System.out.println(flag2 + " && " + flag1 + " = " + (flag2 && flag1)); // F && T = F
		System.out.println(flag2 + " && " + flag4 + " = " + (flag2 && flag4)); // F && F = F

		System.out.println("---------------------||(OR)---------------------");
		int day = 19;
		boolean flag = day == 5 || day == 12 || day == 19 || day == 26;
		// 6월에 월요일(5, 12, 19, 26)이면 true를 그렇지 않으면 false 출력
		System.out.println("6월 " + day + "일은 월요일인가? " + flag);
		System.out.println(flag1 + " || " + flag3 + " = " + (flag1 || flag3)); // T || T = T
		System.out.println(flag1 + " || " + flag2 + " = " + (flag1 || flag2)); // T || F = T
		System.out.println(flag2 + " || " + flag1 + " = " + (flag2 || flag1)); // F || T = T
		System.out.println(flag2 + " || " + flag4 + " = " + (flag2 || flag4)); // F || F = F

		// &&는 전항이 false이면 후항을 연산하지 않는다.
		// ||는 전항이 true이면 후항을 연산하지 않는다.
		int num1 = 6, num2 = 12, num3 = 2023;
		flag1 = false;
		flag2 = false;
		boolean resultFlag = (flag1 = num1 > num2) && (flag2 = num2 < num3);
		System.out.println("falg1 : " + flag1 + ", flag2 : " + flag2 + ", resultFlag : " + resultFlag);

		System.out.println("------------------비트 논리 연산-----------------");
		num1 = 39;
		num2 = 0xF;
		System.out.println(num1 + " & " + num2 + " = " + (num1 & num2));
		// 0010 0111 & 0000 1111 = 0000 0111

		num1 = 25;
		num2 = 19;
		System.out.println(num1 + " | " + num2 + " = " + (num1 | num2));
		// 0001 1001 | 0001 0011 = 0001 1011

		num1 = 30;
		num2 = 12;
		System.out.println(num1 + " ^ " + num2 + " = " + (num1 ^ num2));
		// 0001 1110 ^ 0000 1100 = 0001 0010
	}// main
}// class
