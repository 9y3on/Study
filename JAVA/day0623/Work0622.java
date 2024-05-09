package day0623;

/**
 * 주민번호로 길이, 형식, 생년월일, 나이, 성별, 띠를 구하는 일을 가지고 있는 클래스
 * @author user
 */
public class Work0622 {
	
	private String ssn;
	private int year;
	private int genderFlag;
	
	/**
	 * 주민번호를 입력받아 인스턴스 변수에 저장하는 생성자
	 * @param ssn
	 */
	public Work0622(String ssn) {
		this.ssn = ssn;
	}
	
	/**
	 * 인스턴스 변수에 저장된 주민번호를 변경할 때 사용하는 method
	 * @param ssn 주민번호
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	/**
	 * 객체가 가지고 있는 주민 번호를 반환하는 일
	 * @return 주민번호
	 */
	public String getSsn() {
		return ssn;
	}
	
	/**
	 * 주민번호가 14자인지 길이를 체크
	 * @return boolean
	 */
	public boolean chkSsnLength() {
		//boolean flag = ssn.length()==14;
		
		return ssn.length()==14; //return은 마지막에 한 번만
	}//chkSsnLength

	/**
	 * 주민번호의 6번째 문자가 '-' 인지 확인
	 * @return
	 */
	public boolean chkSsnHyphen() {
		//boolean flag = ssn.charAt(6)=='-';

		return ssn.charAt(6)=='-'; //return ssn.indexOf('-')==6;
	}//chkSsnHyphen
	
	/**
	 * 주민번호에서 생년월일을 잘라내서 반환
	 * @return
	 */
	public String birth() {
		String result = ""; //empty
		//48-0, 49-1 ..이므로 숫자에서 유니코드 0(48)을 빼면 int 숫자가 됨
		genderFlag = ssn.charAt(7)-'0'; 
		
		//'-'의 뒷자리가 1,2 - 내국인 1900년대생 | 5,6 - 외국인 1900년대생
		//			  3,4 - 내국인 2000년대생 | 7,8 - 외국인 2000년대생
		//			  0,9 - 내국인 1800년대생
		int tempYear = 1800;
		if(genderFlag==1 || genderFlag==2 || genderFlag==5 || genderFlag==6) {
			tempYear = 1900;
		}else if(genderFlag==3 || genderFlag==4 || genderFlag==7 || genderFlag==8) {
			tempYear = 2000;
		}
		
		int[] temp = {1800,1900,1900,2000,2000,1900,1900,2000,2000,1800};
		year = temp[genderFlag] + Integer.parseInt(ssn.substring(0,2)); //연도에 십의자리,일의자리 수를 더함 => 1900 + 95
		
		//year = tempYear + Integer.parseInt(ssn.substring(0,2));//95 => 0,2-1 = 0,1의 자리
		result = year + "년 " + ssn.substring(2,4) + "월 " + ssn.substring(4,6) + "일";
				
		return result;
	}//birth
	
	/**
	 * 주민번호에서 나이를 구하여 반환
	 * @return 나이
	 */
	public int age() {
		int age = 2023-year;
		return age;
	}//age
	
	/**
	 * 주민번호에서 성별을 구하여 반환
	 * @return
	 */
	public String gender() {
		String gender = "남자";
		if(genderFlag%2 == 0)
			gender = "여자";
		
		//gender = genderFlag%2==0 ? "여자" : "남자";
		
		return "여자,남자".split(",")[genderFlag%2];
	}//gender
	
	/**
	 * 주민번호에서 띠를 구하여 반환
	 * @return
	 */
	public String zodiac() {
//		String[] zodiacTitle = 
//			{"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};	
//		String z = "원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양";
//		String[] zodiac = z.split(",");

		//"원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양".split(",") -> 이 자체가 배열이 됨 zodiac[year%12] 형태와 같음
		return "원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양".split(",")[year%12];
	}//zodiac


}
