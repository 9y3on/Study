package day0622;

/**
 * 2차원 배열 : 행과 열로 구성된 배열
 * 1.선언 - 데이터형[][] 배열명 = null;
 * 2.생성 - 배열명 = new 데이터형[행의수][열의수];
 * 3.값 할당 - 배열명[행의번호][열의번호] = 값;
 * 4.값 사용 - 배열명[행의번호][열의번호]
 * @author user
 */
public class UseArray2 {
	public void arrayUse1() {
		//참조형 형식으로 이차원 배열 생성
		//1.선언
		int[][] arr = null;
		//2.생성
		arr = new int[3][4];
		System.out.println(arr + " 행의 수 : " + arr.length + " 열의 수 : " + arr[0].length);
//		for(int i = 0; i < arr.length; i++) {
//			System.out.printf("arr[%d]행 열의 수 : %d\n", i, arr[i].length);
//		}
		//3.값할당
		//arr[0]=10; //이차원 배열에서는 행에 값을 할당할 수 없다.
		arr[0][0]=10;
		arr[0][3]=20;
		arr[2][3]=50;
		//4.값사용
		System.out.println("이차원 배열의 한 행은 일차원 배열로 이루어져있다." + arr[0]);
		System.out.println(arr[0][0] + " / " + arr[0][1]);
		System.out.println();
		
		//일괄처리
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(i+"행 시작");
			for(int j = 0; j < arr[i].length ; j++) {
				System.out.printf("arr[%d][%d] = %d\t", i, j, arr[i][j]);
			}
			System.out.println();
			System.out.println(i + "행 끝\n");
		}
	}
	
	public void arrayUse2() {
		//기본형 형식으로 이차원 배열 생성
		//이차원 배열은 행구분 괄호로 행을 만든다. { { }<--행 구분 괄호 }
		int[][] arr = {{1,2,3,4,5,6},{7,8,9,10,11,12}};
		System.out.println(arr.length + "행 " + arr[0].length + "열");
		
		for(int i=0; i < arr.length ; i++) {
			for(int j=0; j < arr[i].length ; j++) {
				System.out.printf("arr[%d][%d] = %d\t", i, j, arr[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void arrayUse3() {
		int[][] arr = new int[10][7];
		
		for(int i=0; i < arr.length ; i++) { //배열은 생성되면 모든 방이 0으로 초기화 됨
			for(int j=0; j < arr[i].length ; j++) {
				if(i==0 || j==0 || i==arr.length-1 || j==arr[i].length-1) {
					arr[i][j] = 1;
				}
				System.out.printf("%-2d",arr[i][j]);
			}
			System.out.println();
		}		
	}

	public static void main(String[] args) {
		UseArray2 ua = new UseArray2();
		ua.arrayUse1();
		System.out.println("--------------------\n");
		ua.arrayUse2();
		System.out.println("--------------------\n");
		ua.arrayUse3();
	}//main

}//class
