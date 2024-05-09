package day0619;

/**
 * 특수문자 : 문자열 안에서 \뒤에 나오는 하나의 기능을 가진 문자
 * @author user
 */
public class EscapeCharacter {

	public static void main(String[] args) {
		//console에 안녕하세요? 출력
		System.out.println("안녕하세요?");
		//console에 '안녕하세요?' 출력
		System.out.println("'안녕하세요?'");
		//console에 "안녕하세요?" 출력
		System.out.println("\"안녕하세요?\"");
		System.out.print("안녕\n");
		System.out.print("하세요?\n");
		
		//C드라이브 하위에는 temp폴더가 있고, 그 안에는 test.txt 파일이 존재한다.
		//이 경로를 콘솔창에 출력해보세요. -> 경로 쓸 때는 그냥 슬래시로 쓰는 것을 권장~
		//역슬래시는 \\ 두 번 쓰기!
		System.out.println("C:\\temp\\test.txt");
		
		//지원하지않는 특수문자는 사용할 수 없다. \d나 \e를 특수문자로 판단 -> err
		//System.out.println("e:\dev\env.bat");
	}//main

}//class