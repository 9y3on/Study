package day0630;

/**
 * 긴 문자열을 다룰 때 사용
 * 긴 문자열 => "안녕"+"하세요" 처럼 '+' 로 연결 된 문자열
 * 문자열을 메모리(heap영역)에 직접 생성함
 * Builder와 Buffer 동작은 같음
 * @author user
 */
public class UseStringBuilder {

	//StringBuilder - 동기화X 속도 빠름
	public void useStringBuilder() {
		//1.생성
		StringBuilder sb = new StringBuilder();
		//2.사용(값 붙이기)
		sb.append(2023);//문자열 추가 //정수
		sb.append('년'); 	  //문자
		sb.append("6월 30일"); //문자열
		sb.append(6.3); 	  //실수(. <- 도 인덱스에 포함)
		sb.insert(5, "인천시의 자랑 김선경"); //중간에 문자열 삽입
		System.out.println(sb + " / " + sb.length());
		sb.delete(9,12); //문자열 삭제
		System.out.println(sb + " / " + sb.length());
		sb.insert(5," 마계");
		System.out.println(sb + " / " + sb.length());
	}//useStringBuilder()
	
	
	//StringBuffer - 동기화O 속도 느림
	public void useStringBuffer() {
		//1.생성
		StringBuffer sb = new StringBuffer();
		//2.사용(값 붙이기)
		sb.append(2023);//문자열 추가 //정수
		sb.append('년'); 	  //문자
		sb.append("6월 30일"); //문자열
		sb.append(6.3); 	  //실수(. <- 도 인덱스에 포함)
		sb.insert(5, "인천시의 자랑 김선경"); //중간에 문자열 삽입
		System.out.println(sb + " / " + sb.length());
		sb.delete(9,12); //문자열 삭제
		System.out.println(sb + " / " + sb.length());
		sb.insert(5," 마계");
		System.out.println(sb + " / " + sb.length());
		
	}//useStringBuffer()
	
	public static void main(String[] args) {

		UseStringBuilder usb = new UseStringBuilder();
		usb.useStringBuffer();
		System.out.println("---------------------------------");
		usb.useStringBuilder();
		
	}//main

}//class
