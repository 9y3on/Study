package day0608;
class  Work0608{
	public static void main(String[] args) 
	{
		char fristInitial='Y', middleInitial='S', lastInitial='Y', c = 'A';
		int year = 1999, cost = 1250;
		double leftEye = -6.00, rightEye = -6.00;

		System.out.println("내 이름은 양승연이고 이니셜은 " + fristInitial + middleInitial + lastInitial + " 입니다.");
		System.out.println("태어난 해는 " + year + "년으로 나이는 " + (2023 - year + 1) + "살 입니다.");
		System.out.println("왼눈 시력 " + leftEye + " 오른 눈 시력 " + rightEye + " 양안 시력 " + (leftEye + rightEye)/2 );
		System.out.println("편도 차비 " + cost + "원 왕복차비 " + cost * 2 + "원 입니다. 한 달 20일 출근을 하면 월 교통비는 총 " + cost * 2 * 20 + "입니다.");
		System.out.println("대문자 \'" + c + "\'의 코드 값은 " + (int) c + "입니다. A + 32를 하면 소문자 \'" + (char)(c + 32) + "\'를 만들 수 있습니다.");
	}
}
