package day0629;

/**
 * 추상클래스 <br>
 * 변수, method, abstract method를 가진다. <br>
 * abstract method는 body가 없어서 <br>
 * 일을 할 수 없는 method이고, 구현의 강제성을 가진다. <br>
 * 객체화 되지 않는다.
 * @author user
 */
public abstract class AbstractParent {
	//일반 클래스의 경우 abstract method를 가질 수 없다.
	
	//일반 변수
	int i; 
	
	//기본 생성자
	public AbstractParent() {
		System.out.println("추상 클래스의 생성자");
	}
	
	//일반 메소드
	public void test() { 
		System.out.println("일반 메소드");
	}
	
	//abstract method
	public abstract void abTest(); //실행부가 없음
	protected abstract void abTest(int i); //오버로딩 
	
	public static void main(String[] args) {
		
		//new AbstractParent(); //추상 클래스는 객체화 되지 않는다.
								//자식 클래스를 통해서만 객체화 가능(직접x)
		
	}//main
}//class
