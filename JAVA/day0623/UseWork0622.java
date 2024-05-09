package day0623;

public class UseWork0622 {

	public static void main(String[] args) {
		String ssn = "990908-2234567"; //입력할 주민번호
		//1. 객체화 - 일을 하는 클래스를 객체로 생성
		Work0622 work = new Work0622(ssn);
		
		//2. 객체가 제공하는 일을 사용
		if(work.chkSsnLength()){
			 if(work.chkSsnHyphen()){
			    System.out.println("입력주민번호 : " + work.getSsn());
			    System.out.println("생년월일 : " + work.birth() );
			    System.out.println("나이 : " + work.age() + "살");
			    System.out.println("성별 : "+ work.gender());
			    System.out.println("띠 : "+ work.zodiac() + "띠");
			  }else{
			   System.out.println("'-'이 정상적인 위치에 없습니다.");
			   }
			}else{
			 System.out.println("주민번호의 글자수가 맞지 않습니다.");
			}//end else
	}

}
