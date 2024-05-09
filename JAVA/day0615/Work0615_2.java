package day0615;

public class Work0615_2 {

	public static void main(String[] args) {

		//숙제 1번
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + "x" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//숙제 2번
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println(i);
		}
		
		//숙제3번
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			if(i%3==0)
				sum+=i;
		}
		
		System.out.println();
		
		System.out.println("3의 배수합 : " + sum);
		
	}

}
