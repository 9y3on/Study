package day0621;

public class UseString2 {
	//입력받은 이메일의 유효성 검증을 수행하는 method를 만들어서
	//유효하면 true, 그렇지 않으면 false를 반환 => 가변 값
	
	public boolean emailValidation(String email) {
		if(email.indexOf("@") != -1 && email.indexOf(".") != -1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		String email1 = "test";
		String email2 = "test@test.com";
		String email3 = "test@testcom";
		String email4 = "testtest.com";
		String email5 = "test@sist.co.kr";
		
		UseString2 us = new UseString2();
//		if(us.emailValidation(email5)) {
//			System.out.println("유효");
//		}else {
//			System.out.println("유효하지 않습니다.");
//		}
		
		System.out.println(email1 + " : " + us.emailValidation(email1));
		System.out.println(email2 + " : " + us.emailValidation(email2));
		System.out.println(email3 + " : " + us.emailValidation(email3));
		System.out.println(email4 + " : " + us.emailValidation(email4));
		System.out.println(email5 + " : " + us.emailValidation(email5));
		
	}

}
