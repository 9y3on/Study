package day0609;
class Work0609 {

	public static final int MONTH_MONEY = 500000;
	public static final int MONTH = 20;

	public static void main(String[] args) {

		int cost = 1250, lunch = 10000;

		System.out.println("한달 용돈은 " + Work0609.MONTH_MONEY + "원 하루 용돈은 " + Work0609.MONTH + "일 기준으로 " +
								(Work0609.MONTH_MONEY / Work0609.MONTH) + "원 입니다.\n하루 사용 비용은 편도 교통비 " + 
								cost + "원 왕복교통비 " + (cost * 2) + "원 점심식대 " + lunch + "원으로 총 " + (cost * 2 + lunch) + "원 입니다.");
		System.out.println("한달이 지나면 남은 금액 " + (Work0609.MONTH_MONEY - (cost * 2 + lunch) * Work0609.MONTH) + "원 입니다.\n");

		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE + ", 최대값 : " + Byte.MAX_VALUE +
								 "\nshort의 최소값 : " + Short.MIN_VALUE + ", 최대값 : " + Short.MAX_VALUE +
								 "\nint의 최소값 : " + Integer.MIN_VALUE + ", 최대값 : " + Integer.MAX_VALUE +
								 "\nlong의 최소값 : " + Long.MIN_VALUE + ", 최대값 : " + Long.MAX_VALUE +
								 "\ndouble의 최소값 : " + Double.MIN_VALUE + ", 최대값 : " + Double.MAX_VALUE +
								 "\nfloat의 최소값 : " + Float.MIN_VALUE + ", 최대값 : " + Float.MAX_VALUE);
	}
}
