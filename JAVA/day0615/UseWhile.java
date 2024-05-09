package day0615;

/**
 * while : 시작과 끝을 모를 때 사용하는 반복문<br>
 * 최소 0번 수행 ~ 최대 조건까지 수행<br>
 * 문법<br>
 * 초기값;<br>
 * while(조건식){ <br>
 *   반복수행 문장들..<br>
 *   증감식<br>
 * }
 * 
 * @author user
 */
public class UseWhile {

	public static void main(String[] args) {
		int i = 0;
		while (i < 5) { // 조건식
			System.out.println(i); // 반복수행 문장들
			i++; // 증가 또는 감소식
		} // end while
		
		//while을 사용하여 구구단 3단을 출력
		i = 1;
		while(i<10) {
			System.out.println("3x" + i + "=" + 3 * i);
			i++;
		}

	}// main

}// class
