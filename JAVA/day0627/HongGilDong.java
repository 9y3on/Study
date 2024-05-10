package day0627;

/**
 * 사람 클래스를 상속받아 사람의 공통 기능을 사용하며<br>
 * 자신 만의 특징을 정의하는 클래스<br>
 * -공통 기능:눈, 코, 입, 이름, 먹는 일<br>
 * 자신만의 특징(싸움 잘함)을 정의하는 클래스<br>
 * 싸움 레벨은 1~10이며 2는 일반인이다.<br>
 * @author user
 */
public class HongGilDong extends Person{
	//홍길동 is a Person -> is a 관계
	private int level;
	
	/**
	 * 기본 생성자 - 눈2, 코1, 입1개가 설정되어 홍길동 클래스가 생성된다.
	 * 싸움 레벨이 6으로 설정된다.
	 */
	public HongGilDong() {
		super();
		level = 6;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
	/**
	 * 싸움하는 일<br>
	 * 이기거나 지거나 비김
	 * @param yourLevel 상대방의 레벨
	 * @return 싸움 결과
	 */
	public String fight(int yourLevel) {
		String result = "";
		if(yourLevel < level) { //이기는 경우
			result = "이겼습니다.s(^o^)V";
			level++;
			if(level > 10) {
				level = 10;
			}//end if
		}else if(yourLevel > level) { //지는 경우
			result = "졌음. ~(_-_)~";
			level--;
			if(level < 1) {
				level = 1;
			}
		}else {//비기는 경우
			result = "비겼음. Orz";
		}//end else
		return result;
	}
	
	//매개변수는 데이터형이 중요, 매개변수 명은 중요하지 않음
	/**
	 * 주막에서 음식을 n푼 내고 사먹는 일
	 */
	@Override
	public String eat(String menu, int price) {
		//name 변수는 접근 지정자가 private이므로 직접 접근이 되지 않는다.
		//자식 클래스에서 부모 클래스의 name을 사용하고 싶다면
		//getter method를 사용하여 부모의 변수를 사용한다.
		//같은 instance 영역에서는 객체화 안 하고 사용 가능
		return getName() + "이(가) 주막에서 " + menu + "인 음식을 " + price + "푼 내고 사먹는다.";
	}
	
}
