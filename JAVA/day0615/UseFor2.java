package day0615;

/**
 * 다중 for문의 사용 (바깥 for가 한 번 실행될 때, 안쪽 for는 몇 번 실행되는가?)
 * @author user
 */
public class UseFor2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) { //단일 for 영역
			for(int j = 0; j < 6; j++) { //다중 for 영역
				System.out.println("i = " + i + " / j = " + j);
			}//end for
			System.out.println("--------------");
		}//end for
		
		
		//구구단 전단 출력
		for(int i = 2; i < 10; i++) { //단은 2단에서부터 시작하여 9단까지 반복
			System.out.println(i + "단 시작");
			for(int j = 1; j < 10; j++) { //곱해지는 수는 1~9 반복
				System.out.println(i + "x" + j + " = " + i*j);
			}//end for
			System.out.println(i + "단 끝\n");
		}//end for
		
		// 0 0
		// 1 0 1 1
		// 2 0 2 1 2 2
		// 3 0 3 1 3 2 3 3
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(i + " ");
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		0 0 0 1 0 2 0 3 
//		1 1 1 2 1 3 
//		2 2 2 3 
//		3 3
		for(int i = 0; i < 4; i++) {
			for(int j = i; j < 4; j++) {
				System.out.print(i + " ");
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 1 1 1 1 1
		// 1 0 0 0 1
		// 1 0 0 0 1
		// 1 0 0 0 1
		// 1 1 1 1 1
		int k = 0;
		for(int i = 0; i < 5; i++) { //행을 돌리기위한 for
			//System.out.print(j + " ");
			for(int j = 0; j < 5 ; j++) { //열을 돌리기위한 for
				//처음 행이거나 마지막행이거나 처음 열이거나 마지막 열이라면 1을, 그렇지 않다면 0
				//k변수에 할당하고 출력한다.
				k = j == 0 || j == 4 || i == 0 || i == 4 ? 1 : 0; 
				System.out.print(k);					
			}//end for
			System.out.println();
		}//end for
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) { //행을 돌리기위한 for
			//System.out.print(j + " ");
			for(int j = 0; j < 5 ; j++) { //열을 돌리기위한 for
				if(j == 0 || j == 4 || i == 0 || i == 4) {
					System.out.print(1);
				}else {
					System.out.print(0);					
				}
			}//end for
			System.out.println();
		}//end for

		
	}//main

}//class
