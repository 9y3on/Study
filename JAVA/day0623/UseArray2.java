package day0623;

public class UseArray2 {
	
	public UseArray2() {
	}//기본생성자

	public void arrayUse2() {
		//이차원 배열의 한 행은 일차원 배열로 이루어져있다.
		int[][] arr2 = {{1,2,3,4,5},{6,7,8,9,10}};
		int[] arrTemp = arr2[0]; //특정 행을 일차원 배열에 할당할 수 있다. 
								 //=> 이차원 배열의 행은 일차원 배열이므로
		for(int i = 0; i < arrTemp.length; i++) {
			System.out.println(arrTemp[i]);
		}
		System.out.println("\n-----------------------\n");
		//일차원 배열을 이차원 배열에 행에 넣을 수 있다.
		//이 경우 새로 들어가는 일차원 배열이 기존의 이차원 배열의 일차원 배열을 밀어내고 들어가기 때문에 
		//기존 일차원 배열은 더이상 쓸 수 없는 상태로 메모리에 저장된다.
		int[] arr = {100,200,300,400,500};
		arr2[1] = arr;
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");				
			}
			System.out.println();
		}
		
	}//arrayUse2
	
	public static void main(String[] args) {

		//method를 한 번만 사용한다면 굳이 객체를 담는 변수를 만들 필요가 없다.
		new UseArray2().arrayUse2(); //new 생성자() <- 자체가 객체! 
									 //UseArray2 ua는 객체를 담는 객체명일 뿐 객체가 아님
		
	}

}
