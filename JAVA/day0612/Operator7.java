package day0612;
/**
대입연산자
= 순수대입
+=, -=, *=, /=, %= 산술대입 : 연산된 결과로 변수의 값을 변경
*/

class Operator7 {
	public static void main(String[] args) {
		int i = 2; // 순수대입
		i += 21;   // 산술대입 i = i+21
		i -= 10;   // i = i - 10;
		i *= 2;	   // i = i * 2;
		i /= 5;	   // i = i / 5; -> 정수/정수 = 정수
		i %= 2;	   // i = i % 2;

		// 쉬프트대입
		i <<= 5;   // i = i << 5;
		i >>= 2;   // i = i >> 2;
		i >>>= 1;  // i = i >>> 1;

		// 비트논리대입
		i &= 12;   // i = i & 12;
		i |= 20;   // i = i | 20;
		i ^= 15;   // i = i ^ 15; (15 = 0xF)

		System.out.println( i );

		// method : class가 할 수 있는 일

		int j = 25;
		System.out.println( j + "를 2진수로 " + Integer.toBinaryString(j));
		System.out.println( j + "를 8진수로 " + Integer.toOctalString(j));
		System.out.println( j + "를 16진수로 " + Integer.toHexString(j));

	} //main
} //class
