package day0626;

public class ConChild extends ConParent {
	
	public ConChild() {
		//super(); <- 생략됨, 무조건 기본 생성자임
		//super(200); //1. //인자있는 부모 클래스의 생성자 호출
		this(100); //2.
		System.out.println("자식 기본 생성자");
	}
	
	public ConChild(int i) {
		//this(); //1.
		System.out.println("자식 매개 생성자" + i);
	}
	
}
