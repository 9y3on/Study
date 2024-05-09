package day0621;

/**
 * 문자열 : 문자열은 문자열 저장소에 유일하게 하나만 생성된다. <br>
 * 문자열을 저장하기위해 자바에서는 java.lang.String class를 제공한다. <br>
 * java.lang.String 클래스는 자바에서 유일하게 기본형의 문법으로 사용할 수 있는 클래스이다. <br>
 * -> 기본형, 참조형 모두 가능<br>
 * 사용법)<br>
 * - 기본형 형식) new를 사용하지 않는다.<br>
 * String str = "값";<br>
 * - 참조형 형식) new를 사용<br>
 * String str = new String("값");
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		
		//기본형 형식) 문자열 저장소의 주소를 바로 저장(stack에 저장)
		String str = "AbcdE";
		
		//참조형 형식) stack에서 힙의 주소를 저장하고, 힙에서는 문자열 저장소의 주소를 저장
		String str1 = new String("AbcdE");
		
		System.out.println(str + " / " + str1);
		
		// == 을 사용하여 참조형 데이터형을 비교하면 주소가 같은지를 비교(기본형의 경우 값 비교)
		if(str == "AbcdE") {
			System.out.println("기본형 주소 같음");
		}else {
			System.out.println("기본형 주소 다름");
		}
		
		if(str1 == "AbcdE") { //str1은 heap의 주소, AbcdE는 문자열 저장소의 주소가 저장되어있음
			System.out.println("참조형 주소 같음");
		}else {
			System.out.println("참조형 주소 다름");
		}
		
		System.out.println("--------------------------");
		
		//생성하는 문법에 따라 ==은 다른 결과를 보여준다. -> equals 메소드 사용
		if(str.equals("AbcdE")) {
			System.out.println("기본형 equals 같음");
		}else {
			System.out.println("기본형 equals 다름");
		}
		
		if(str1.equals("AbcdE")) {
			System.out.println("기본형 equals 같음");
		}else {
			System.out.println("기본형 equals 다름");
		}
		//equals method는 String의 생성방법과 상관없이 동일한 비교를 수행(문자열 자체를 비교)
		
		//length - 글자 수
		String mail = new String("y_eoniii@naver.com");
		System.out.println(str + "의 글자 수 " + str.length());
		int mailLeng = mail.length();
		System.out.println(mail + "의 글자 수 " + mailLeng);
		
		//toUpperCase - 문자열을 전부 대문자로
		System.out.println(str + "을 모두 대문자로 " + str.toUpperCase());
		//toLowerCase - 문자열을 전부 소문자로
		String lowerCase = str.toLowerCase();
		System.out.println(str + "을 모두 소문자로 " + lowerCase);
		
		//indexOf - 해당 글자의 인덱스 반환
		System.out.println(str + "에서 'd'의 인덱스 " + str.indexOf("d")); // 3
		System.out.println(str + "에서 'd'의 인덱스 " + str.indexOf("bcd")); // 1
		System.out.println(str + "에서 'd'의 인덱스 " + str.indexOf("f"));
		
		String name = "김다영";
		if(name.indexOf("김") == 0) {
			System.out.println("김씨입니다.");
		}else {
			System.out.println("김씨가 아닙니다.");
		}
		
		
		//indexOf - 문자에 해당하는 인덱스 반환
		str = "java";
		//indexOf는 왼쪽에서부터 오른쪽으로 진행하면서
		//처음 일치하는 문자열의 시작 인덱스를 반환
		//처음 a
		System.out.println(str + " a의 인덱스 " + str.indexOf("a"));
		
		//lastIndexOf는 오른쪽에서 왼쪽으로 진행하면서
		//처음 일치하는 문자열의 인덱스를 반환 -> 즉, 마지막으로 일치하는 문자의 인덱스를 반환
		//마지막 a
		System.out.println(str + " a의 인덱스 " + str.lastIndexOf("a"));
		
		//첫 번째 a를 건너뛰고 두 번째 a의 인덱스를 반환
		//두 번째 a
		System.out.println(str + " a의 인덱스 " + str.indexOf("a")+1); 
		
		//charAt - 인덱스에 해당하는 문자 출력
		str = "AbcdeF";
		System.out.println(str + "에서 3번째 인덱스의 문자 " + str.charAt(3));
		char c = str.charAt(1); //인덱스에 해당하는 유니코드 저장
		System.out.println(c); //유니코드에 해당하는 문자 출력
		
		//substring - 시작 인덱스부터 끝 인덱스전까지 문자열 반환, 끝 인덱스+1해야 제대로 된 결과가 나옴
		//슈퍼스트링 - AbcdeF, 서브스트링(자식문자열) - bcd, cde...등 슈퍼스트링에 속한 문자열
		System.out.println(str + "에서 2~4인덱스 사이의 자식 문자열 " + str.substring(2,5));
		//y_eoniii@naver.com - 메일주소@도메인주소
		//mail변수에서 메일주소와 도메인 주소를 잘라서 출력
		System.out.println(mail.substring(0,mail.indexOf("@")));
		System.out.println(mail.substring(mail.indexOf("@")+1, mail.length()));
		//substring method는 시작인덱스만 넣으면 알아서 끝까지 잘라주는 method도 있다. (overload)
		System.out.println(mail.substring(mail.indexOf("@")+1));
		
		//trim - 앞뒤공백 제거
		str = "     A BC   ";
		System.out.println(str + " [" + str.trim() + "]");
		System.out.println(str.equals("A BC")); //공백을 포함하여 비교함
		System.out.println(str.trim().equals("A BC")); //trim을 사용하여 공백제거 후 비교
		
		//startsWith - 특정 문자열로 시작하는지 T,F 여부
		//str = "서울시 강남구 역삼동";
		str = "경기도 수원시 영통동";
		if(str.startsWith("서울시")) {
			System.out.println("서울");
		}else {
			System.out.println("지방");			
		}
		
		//endsWith - 특정 문자열로 끝났는지 T,F 여부
		str = "서울시 동작구 상도동";
		if(str.endsWith("도동")) {
			System.out.println("도시");
		}else {
			System.out.println("시골");
		}
		
		//contains - 특정 문자열을 포함하고 있는지 T,F 여부
		str = "오늘은 월요일 입니다.";
		if(str.contains("요일")) {
			System.out.println("요일을 말하는 문장");
		}else {
			System.out.println("문장");
		}
		
		//concat - 문자열 연결
		str = "오늘도 긴시간 ";
		System.out.println(str.concat("수고하셨습니다."));
		System.out.println(str + "수고하셨습니다.");
		
		//replace - 문자열 치환(변경), replaceAll과 같음
		str = "오늘은 화창한 하루입니다.";
		System.out.println(str + " / " + str.replaceAll("화창한", "비오는"));
		//Method의 반환형이 [객체]라면 . 을 사용하여 계속 연결하여 호출할 수 있다. (참조형이면 o 기본형이면x)
		//-> Method chain
		str = "어 나는 지금 피씨방이야! 넌 어딘데 씨방새야?";
		System.out.println(str.replaceAll("씨", "*").replaceAll("방", "*"));
		
		str = "951212-1234567";
		//str은 주민번호가 들어있다. 이 주민번호가 남자인지 여자인지를 판단하여 출력
		if(str.charAt(7)=='1' || str.charAt(7)=='3' || str.charAt(7)=='5' || str.charAt(7)=='7' ) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다.");
		}
		
		//isEmpty - 문자열이 비었는지 확인 => 빈 경우 사용할 수 없음
		//문자열이 빈 경우 - 객체가 생성이 되지않았을 때 => 참조형 데이터형이 null일 때
		//				 값을 가지고 있지 않을 때 => 객체가 생성은 되었으나 값이 없을 때
		//null => 참조형 데이터형이 heap의 주소를 가지지 않았음
		
		str = null; //객체가 생성되지 않음 => 사용불가 => null일 경우 메소드 사용불가(객체가 없으므로)
		str1 = ""; //객체는 생성되었으나 값이 없음 => 사용불가
		if(str == null) {
			System.out.println("str 객체가 생성되지 않았음");
			//str.length(); 객체가 없으므로 메소드 사용불가 
						  //객체가 생성되지 않은 상태에서는 instance method를 호출할 수 없다.
		}
		
		if(str1.isEmpty()) {
			System.out.println("비었음");
		}else {
			System.out.println("비어있지 않음");
		}
		
	}//main

}//class
