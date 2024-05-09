package day0616.sub;

import day0616.ModifiersA; //다른 패키지 클래스 사용시 import

public class UseModifiersC {

	public static void main(String[] args) {
		//다른 패키지(day0616)의 클래스를 사용 : public만 사용가능
		
		ModifiersA ma = new ModifiersA();
		
		System.out.println("public a = " + ma.a);
//		System.out.println("protected b = " + ma.b);
//		System.out.println(" c = " + ma.c);
//		System.out.println("private d = " + ma.d);
		
	}

}
