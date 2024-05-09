package day0619;

/**
 * 마카펜의 기능을 구현한 클래스<br>
 * 마카펜<br> 
 * - 명사적 특징(변수,필드) : 뚜껑, 몸체, 색<br>
 * - 동사적 특징(메소드) : 쓴다.
 * @author user
 */
public class Marker {
	//class, method는 대부분 public
	//변수는 private
	private int cap;
	private int body;
	private String color; 
	//public을 사용하면 보안에 취약하기때문에 instance 변수는 private 접근 지정자를 가진다. 
	//-> 하지만 클래스 외부에서 해당 변수를 사용할 수가 없는 문제가 발생
	//---> 그럼 클래수 외부에서 호출가능한 method를 정의하여 instance 변수의 값을 바꿔주자
	//외부에서 호출가능한 method : setter method(값 설정), getter method(값 반환)
	
	public void setCap(int cap) { //메소드명 캐멀스타일
		this.cap = cap;
	}
	
	public void setBody(int body) { //가변 일
		this.body = body;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getCap() { //고정 값
		return cap;
	}
	
	public int getBody() {
		return body;
	}
	
	public String getColor() {
		return color;
	}
	
	/**
	 * 마카펜의 동사적인 특징을 구현한 method
	 * 입력받은 메시지를 칠판에 쓰는 일을 하는 method
	 * @param msg(칠판에 쓸 메시지)
	 * @return 행동
	 */
	public String write(String msg) { //method는 딱 정한 업무만
		return color + "색인 마카펜으로 칠판에 "+ msg + "를 쓴다.";
	}
}
