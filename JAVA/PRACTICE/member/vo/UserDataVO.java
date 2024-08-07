package kr.co.sist.member.vo;

public class UserDataVO {
	private String name, email;

	public UserDataVO() {
	}//constructor

	public UserDataVO(String name, String email) {
		this.name = name;
		this.email = email;
	}//constructor

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDataVO [name=" + name + ", email=" + email + "]";
	}
	
}//class
