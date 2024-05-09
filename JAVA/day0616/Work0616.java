package day0616;

public class Work0616 {
	//변수 = 값, 메소드 = 일
	
	/**
	 * 1. 자신의 이름을 출력 하는 일을 하는 method - 고정일
	 */
	public void name() {
		System.out.println("양승연");
	}
	
	/**
	 * 2. 자신의 이름 이니셜 첫 글자만 반환하는 method – 고정값 
	 * @return 첫 번째 이니셜
	 */
	public char firstInitial() {
		return 'Y';
	}
	
	/**
	 * 3. 점수를 입력 받아 점수의 판정을 출력하는 method  - 가변일
	 * @param score
	 */
	public void grade(int score) {
		if(score>-1 && score<101) {
			if(score<40) {
				System.out.println(score + "점 - 과락");
			}else if(score>39 && score<60) {
				System.out.println(score + "점 - 다른과목참조");
			}else {
				System.out.println(score + "점 - 합격");
			}
		}else {
			System.out.println("잘못된 점수");
		}
	}
	
	/**
	 * 4. 문자를 입력받아 해당 문자가 “대문자”, “소문자”, “숫자”인지를 판단하여 - 가변일
	 * 출력하는 method
	 * @param c
	 */
	public void upperLowerNumber(char c) {
		if(c>64 && c<91) {
			System.out.println(c + " - 대문자");
		}else if(c>96 && c<123) {
			System.out.println(c + " - 소문자");
		}else if(c>47 && c<58) {
			System.out.println(c + " - 숫자");
		}else {
			System.out.println("대문자, 소문자, 숫자가 아닙니다.");
		}
	}
	
	/**
	 * 5. 태어난 해를 입력받아 나이를 반환하는 method - 가변값
	 * @param birth
	 * @return 나이
	 */
	public int age(int birth) {
		return 2023-birth+1;
	}
	
	/**
	 * 6. 두 개의  수를 입력 받아 둘 중 큰 수를 반환하는 일을 하는 method - 가변값
	 * @param x
	 * @param y
	 * @return 두 숫자 중 더 큰 값(판정결과)
	 */
	public int maxNum(int x, int y) {
		return (x >= y)? x : y;
	}

	public static void main(String[] args) {
		
		Work0616 work = new Work0616();
		
		//1번 고정일을 하는 method : method 안에서 출력
		work.name();
		
		//2번 고정 값으로 사용하는 method : 값을 반환받은 후 출력
//		char firstInit = work.firstInitial(); //변수에 저장한 후
//		System.out.println(firstInit); //출력해도 된다.
		System.out.println(work.firstInitial()); //바로 출력해도 됨
		
		//3번
		work.grade(80);
		
		//4번
		work.upperLowerNumber('A');
		
		//5번
		//System.out.println(work.age(1999)+"살"); //직접 출력
		int age = work.age(1998); //method의 결과를 변수에 저장하고
		System.out.println(age); //변수를 출력
		
		//6번
		//System.out.println(work.maxNum(101, 100)); //직접 출력
		int max = work.maxNum(0, 10); //method의 결과를 변수에 저장하고 
		System.out.println(max); 	  //변수를 출력

	}//main
}//class
