package day0612;
/*
관계연산자
>, <, >=, <=, ==, !=
*/

class Operator4 {
	public static void main(String[] args) {
		//== 같으면 true, 다르면 false
		int i = 6, j = 12, k = 6;
		System.out.println(i + " == " + k + " = " + (i==k));

		boolean flag = i == j; // = 대입, == 관계
		System.out.println(i + " == " + j + " = " + flag);
	
		// != 다르면 true, 같으면 false
		System.out.println(i + " != " + k + " = " + (i!=k));

		flag = i != j; // default value = initial value(초기화값), 같은 이름의 변수는 한 번만 선언할 수 있다. 변수 이름 변경, 데이터형x
		System.out.println(i + " != " + j + " = " + flag);
	}
}
