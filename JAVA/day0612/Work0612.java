package day0612;
class Work0612 {
	public static void main(String[] args) {
		
		// 문제 1번
		int temp1 = 10, temp2 = 20;
		System.out.println(++temp1 + temp2--); 
		// temp1은 전위 연산이므로 1이 먼저 증가한다. temp1 = 11
		// temp2는 후위 연산이므로 원래의 temp2 값인 20으로 + 연산 후 1이 감소한다. temp2 = 20
		// 즉, 11 + 20 = 31
		System.out.println("temp1 = " + temp1 + " / temp2 = " + temp2);
		// temp2는 후위 연산이므로 연산 후 1이 감소했으므로 10행에서는 19가 된다. temp1 = 11 / temp2 = 19 

		// 문제 2번
		int num = Integer.MAX_VALUE;
        int rowBit = num >> 15; // 최상위 부호비트가 0이기 때문에 최하위에 있는 비트 1을 남겨야 1111 1111이 성립, 15 이동
        // int highBit = num << 15; // 최상위 부호비트를 0으로 유지해야하므로 15 이동
        System.out.println(num & rowBit); // num & Character.MAX_VALUE   or   num & 0x0000FFFF   or   num & 65535

		// 문제 3번
		System.out.println(Integer.parseInt(args[0])>= 0 && Integer.parseInt(args[0]) <= 100 ? "입력성공" : "점수를 확인하세요.");

		// 문제 4번
		// 4로 나누어떨어지면서 100으로는 떨어지지않아야함. 하지만 예외적으로 400으로 나누어떨어지는 수는 윤년
		int year = Integer.parseInt(args[1]);
		System.out.println((year%4 == 0 && year%100 != 0) || year%400 == 0 ? year + "년 윤년" : year + "년 평년"); 

		int[] testData = {1900, 2000, 2001, 2002, 2003, 2004, 2020, 2024, 2100};
		int leapYear = 0;
		for(int i=0; i < testData.length ; i++) {
			leapYear = testData[i];
			System.out.println(leapYear + "년은 " + (((leapYear % 4 == 0 && leapYear % 100 != 0) || leapYear % 400 == 0) ? "윤년" : "평년"));
			// leapYear%4==0 && (leapYear%100 != 0 || leapYear%400 == 0)
			
		}
		
	}
}
