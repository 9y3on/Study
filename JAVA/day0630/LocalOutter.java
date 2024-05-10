package day0630;

import day0629.Outter.Inner;

/**
 * Local class(지역 클래스)
 * @author user
 */
public class LocalOutter {
	
	int out_i;

	public LocalOutter() {
		System.out.println("외부 클래스의 생성자");
	}//LocalOutter

	public void method(final int paramI,int paramJ) {
		final int loc_i = 0;
		int loc_j = 0; //지역변수는 접근지정자x
		
		////////////////////////local class 시작////////////////////////
		class Inner{
			int in_i;
			public Inner() {
				System.out.println("로컬 클래스의 생성자");
			}
			
			public void inMethod() {
				System.out.println("Local class의 inner method " + in_i);
				out_i = 12;
				System.out.println("외부클래스의 instance 변수 " + out_i);
				//내부클래스에서는 final이 있는 지역 변수만 사용할 수 있다. (사용만 가능, 값 할당은 불가)
				//paramI = 10; //final은 값 할당 불가(초기화할 때 한 번만 가능)
				//paramJ = 20; //final이 없어도 final이 있는 것으로 간주(JDK 1.8부터)
				System.out.println("매개변수 paramI : " + paramI + ", paramJ : " + paramJ);
				System.out.println("지역변수 loc_i : " + loc_i + ", loc_j : " + loc_j);
			}//inMethod
		}
		////////////////////////local class 끄읏////////////////////////
		Inner in = new Inner();
		in.inMethod();
	}//method
	public static void main(String[] args) {
		LocalOutter lo = new LocalOutter();
		lo.method(2023, 6);
	}//main

}//class
