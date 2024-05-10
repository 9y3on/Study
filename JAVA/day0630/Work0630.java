package day0630;

public class Work0630 {
	
	public static final int UPPER = 0;
	public static final int LOWER = 1;
	public static final int NUMBER = 2;
	
	public Work0630() {
		//기본 생성자
	}
	
	public String backUpFile(String file) {
		int dot = file.lastIndexOf(".");
		StringBuilder tempFile = new StringBuilder(file);
		
		if(file.contains(".")) {
			tempFile.insert(dot, "_bak");
		}else {
			tempFile.append("_bak");
		}
		
		return tempFile.toString();
	}
	
	private String password() {
		StringBuilder password = new StringBuilder();
		
		for(int i = 0; i < 8; i++) {
			switch((int)(Math.random()*3)) {
			case UPPER :
				password.append((char)((Math.random()*26)+65));
				break;
			case LOWER :
				password.append((char)((Math.random()*26)+97));
				break;
			case NUMBER :
				password.append((char)((Math.random()*10)+48));
				break;
			}
		}

		return password.toString();
	}
	
	//char[]를 사용하여 임의 비밀번호 생성
	public String pass2() {
		char[] password = new char[8];
		int random;
		//배열은 출력시 주소가 나오지만 char 배열은 유일하게 값이 나온다.
		for(int i = 0; i < password.length; i++) {
			random = (int)(Math.random()*123); //0~122
			if((random > 48 && random < 57) || (random > 64 && random < 91) ||
			   (random > 96 && random < 123)) {
				password[i] = (char)random;
			}else {
				i--; //8번 이상 반복할 수 있음 -> 좋은 코드는 아니다!
			}
		}//end for

		return new String(password);
	}//pass2
	
	public String pass3() {
		StringBuilder sbPass = new StringBuilder();
		int idx;
		
		String passChar = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		
		for(int i=0; i < 8; i++) {
			idx = (int)(Math.random()*passChar.length());
			sbPass.append(passChar.charAt(idx));
		}
		
		return sbPass.toString();
	}//pass3
	
	public String getPassword() {
		return password();
	}

}
