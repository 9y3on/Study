package day0616;

/**
 * 접근 지정자 접근 확인 연습
 * @author user
 */
public class ModifiersA {

	public int a;
	protected int b;
	int c;
	private int d;

	public static void main(String[] args) {
		
		ModifiersA ma = new ModifiersA();
		
		System.out.println("public a = " + ma.a);
		System.out.println("protected b = " + ma.b);
		System.out.println(" c = " + ma.c);
		System.out.println("private d = " + ma.d); //접근이 안 될수록 안전 -> 변수 접근지정자는 주로 private
	}
	
}
