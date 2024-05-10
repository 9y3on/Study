package day0630;

/**
 * Math class는 생성자가 private -> 객체화 불가! -> instance method 사용불가!
 * 모든 메소드가 static이므로 클래스명.메소드명으로 접근 -> Math.method명()
 * @author user
 */
public class UseMath {

	public UseMath() {
		int i = -1;
		double d =  -2023.06;
		//Math.abs(값) - 절댓값
		System.out.println(i + "의 절댓값 : " + Math.abs(i));
		System.out.println(d + "의 절댓값 : " + Math.abs(d));
		
		//Math.round(실수) - 소수점 이하 1의자리에서 반올림
		d = 3.5;
		System.out.println(d + "의 반올림 : " + Math.round(d));
		
		//Math.ceil(실수) - 올림 (모든 자릿수가 0이 아니면 무조건 올림)
		d = 10.01;
		System.out.println(d + "의 올림 : " + Math.ceil(d));
		
		//Math.floor(실수) - 내림 (모든 자릿수가 0이 아니면 무조건 내림)
		d = 10.9;
		System.out.println(d + "의 내림 : " + Math.floor(d));
		
		//절사(소수점 이하를 아예 자르기) => 실수를 int형으로 캐스팅 (int)실수
		System.out.println(d + "의 절사 : " + (int)d);
		
		//Math.random() - 난수 생성(0.000~16 부터 0.9999~16)
		d = Math.random();
		System.out.println(d);
		//난수의 범위 설정 - (int)Math.random()*발생할수
		d = Math.random();
		System.out.println("발생한 수 : " + d);
		System.out.println("범위의 수 : " + d * 10);		
		int num = (int)(d*10);
		System.out.println("범위의 수에서 정수 : " + num);
		
		num = (int)(d*10)+1;
		System.out.println("1~10까지 임의의 수 : " + num);
		
		//대문자 A의 코드값은 65, 대문자 Z의 코드값 90
		//알파벳 대문자 중 임의의 문자 하나를 출력
		char c = (char)(d*26+65);
		System.out.println("임의 알파벳 대문자 : " + c);
		//알파벳 소문자 중 임의의 문자 하나를 출력
		c = (char)(d*26+97);
		System.out.println("임의 알파벳 소문자 : " + c);
		//숫자 0의 코드 값은 48, 숫자 9의 코드값 57
		//숫자 0~9 중 임의의 숫자 하나를 출력
		c = (char)((d*10)+48);
		System.out.println(c);
		System.out.println((int)(d*10));
	}
	
	public static void main(String[] args) {
		new UseMath();
	}//main

}//class
