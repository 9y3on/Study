package day0626;

public class Child extends Parent{

	int p_i;
	int c_i;
	
	public void printPI() {
		//인스턴스 영역에서는 this가 생략되어있다.
		//부모와 자식이 같은 이름의 변수를 가지고 있으면 
		//p_i=6;
		
		this.p_i=10;   //자식의 변수를 사용 this = 호출한 객체의 시작주소 반환
		super.p_i=100; //자식의 시작주소를 건너뛰고 부모의 시작 주소부터 변수를 찾는다.
					   //super = 부모의 시작주소 반환
		System.out.println("자식의 method : p_i - " + p_i + " / c_i - " + c_i);
		super.printPI(); //부모의 메소드
		
		//부모에만 있는 변수나 method는 this로 사용할 수 있다.
		this.p_j=300;
		//p_j = 50; this 생략 가능~
		System.out.println("부모의 변수 super.p_j : " + super.p_j + ", this.p_j : " + this.p_j);
		
		//this는 출력할 수 있지만 super는 출력 불가능
		System.out.println(this);
		//System.out.println(super);
		
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c);
		c.printPI();
		
		
	}

}
