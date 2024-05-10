package day0627;

public class SuperWork0627 {
	
	public SuperWork0627() {
		//기본생성자
	}

	//성 출력
	public void separateName(String[] names) {
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i].charAt(0) + " ");
		}
		System.out.println();
	}

}
