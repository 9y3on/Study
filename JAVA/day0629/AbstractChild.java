package day0629;

/**
 * 추상 클래스의 자식 클래스 <br>
 * 자식 클래스는 부모 클래스의 abstract method가 <br> 
 * 몇 개든 모두 구현(오버라이딩)해야한다. -> 구현의 강제성 <br>
 * @author user
 */
public class AbstractChild extends AbstractParent{
	//일반 클래스의 경우 abstract method를 가질 수 없다.
	//추상 메소드는 반드시 오버라이딩 해야함
	
	//기본 생성자
	public AbstractChild() {
		System.out.println("자식의 생성자");
	}
	
	//오버라이딩한 메소드
	@Override
	public void abTest() {
		//abstract method는 직접 호출 불가
		//super.abTest();
		System.out.println("자식이 Override한 abTest");
	}
	@Override
	public void abTest(int i) {
		//접근지정자는 달라도 됨(광의의 접근지정자일 경우만)
		System.out.println("자식이 Override한 abTest i " + i);
	}
	
	public static void main(String[] args) {
		//추상 클래스는 자식 클래스가 생성될 때에만 객체로 생성된다.
		//직접 객체화를 할 수는 없지만 자식 클래스를 통해서는 객체화 가능
		AbstractChild ac = new AbstractChild();
		
		//is a 객체화
		AbstractParent ap = new AbstractChild();
		
		//자식이 Override한 method가 호출 됨
		ac.abTest();
		ap.abTest();
		System.out.println("---------------------------");
		ac.abTest(10);
		ap.abTest(20);		
		
	}//main

}//class
