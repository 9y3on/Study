package day0616.sub;

import day0616.ModifiersA;

/**
 * ModifiersA의 자식 클래스
 * 
 * @author user
 */
public class UseModifiersD extends ModifiersA {

	public static void main(String[] args) {
		//자식 클래스(UseModifiersD)는 자신(UseModifiersD)을 생성하여 
		//부모(ModifiersA)의 기능을 사용한다.
		UseModifiersD umd = new UseModifiersD(); //public, protected 사용 가능
		
		System.out.println("public a = " + umd.a);
		System.out.println("protected b = " + umd.b);
//		System.out.println(" c = " + umd.c);
//		System.out.println("private d = " + umd.d);
	
	}//main

}//class
