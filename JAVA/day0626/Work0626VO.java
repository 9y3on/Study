package day0626;

public class Work0626VO {

	private String name;
	private String address;
	private int age;
	
	public Work0626VO() { //기본생성자
	}

	public Work0626VO(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}

}
