package day0622;

/**
 * 배열 - 일괄처리<br>
 * 1차원 배열의 사용
 * @author user
 */
public class UseArray1 {
	public static final int FLAG_SCORE = 83;
	
	public void arrayUse1() {
		//1. 선언 - 데이터형[] 배열명 = null;
		int[] arr = null;
		int arr1[] = null;
		
		//2. 생성 - 배열명 = new 데이터형[방의 개수];
		arr = new int[5]; //heap에 생성되면서 모든 방의 값이 초기화 됨
		System.out.println(arr + "배열의 방 개수 : " + arr.length); //여기서는 length - 키워드이므로 괄호x
		
		//3. 값 할당 - 배열명[방의 번호] = 값;
		arr[0] = 10;
		arr[4] = 2023;
		
		//4. 값 사용 - 배열명[방의 번호]
		System.out.println(arr[0] + " / " + arr[1]);
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		//시작과 끝을 알 때
		for(int i = 0; i < arr.length ; i++) {
			System.out.printf("arr[%d]=%d  ", i, arr[i]);
		}
		System.out.println();
	}//arrayUse1
	
	public void arrayUse2() {
		
		int[] score = {83, 99, 77, 64, 93, 70}; //new int[] {83,...,70};
		int sum = 0;
		System.out.printf("시험 응시자 [%d]명\n", score.length);
		
		//일괄처리
		System.out.println("번호\t점수");
		System.out.println("===========");
		for(int i = 0; i < score.length ; i++) {
			System.out.printf("%d번\t%d점\n",i+1,score[i]);
			sum+=score[i];
		}//end for
		double avg = (double)sum/score.length;
		System.out.printf("총점\t%d점\n",sum);
		System.out.printf("평균\t%.2f점\n",avg);
		
		//score배열의 마지막 방부터 처음 방까지 출력
		for(int i = score.length-1; i > -1 ; i--) {
			System.out.println(score[i]);
		}
		
		//점수 중에 최고 점수
		int max = score[0];
		for(int i = 1; i < score.length ; i++) {
			if(max < score[i]) //max > score[i] => 최저 점수
				max = score[i];
		}
		System.out.println("최고점수 : " + max +"점");
		
		int[] score1 = {83, 99, 77, 64, 93, 70, 83, 78, 83, 20};
		int cnt = 0, min = score1[0];
		max = score1[0];
		//83점과 같은 점수를 받은 학생의 수 얻기
		//최고점과 최저점의 차이
		for(int i = 0; i < score1.length ; i++) { //배열의 시작부터 끝까지 반복 시키기위해
//			if(score1[i] == 83) //반복중인 배열 방의 점수를 비교하기위해
//				cnt++;
			switch(score1[i]) {
			case FLAG_SCORE : cnt++;
			}
			if(max < score1[i]) { //최고점
				max = score1[i];
			}else {
				min = score1[i]; //최저점
			}
		}
		System.out.println(FLAG_SCORE + "점 받은 학생 수 : " + cnt +"명");
		System.out.println("최고점 " + max + "점과 최저점 " + min + "점의 차이 : " + (max-min) +"점");
		
		//int[] score = {83, 99, 77, 64, 93, 70};
		//score 배열의 값을 99, 93, 83, 77, 70, 64의 형태로 바꾼 후 출력(내림차순)
		int temp = 0;
		for(int i = 0; i < score.length ; i++) { //현재 방의 값을 반복
			for(int j = i+1; j < score.length ; j++) { //현재 방부터 뒤에 존재하는 방의 값을 반복
				if(score[i] < score[j]) { //score[i] > score[j] => 오름차순
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for(int i = 0; i < score.length ; i++) {
			System.out.print(score[i] + " ");
		}
		
	}//arrayUse2

	public static void main(String[] args) {

		UseArray1 ua1 = new UseArray1();
		ua1.arrayUse1();
		ua1.arrayUse2();
		
	}//main

}//class
