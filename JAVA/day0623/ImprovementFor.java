package day0623;

/**
 * 배열, java.util.List, java.util.Set의 값을(컬렉션) 인덱스를 사용하지 않고 <br>
 * 처음부터 끝까지 간단한 코드 출력할 때 사용 <br>
 * for(데이터형 변수명 : 배열명){ <br>
 *       변수명 <br>
 * }
 * @author user
 */
public class ImprovementFor {

	public ImprovementFor() {
		int[] arr = new int[]{2023,6,23,16,3};
		for(int value : arr) { //인덱스 사용x 처음 방부터 끝 방까지 출력
			System.out.print(value + " ");
		}//end for
		
		System.out.println();
		
		String[] strArr = "Java,Oracle,JDBC,HTML,CSS".split(",");		
		for(String value : strArr) {
			System.out.print(value + " ");
		}//end for
		
		System.out.println("\n--------------------------------------");
		
		int[][] arr2 = {{1,2,3},{4,5,6}};
		//이차원 배열의 한 행은 일차원 배열로 이루어져있다.
		for(int[] arr1 : arr2) {
			//일차원 배열의 각 방은 단일형으로 이루어져있다. -> 일차원 배열에 먼저 접근하고 각 열의 값에 접근
			for(int value : arr1) {
				System.out.print(value + " ");
			}//end for
			System.out.println();
		}//end for
		
		System.out.println("--------------------------------------");
		
		int[][][] arr3 = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		//삼차원 배열의 한 면은 이차원 배열로 이루어져있다.
		for(int[][] intArr2 : arr3) { //면
			//이차원 배열의 한 행은 일차원 배열로 이루어져있다.
			for(int[] intArr1 : intArr2) {
				//일차원 배열의 각 방은 단일형으로 이루어져있다.
				for(int value: intArr1) {
					System.out.print(value + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}//ImprovementFor
	
	public static void main(String[] args) {

		new ImprovementFor();
		
	}//main

}//class
