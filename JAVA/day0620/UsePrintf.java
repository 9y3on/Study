package day0620;

public class UsePrintf {

	public static void main(String[] args) {

		int age = 25;
		int year = 2023;
		//올해는 2023년 내 나이는 25세 출력
		//println은 출력 메시지와 출력 값이 섞이게 된다. 메시지 + 값 + 메시지 + 값..
		System.out.println("[println] 올해는 " + year + "년, 내 나이는 " + age + "세");
		//printf와 format은 출력 메시지와 출력 값이 구분된다.
		System.out.printf("[printf]  올해는 %d년, 내 나이는 %d세\n", year, age);
		System.out.format("[format]  올해는 %d년, 내 나이는 %d세\n", year, age);
		//6칸 잡고 변수 출력
		System.out.printf("[%d][%6d][%-6d]\n",year,year,year);
		
		char c = 'A';
		System.out.printf("[%c][%5c][%-5c]\n",c,c,c);
		
		//float f = 1.12345f; //형 명시
		double d = 2023.619;
		System.out.printf("[%f][%8.1f][%-8.1f]\n", d,d,d); //전체 칸을 8로 잡고 소수점 이하 1자리
		System.out.printf("[%.2f]\n", d);//소수점 이하 2자리
				
		boolean flag = true;
		System.out.printf("%b\n",flag);
		
		String msg = "오늘은 월요일 입니다.";
		String msg2 = "오후 폭염";
		
		System.out.printf("%s\n[%10s]\n", msg, msg2);

		//printf를 이용하여 오늘은 xxxx년 xx월 xx일 입니다.
		int month = 6;
		int day = 19;
		String name = "양승연";
		double height = 164.31;
		System.out.printf("오늘은 %d년 %02d월 %02d일 입니다. 이름은 %s입니다. 키는 %.1f입니다.\n",year,month,day,name,height);
		
		//err : 출력문자와 출력 값의 개수가 맞지않을 경우
		System.out.printf("오늘은 %d년 %d월 입니다.", 2023);
		//		출력문자와 출력 값의 데이터형이 맞지않을 경우
		System.out.printf("오늘은 %d년 %d월 입니다.", 2023, 6.20);
		
	}

}