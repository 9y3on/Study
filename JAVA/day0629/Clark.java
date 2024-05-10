package day0629;

/**
 * 사람 클래스를 상속받아 사람의 공통 기능을 사용하며<br>
 * 자신 만의 특징을 정의하는 클래스<br>
 * -공통 기능:눈, 코, 입, 이름, 먹는 일<br>
 * 자신만의 특징(힘이 쎔)을 정의하는 클래스<br>
 * 힘의 레벨은 1~10이며 2는 일반인이다.<br>
 * final클래스이므로 자식 클래스를 가질 수 없다.
 * @author user
 */
public final class Clark extends Person implements Fly{
	
	public int power; //public이므로 getter/setter 필요x
	
	/**
	 * 기본 생성자 - 눈2, 코1, 입1개가 설정되어 클락 클래스가 생성된다.
	 * 힘 레벨이 8로 설정된다.
	 */
	public Clark() {
		super();
		power = 8;
	}//Clark
	
	/**
	 * 입력되는 돌의 종류에 따라 힘이 설정되는 일
	 * @param stone 돌의 종류
	 * @return
	 */
	public String power(String stone) {
		String result = "";
		if(stone.equals("크립토나이트")) {
			power = 1;
			result="힘 빠짐...~(_-_)~";
		}else if(stone.equals("다이아몬드")) {
			result="감사합니다. ~(^^~)(~^^)~";
		}else {
			power = 14;
			result="열 바듬.ㅡㅡ^";			
		}
		return result;
	}//power
	
	@Override
	public String eat() {
		return getName() + "이(가) 집에서 베이글을 옴뇸뇸 먹는다.";
	}
	
	public String eat(String menu, int price) {
		return getName() + "이(가) 식당에서 " + menu +"인 음식을 " + price+"$ 주고 사먹는다.";
	}

	@Override
	public String[] language() {
		String[] lang = {"영어","외계어"};
		return lang;
	}

	@Override
	public String drivingForce() {
		return "추진력";
	}
	
	@Override
	public String upwordForce() {
		return "양력";
	}
	
}//class
