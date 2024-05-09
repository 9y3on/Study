package day0622;

public class Work0622 {
	
	private String ssn;
	private int year; //인스턴스 변수! 주로 private 쓰자~ 
	
	//생성자
	public Work0622(String ssn) {
		this.ssn = ssn;
		
		char years = ssn.charAt(7);
		year = Integer.parseInt(ssn.substring(0,2));
		if(years=='1' || years=='2' || years=='5' || years=='6') {
			year+=1900;
		}else if(years=='3' || years=='4' || years=='7' || years=='8') {
			year+=2000;
		}else {
			year+=1800;
		}
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	//2번
	public boolean checkNumber() {
		if(ssn.length() == 14) {
			return true;			
		}else {
			return false;
		}
	}
	
	//3번
	public boolean checkHyphen() {
		if(ssn.charAt(6) == '-') {
			return true;
		}else {
			return false;
		}
	}
	
	//4번
	public String returnBirth() {
		String month = ssn.substring(2,4);
		String day = ssn.substring(4,6);
		
		return year + "년 " + month + "월 " + day + "일";
	}
	
	//5번
	public int returnAge() {
		if(year > 2023) {
			return 0;
		}
		
		return 2023-year+1;
	}
	
	//6번
	public String returnGender() {
		int checkGender = ssn.charAt(7)-'0';
		if(checkGender%2 == 0) {
			return "여자";
		}else {
			return "남자";
		}
	}
	
	//7번
	public String returnAnimal() {
		// 0-원숭이, 1-닭, 2-개, 3-돼지, 4-쥐, 5-소, 6-호랑이, 7-토끼, 8-용, 9-뱀, 10-말, 11-양
		int animalNumber = year%12;
		String animal;
		switch(animalNumber) {
		case 0 : animal = "원숭이띠"; break;
		case 1 : animal = "닭띠"; break;
		case 2 : animal = "개띠"; break;
		case 3 : animal = "돼지띠"; break;
		case 4 : animal =  "쥐띠"; break;
		case 5 : animal =  "소띠"; break;
		case 6 : animal =  "호랑이띠"; break;
		case 7 : animal =  "토끼띠"; break;
		case 8 : animal =  "용띠"; break;
		case 9 : animal = "뱀띠"; break;
		case 10 : animal = "말띠"; break;
			default : animal = "양띠";
		}
		return animal;
	}

	public static void main(String[] args) {
		String ssn = "990908-2234567";
		Work0622 w = new Work0622(ssn); 
		if(w.checkNumber()){
			 if(w.checkHyphen()){
			    System.out.println("입력주민번호 : " + w.getSsn());
			    System.out.println("생년월일 : " + w.returnBirth() );
			    System.out.println("나이 : " + w.returnAge());
			    System.out.println("성별 : "+ w.returnGender());
			    System.out.println("띠 : "+ w.returnAnimal());
			  }else{
			   System.out.println("'-'이 정상적인 위치에 없습니다.");
			   }
			}else{
			 System.out.println("주민번호의 글자수가 맞지 않습니다.");
			}//end else

	}

}
