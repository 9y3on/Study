package day0629;

/**
 * inner class : 안 쪽 클래스를 인스턴스 변수처럼 사용할 때 <br>
 * 객체화 후 바깥 클래스에서 사용할 수 있다.
 * @author user
 */
public class Outter {
	
	int out_i;
	
	public Outter() {
		//기본 생성자
		System.out.println("외부 클래스의 생성자");
	}//Outter
	
	public void outMethod() {
		System.out.println("외부 클래스의 method");
		//바깥 클래스에서는 내부 클래스의 자원을 직접 접근할 수 없다.
		
		//안쪽 클래스를 객체화
		//Outter.Inner in = this.new Inner();
		//Inner in = this.new Inner(); //바깥 클래스명 생략
		System.out.println("-----------");
		Inner in = new Inner(); //this 생략
		in.in_i=100;
		in.inMethod();
		
	}//outMethod
	
	//<------------------inner class 시작------------------>
	public class Inner {
		int in_i;

		public void inMethod() {
			System.out.println("내부 클래스의 method");
			//in_i = 100; -> 불가
			//inMethod(); -> 불가
			//내부 클래스에서는 외부 클래스의 변수, method 직접 접근 가능
			out_i = 300;
		}//inMethod
		
	}//class
	//<------------------inner class 끝 ------------------>
	
	//instance 영역이므로 외부 클래스 생략 가능
	//Inner in = new Inner();
	
	public static void main(String[] args) {
		//1.외부 클래스의 객체화
		Outter out = new Outter();
		out.outMethod();
		//2.내부 클래스의 객체화
		//static 영역이므로 외부 클래스 사용
		//insatance 영역일 경우 생략 가능
		Outter.Inner in = out.new Inner(); 
		in.inMethod();

	}

}//class
