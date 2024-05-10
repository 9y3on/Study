package day0630;

import day0629.HongGilDong;

public class Anonymous{

	public void useHongGilDong(HongGilDong hgd) {
		System.out.println(hgd.fight(6));
		System.out.println(hgd.fight(8));
		System.out.println(hgd.fight(5));
	}
	
	public void useTest(Test t) {
		t.test();
	}
	
	public static void main(String[] args) {
		
		Anonymous am = new Anonymous();
		//method를 호출하기 위해서 HongGilDong 클래스가 만들어져야한다.
		HongGilDong hgd = new HongGilDong();
		am.useHongGilDong(hgd);	
		
		//매개변수가 참조형 데이터형인 경우(class나 interface)에는
		//1. 매개변수에 해당하는 클래스를 작성한다.
		//2. 객체를 생성
		//Test를 상속받았으므로 TestImpl은 자식(is a객체화 가능)
		Test t = new TestImpl();
		TestImpl ti = new TestImpl();
		//3.method 호출 객체를 할당
		am.useTest(t);
		am.useTest(ti);
		
		//anonymous inner class 생성 
		//=> 클래스파일을 별도로 생성할 필요가 없다.
		am.useTest(new Test() {
			//인스턴스 변수 가능
			int i;
			
			@Override
			public void test() {
				System.out.println("Override method");
				//i = 10;
				//method();
			}//test
			
			//메소드 가능
			public void method() {
			}
		});
		
	}//main

}//class
