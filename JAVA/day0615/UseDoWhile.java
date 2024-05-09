package day0615;

/**
 * do~while : 시작과 끝을 모를 때 사용하는 반복문 <br>
 * 최소 1번 수행 ~ 최대 조건까지 수행<br>
 * 문법<br>
 * 초기값<br>
 * do {<br>
 *   반복수행문장들..;<br>
 *   증감식;<br>
 * }while(조건식);
 * @author user
 */
public class UseDoWhile {

	public static void main(String[] args) {

		int i = 100; //초기값
		do {
			System.out.println(i); //반복수행문장
			i++; //증감소식
		}while(i < 5); //조건식
		
		//do~while을 사용하여 1~100까지의 합을 출력
		i = 1;
		int sum = 0;
		do {
			sum+=i;
			i++;
		}while(i<101);
		System.out.println(sum);
		
	}//main

}//class
