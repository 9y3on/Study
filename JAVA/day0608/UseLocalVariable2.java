package day0608;
class  UseLocalVariable2 {
	public static void main(String[] args) {
		//올해를 저장하는 변수와 나이를 저장하는 변수를 선언한 후 출력하는 코드 작성
		//변수명을 알아볼 수 있게 작성

		int year = 2023;
		int age = 25;

		System.out.println("올해 연도 : " + year + " \n나이 : " + age);

		int i = 2023;
		int j = 25;

		System.out.println(year - age); //가독성 향상
		System.out.println(i - j); //가독성 저하

		//java에서는 이름(변수명,method명,class명)을 한글로 설정할 수 있다.
		//하지만, 한글로는 설정하지 않는다.
		int 올해 = 2023;
		int 나이 = 25;
		System.out.println(올해 - 나이);

	} //main
} //class
