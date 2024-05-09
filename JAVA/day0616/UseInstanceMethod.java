package day0616;

/**
 * instance method <br>
 * - instance variable를 사용하여 업무를 처리하는 일을 하는 메소드
 * @author user
 */
public class UseInstanceMethod {

	int age;
	
	
	/**
	 * 인스턴스 변수에 나이를 할당하면 태어난 해를 출력해주는 일 
	 */
	//1.메소드 선언
	public void printBirth() {
		if(age > -1) {
			System.out.println(age+ "살은 " + (2023-age+1));			
		}else {
			System.out.println(age+ "살은 잘못된 나이입니다.");		
		}
	}//printBirth
	
	
	public static void main(String[] args) {
		//static 영역에서는 instance영역의 method를 직접 호출할 수 없다. 
		//instance method와 instance variable 모두 직접 접근x => 객체를 생성하여 접근
		
		//2.객체화 : 클래스명 객체명 = new 클래스명();
		UseInstanceMethod uim = new UseInstanceMethod();
		
		//3.instance 변수에 값을 할당
		uim.age = -26;
		
		//4.method 호출
		uim.printBirth();
		
	}

}
