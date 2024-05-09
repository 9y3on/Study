package day0623;

public class UseString {

	public UseString() { //기본생성자
		String csvData = "Java,Oracle,JDBC~HTML,CSS,JavaScript";
		String[] arr = csvData.split(",");
		
		for(int i = 0; i < arr.length ; i++) {			
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		new UseString(); //사용할 method가 없으므로 변수에 저장할 필요x

	}//main

}//class
