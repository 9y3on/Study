package day0626;

public class UseWork0626 {

	public static void main(String[] args) {
		Work0626VO[] wVO = new Work0626VO[7];
		Work0626 w = new Work0626();
		
		wVO[0] = new Work0626VO("강다연", "경기도 수원시 영통구 영통동", 26);
		wVO[1] = new Work0626VO("김다영", "서울시 강남구 역삼동     ", 25);
		wVO[2] = new Work0626VO("김선경", "서울시 강남구 서초동     ", 25);
		wVO[3] = new Work0626VO("김주민", "마계인천시 부평구 부평동  ", 26);
		wVO[4] = new Work0626VO("박상준", "서울시 동대문구 동대문동  ", 27);
		wVO[5] = new Work0626VO("홍찬영", "수원시 수원동          ", 30);
		wVO[6] = new Work0626VO("장영석", "서울시 구로구 구로동     ", 28);
		
		System.out.println("이름\t주소\t\t\t나이");
		
		for(int i = 0; i < wVO.length; i++) {
			System.out.printf("%s\t%s\t%d\n",wVO[i].getName(),wVO[i].getAddress(),wVO[i].getAge());
		}
		System.out.println();
		
		//이름에 "영"이 들어가는 사람
		int youngCnt = w.youngCnt(wVO);
		System.out.println("이름에 영이 들어가는 사람 : " + youngCnt + "명");
		
		//서울시에 살고있는 사람
		System.out.print("서울에 살고있는 사람 : ");
		w.seoulPrint(wVO); //1.바로 출력
//		String seoulName = w.seoulStr(wVO); //2.문자열에 저장 후 출력
//		System.out.print("서울에 살고있는 사람 : " + seoulName);
//		System.out.print("서울에 살고있는 사람 : ");
//		String[] seoulNameArr = w.seoulStr(wVO).split(" "); //3.문자열을 배열로 바꾼 후 출력
//		for(String name : seoulNameArr) {
//			System.out.print(name + " ");
//		}
		
		//나이의 합산
		int ageTotal = w.ageTotal(wVO);
		System.out.println("\n나이 총합 : "+ ageTotal);
		
	}

}
