package day0608;
/*
값을 개발자가 원하는 데이터형으로 일시적 변환을 수행하는 Casting의 사용
값 손실이 발생할 수 있다.
*/

class UseCasting {
	public static void main(String[] args) {
		
		float f = 2023.06f;
		int i = 0;
		//i = f; //byte크기는 같으나 저장하는 값의 종류가 다르기 때문에 error
		i = (int) f; //실수부가 사라지는 값 손실이 발생한다.
		System.out.println("int : " + i + ", float : " + f);

		i = 65;
		char c = (char) i; //byte크기가 달라서 error (c가 더 작음)
		System.out.println("char : " + i + ", int : " + c);

		double d = 0.123456789;
		f = (float)d; //byte크기가 달라서 error (f가 더 작음) 값 손실 발생
		System.out.println("float : " + f + ", double : " + d);

		float f1 = (float)1.23; // 리터럴은 그대로 두고, 할당할 때 데이터형을 변경하여 할당
		float f2 = 1.23F; // 리터럴 자체를 줄여서 저장하고 할당
		System.out.println(f1 + ", " + f2);

		//boolean형은 다른 데이터형으로 casting 되지 않는다.
		boolean flag = true;
		//boolean flag1 = (boolean) 1; //다른 형은 boolean으로 casting 되지않는다.
		//i = (int)flag; //boolean은 다른형으로 casting 되지 않는다.
		boolean flag1 = (boolean) flag; // boolean은 boolean으로만 casting이 된다.
		System.out.println((boolean)flag);

		//기본형은 참조형으로, 참조형이 기본형으로 casting 될 수 없다.
		String str = "안녕";
		System.out.println(str);

		byte num1 = 10;
		byte num2 = 20;
		byte result = 0;
		result = (byte) (num1 + num2);
		System.out.println(num1 + " + " + num2 + " = " + result);

	}//main
}//class
