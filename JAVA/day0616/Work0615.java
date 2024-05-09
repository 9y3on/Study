package day0616;

public class Work0615 {

	public static void main(String[] args) {
		//구구단을 옆으로 출력 2x1=2 3x1=3 4x1=4 5x1=5 ... 9x1=9
		
		for(int i = 1; i < 10; i++) { //바깥 for가 한 번 반복할 때 - 곱해지는 수 (고정)
			for(int j = 2; j < 10; j++) { //안쪽 for는 몇 번 반복하는가? - 단 (증가)
				System.out.print(j + "x" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}
	}

}
