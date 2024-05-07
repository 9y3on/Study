package day0609;
/**
쉬프트 연산자
<< (left shift)
>> (right shift)
>>> (unsigned shift)
*/

class Operator3 {
	public static void main(String[] args) {
		// << (left shift) : 비트를 왼쪽으로 밀고, 빈 칸을 항상 0으로 채운다.
		int i = 20;
		System.out.println(i + " << 2 = " + (i << 2)); // 연산은 괄호

		i = 5;
		System.out.println(i + " << 4 = " + (i << 4));

		i = 1 ;
		System.out.println(i + " << 31 = " + (i << 31)); // 최대로 밀 수 있는 수 31

		// >> (right shift) : 비트를 오른쪽으로 밀고, 빈 칸을 최상위 부호 비트로 채운다. 
		i = 35;
		System.out.println(i + " >> 2 = " + (i >> 2));

		i = -1;
		System.out.println(i + " >> 100 = " + (i >> 100)); // -1은 몇 번을 밀어도 -1

		// >> (unsigned right shift) : 비트를 오른쪽으로 밀고, 빈 칸을 항상 0으로 채운다. 
		i = 35;
		System.out.println(i + " >>> 2 = " + (i >>> 2));

		i = 40;
		System.out.println(i + " >>> 1 = " + (i >>> 1));

		i = -1;
		System.out.println(i + " >>> 1 = " + (i >>> 1)); // 1111 1111 >>> 1 = 0111 1111

		// 문자열은 연산되지 않는다. error
		// System.out.println("10"*10);
		// 문자열은 +를 사용하여 문자열 앞뒤에 값을 붙일 수 있다.

	}
}
