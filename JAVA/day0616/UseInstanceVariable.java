package day0616;

/**
 * instance(member) variable의 사용
 * 특정 객체에 속해(member) 있는 변수 (static은 하나만.)
 * 같은 이름의 변수를 여러 객체에서 가지고 있으며 객체마다 따로 사용한다.
 * !객체화! 후 사용
 * @author user
 */
public class UseInstanceVariable {
	
	//변수 정보의 중요도를 생각하여 접근지정자 선정
	//1.선언
	private int age; //instance 변수(static 없는) 
	private int time; 
	
	public static void main(String[] args) {
		//age=10; //static 영역에서는 instance 변수를 직접 사용할 수 없다.
		//2.객체 생성(인스턴스 변수를 사용하기 위해서)
		//클래스명 객체명 = new 클래스명();
		UseInstanceVariable uiv = new UseInstanceVariable();
		UseInstanceVariable uiv2 = new UseInstanceVariable();
		
		uiv.age = 25;
		uiv2.age = 0;
		
		//uiv객체가 가진 변수를 수정하면 uiv만 변경 => 다른 객체에 영향x
		uiv.age = 25;
		System.out.println("uiv객체가 가진 age : " + uiv.age);
		System.out.println("uiv2객체가 가진 age : " + uiv2.age);
		
	}

}
