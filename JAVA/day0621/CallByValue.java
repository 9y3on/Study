package day0621;

/**
 * method의 매개변수가 기본형인 경우에는 값이 복사되어 들어간다.<br>
 * method안에서 값을 변경하더라도 원래 선언된 변수의 값은 변경되지 않는다.
 * @author user
 */
public class CallByValue {
	
	public void swap(int year, int month) {
		int temp = 0;
		temp = year;
		year = month;
		month = temp;
		System.out.println("swap 안 year : " + year + ", month : " + month);
	}

	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		int year = 2023; //매개변수가 기본형이라면 값이 복사되어 전달 
		int month = 6;	 //-> swap method의 year와 month는 복사된 값으로 
						 //main method안의 year, month에는 영향을 주지 않음
		System.out.println("swap 전 year : " + year + ", month : " + month);
		cbv.swap(year, month);
		//복사된 year와 month가 바뀌었을 뿐 원본의 year와 month는 그대로
		System.out.println("swap 후 year : " + year + ", month : " + month); 

	}

}
