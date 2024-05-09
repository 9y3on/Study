package day0616;

/**
 * method의 4가지 형태
 * @author user
 */
public class MethodTypes {
	
	/**
	 * 1. 고정 일 : 반환 값 없고, 매개변수 없는 형
	 * void - 리턴값이 없을 때(반환형x)
	 */
	public void typeA() { //인스턴스 메소드
		System.out.println("고정적인 일");
	}//typeA
	
	
	/**
	 * 2. 가변 일 : 반환 값 없고, 매개변수 있는 형
	 * @param i 매개변수
	 */
	public void typeB(int i) {//매개변수는 지역변수(해당 메소드 안에서만 사용 가능)
		System.out.println("가변적인 일 " + i);
	}
	
	
	/**
	 * 3. 고정 값 : 반환 값 있고, 매개변수 없는 형
	 * @return
	 */
	public int typeC() {
		//int i = 6;
		//return i; 또는 return i*2; => 반환형이 있다면 반드시 return 값을 써줘야 함
		return 12;
	}
	
	
	/**
	 * 4. 가변 값 : 반환 값 있고, 매개변수 있는 형
	 * @param d 입력값
	 * @return 반환값
	 */
	public int typeD(double d) {
		return (int)d; //반환형과 데이터형이 맞지않으므로 캐스팅하여 반환
	}
	
	public static void main(String[] args) {
		//객체화 : 클래스명 객체명 = new 클래스명();
		MethodTypes mt = new MethodTypes();
		for(int i = 0; i < 10; i++) {
			mt.typeA();
			mt.typeB(i);			
		}
		
		int i = mt.typeC(); 
		System.out.println("고정 값 : " + i); //변수에 할당하거나
		System.out.println("고정 값 : " + (mt.typeC()+5)); //직접 연산할 수 있음
	
		i = mt.typeD(6.16);
		System.out.println("가변 값 : " + i);
		i = mt.typeD(2023.6);
		System.out.println("가변 값 : " + mt.typeD(2023.6));
		
	}//main

}//class
