package day0615;

/**
 * 무한루프와 여러개의 초기값을 가지는 for
 * @author user
 */
public class infiniteFor {

	public static void main(String[] args) {
		//수를 세는 무한 loop
		for(int i = 0; ;i++) { //조건이 없기 때문에 for가 끝나지 않는다.
			System.out.println(i);
			if(i == 5) {
				break; //반복문 탈출(무한루프가 아니게 됨)	
			}
		}//end for
		
		//무한루프 아랫줄은 실행될 수 없기때문에 코드를 작성할 수 없다.
		System.out.println("안녕");

		
		//증가하는 수를 세지 않는 무한 loop
		for(;;) {
			System.out.println("무한 loop");
			break;
		}//end for
		
		//여러개의 초기값을 가지는 for문
		for(int i = 0, j = 10, k = 5 ; i < 5 ; i++, j--) {
			System.out.println("i = " + i + ", j = " + j + ", k = " + k);
		}//end for
		
		for(char c='A', c1 = 97; c < 91; c++,c1++) {
			System.out.print(c + "(" + c1 + ") ");
		}
		System.out.println();
		for(char c='A'; c < 91; c++) {
			System.out.print(c + "(" + (char)(c+32) + ") ");
		}
		
		System.out.println();
		
		//1~100까지 홀수만
		for(int i = 1; i < 101 ; i++) {
			System.out.println(i + " ");
			if(i%2==0)
				continue;
			System.out.println("안녕");
		}//end for
		
	}//main

}//class