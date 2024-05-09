package day0614;

/**
 * switch~case 사용
 * 
 * @author user
 */
public class UseSwitchCase2 {
	public static final int GRADE_A_PLUSE = 10;
	public static final int GRADE_A = 9;
	public static final int GRADE_B = 8;
	public static final int GRADE_C = 7;
	public static final int GRADE_D = 6;
	// ------------------------------------
	public static final int MONKEY = 0;
	public static final int CHICKEN = 1;
	public static final int DOG = 2;
	public static final int PIG = 3;
	public static final int MOUSE = 4;
	public static final int COW = 5;
	public static final int TIGER = 6;
	public static final int RABBIT = 7;
	public static final int DRAGON = 8;
	public static final int SNAKE = 9;
	public static final int HORSE = 10;
	// ------------------------------------

	public static void main(String[] args) {

		int score = 101;
		char grade = 64; // 65부터 A
		if(score>-1 && score<101) {
			switch (score / 10) { // break 최소화하는 코드(break많을수록 좋다. 연산하는 게 적어져서)
			case GRADE_D:
				grade++;
			case GRADE_C:
				grade++;
			case GRADE_B:
				grade++;
			case GRADE_A:
			case GRADE_A_PLUSE:
				grade++;
				break;
			default:
				grade += 6;
			}//end switch
			System.out.println(score + "점의 학점은 " + grade);
		} else {
			System.out.println(score + "점은 올바른 점수가 아닙니다.");
		}//end else
//		char grade = '\u0000';
//
//		switch (score/10) { //정수/정수 = 정수
//		case UseSwitchCase2.GRADE_A_PLUSE: 
//		case UseSwitchCase2.GRADE_A: grade = 'A'; break;
//		case UseSwitchCase2.GRADE_B: grade = 'B'; break;
//		case UseSwitchCase2.GRADE_C: grade = 'C'; break;
//		case UseSwitchCase2.GRADE_D: grade = 'D'; break;
//		default: grade = 'F'; break;
//		}//end switch

//		System.out.println(score + "점의 학점은 " + grade);

		// 띠 구하기를 switch~case로 구현
		// 0-원숭이, 1-닭, 2-개, 3-돼지, 4-쥐, 5-소, 6-호랑이, 7-토끼, 8-용, 9-뱀, 10-말, 11-양

		int birth = 1999;
		switch (birth % 12) {
		case MONKEY:
			System.out.println("원숭이띠");
			break;
		case CHICKEN:
			System.out.println("닭띠");
			break;
		case DOG:
			System.out.println("개띠");
			break;
		case PIG:
			System.out.println("돼지띠");
			break;
		case MOUSE:
			System.out.println("쥐띠");
			break;
		case COW:
			System.out.println("소띠");
			break;
		case TIGER:
			System.out.println("호랑이띠");
			break;
		case RABBIT:
			System.out.println("토끼띠");
			break;
		case DRAGON:
			System.out.println("용띠");
			break;
		case SNAKE:
			System.out.println("뱀띠");
			break;
		case HORSE:
			System.out.println("말띠");
			break;
		default:
			System.out.println("양띠");
			break;
		}

	}// main

}// class
