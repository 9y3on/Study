package day0623;

public class VariableArray {

	public VariableArray() {
		
		//1.선언 - 데이터형[][] 배열명 = null;
		int[][] arr = null;
		
		//2.생성 - 배열명 = new 데이터형[행의수][]; !!열을 설정하지 않는다.!! 
		arr = new int[5][];
		
		//3.행마다 열을 생성 - 배열명[행의번호] = new 데이터형[열의수];
		arr[0] = new int[5];
		arr[1] = new int[3];
		arr[2] = new int[] {1,2,3,4,5,6,7,8,9};
		arr[3] = new int[2];
		arr[4] = new int[4]; //방의 개수는 21억까지(int 범위까지)
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.printf("arr[%d]행의 열의 수 %d개\n",i,arr[i].length);
		}//end for
		
		//4.값 할당 - 배열명[행의번호][열의번호] = 값;
		arr[0][0] = 10;
		arr[4][3] = 20;		
		
		//5.값 얻기 - 배열명[행의번호][열의번호];
		System.out.println(arr[0][0] + " / " + arr[0][1]);
		
		//6.일괄 처리
		System.out.println();
		//모든 방의 값을 개선된 for loop 출력
		for(int[] value1 : arr) {
			for(int value : value1) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
		
	}//VariableArray
	
	public static void main(String[] args) {

		new VariableArray();
		
	}//main

}//class
