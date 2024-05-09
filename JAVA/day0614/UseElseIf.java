package day0614;

/**
 * else~if(다중if) <br>
 * 연관된 여러 조건을 비교해야할 때 사용
 * 
 * @author user
 */
public class UseElseIf {

	public static void main(String[] args) {

		int score = 101; //-1, 0~100, 101 -> 경계값 테스트
		System.out.print(score + "점은 ");
		//점수의 판정 : 0보다 작은지, 100보다 큰지, 범위안에 있는지?
		if (score < 0) {
			System.out.println("0보다 작을 수 없습니다.");
		} else if (score > 100) {
			System.out.println("100보다 클 수 없습니다.");
		} else {
			System.out.println("입력 성공 o(^^O)");
		} //end else

		//arguments Java, C, Python이 입력되었을 때에만 동작하는 코드 작성
		//입력값이 "Java" 라면 1995, "C"면 1972를 그렇지 않다면, 1991을 변수에 넣고
		//변수값을 출력 => 3가지 값 중 하나이므로 다중 if를 사용한다.
		
		int year = 0;
		if(args[0].equals("Java")) {
			year = 1995;
		} else if(args[0].equals("C")) {
			year = 1972;
		} else if(args[0].equals("Python")) {
			year = 1991;
		}
		System.out.println(args[0] + "언어는 " + year + "년도 출시");
		
		//태어난 해를 입력받아 띠를 출력하는 코드 작성
		//0-원숭이, 1-닭, 2-개, 3-돼지, 4-쥐, 5-소, 6-호랑이, 7-토끼, 8-용, 9-뱀, 10-말, 11-양
		//태어난 해를 12로 나눈 나머지를 사용(12로 나누면 나머지가 0~11까지의 수가 나옴)
		//flag 변수 어떤 일을 하는데 기준이 되는 변수
		
		int bornYear = Integer.parseInt(args[1]);
		
		if(bornYear % 12 == 0) {
			System.out.println("원숭이");
		}else if(bornYear % 12 == 1) {
			System.out.println("닭");
		}else if(bornYear % 12 == 2) {
			System.out.println("개");
		}else if(bornYear % 12 == 3) {
			System.out.println("돼지");
		}else if(bornYear % 12 == 4) {
			System.out.println("쥐");
		}else if(bornYear % 12 == 5) {
			System.out.println("소");
		}else if(bornYear % 12 == 6) {
			System.out.println("호랑이");
		}else if(bornYear % 12 == 7) {
			System.out.println("토끼");
		}else if(bornYear % 12 == 8) {
			System.out.println("용");
		}else if(bornYear % 12 == 9) {
			System.out.println("뱀");
		}else if(bornYear % 12 == 10) {
			System.out.println("말");
		}else {
			System.out.println("양");
		}
		
		
	}// main

}// class
