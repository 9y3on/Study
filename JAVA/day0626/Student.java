package day0626;

/**
 * 사용자 정의 자료형(데이터형) - Value Object(VO)<br>
 * - 자바에서 제공하는 데이터형을 조합하여 새로운 이름(클래스명)의 데이터형을 만드는 것<br>
 * - 값을 여러개 저장하고 전달하는 객체<br>
 * - 참조형 데이터형이므로 new 예약어 사용
 * @author user
 */
public class Student {
	
	private String name;
	private int age;
	private double height;
	private double weight;
	private String email;
	
	public Student() {
		//개발자가 임의의 생성자를 만들었다면 기본생성자는 자동으로 생성되지 않음
		//생성자를 만들지 않았을 경우에만 자동으로 생성 됨

	}
	
	public Student(String name, int age, double height, double weight, String email) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}//class
