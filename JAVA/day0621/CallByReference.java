package day0621;

public class CallByReference {
	
	int i;
	int j;
	
	public void swap(CallByReference cbr) {
		int temp = 0;
		temp = cbr.i;
		cbr.i = cbr.j;
		cbr.j = temp;
		System.out.println("swap 안 i = " + cbr.i + " j = " + cbr.j);
	}

	public static void main(String[] args) {
		CallByReference cbr = new CallByReference(); //인스턴스화
		cbr.i = 6;
		cbr.j = 21;
		System.out.println("swap 전 i = " + cbr.i + " j = " + cbr.j);
		cbr.swap(cbr); //method 사용시 객체명.메소드명(매개변수)
		//매개변수가 참조형일 경우 주소를 그대로 전달 -> method에서 값 변경시 main method에서도 값이 변경됨
		System.out.println("swap 후 i = " + cbr.i + " j = " + cbr.j); 
		
	}

}
