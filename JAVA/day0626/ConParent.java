package day0626;

public class ConParent {
	
	public ConParent() {
		this(100); //2.
		System.out.println("부모 기본 생성자");
	}
	
	public ConParent(int i) {
		//this(); //1.
		System.out.println("부모 매개 생성자" + i);
	}

}
