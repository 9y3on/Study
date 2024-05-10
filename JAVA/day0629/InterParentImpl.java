package day0629;

/**
 * interface를 구현하는 클래스
 * interface 내 abstract method를 모두 구현해야한다.
 * @author user
 */
public class InterParentImpl implements InterParent{

	@Override
	public void test() {
		System.out.println("Constant 사용 : " + InterParent.VALUE);
	}
	
	@Override
	public int test(String str) {
		return Integer.parseInt(str);
	}
	
	public static void main(String[] args) {
		//인터페이스는 객체화가 되지 않는다. 생성자가 없으니까!
		//InterParent ip = new InterParent();
		
		//is a 관계의 객체화는 가능
		InterParent ip = new InterParentImpl();
		//ip객체로 사용할 수 있는 자원은 상수, Override 된 method, default method
		//Override 된 abstract method
		ip.test();
		System.out.println(ip.test("100"));
		
		//default method
		System.out.println(ip.msg());
		
//		InterParentImpl ip = new InterParentImpl();
//		ip.test();
		
	}//main

}//class
