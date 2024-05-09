package day0614;

import java.util.Iterator;

/**
 * for : 시작과 끝을 알 때 사용하는 반복문 <br>
 * 문법 <br>
 * for(초기값(시작값);끝 값(조건식);증가,감소식){
 * 	 반복수행 문장들
 * }
 * 
 * @author user
 */
public class UseFor {

	public static void main(String[] args) {
		//0~9까지 1씩 증가하는 값을 출력하는 반복문
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}//end for
		
		System.out.println();
		
		//1~100까지 1씩 증가하는 값을 출력하는 반복문
		//짝수만 출력
		for(int i = 1; i < 101; i++) {
			if(i%2 == 0)
				System.out.print(i + " ");
		}
		
		System.out.println();

		//1~100까지 홀수만 출력하는 반복문
		//for문의 증.감소식은 대상체의 값을 변경하여 유지할 수 있는 모든 문법을 사용할 수 있다.
		for(int i = 1; i < 101; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//1~9까지 1씩 증가하는 수를 아래로 출력하는 반복문
		for(int i = 1; i < 10; i++) {
			System.out.println("2 x " + i + " = " + i*2);
		}
		
		//for문을 사용하여 A~Z까지 출력
//		for(int i = 65; i < 91; i++) { //int를 char로 변환하여 출력해야 문자가 나온다.
//			System.out.print((char)i + " "); 
//		}
	
		for(char c = 65; c < 91; c++) { //char에는 unicode값이 할당되고
			System.out.print(c + " "); //unicode값에 해당하는 문자가 출력된다.
		}
		
		System.out.println();
		
		//1~100까지의 합을 출력
		//1~100까지 반복하는 변수, 반복값의 누적합을 저장할 변수
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합은 " + sum);

//		for(int i = 1; i < 100; i++) {
//			sum += i;
//			System.out.print(i + "+");
//		}
//		System.out.println("100=" + (sum+=100));
		
		//100~0까지 1씩 감소하는 값을 옆으로 출력
		for(int i = 100; i > -1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//대문자 A-Z까지, 소문자 a-z까지를 출력하는 for
//		for(char c1 = 65, c2 = 97; c1 < 91 && c2 < 123; c1++, c2++) {
//			System.out.print(c1 + "(" + c2 + ") ");
//		}
//		
		for(char c = 65; c < 91; c++) {
			System.out.print(c + "(" + (char)(c+32) + ") ");
		}
		
	}//main

}//class
