package day0615;

/**
 * 입력한 교통수단이 마을버스,버스,지하철 인 경우에는 아래와 같이 출력하고 <br>
 * 그렇지 않다면 “대중교통수단이 아닙니다.”를 출력 <br>
 * 아래 <br>
 * 입력하신 교통수단  XX 이고, 이동거리는 XXkm이다. <br>
 * 교통수단의 기본요금은 XX입니다. <br>
 * 편도요금 XX원, 왕복요금 XX원 한달 20일 기준이용 총 이용요금 XX입니다. 
 * @author user
 */
public class Work0615 {
	//기준값으로 사용할 Constant
	public static final int TOWN_BUS = 800;
	public static final int BUS = 1250;
	public static final int SUBWAY = 1300;
	
	public static void main(String[] args) {
		
		if(args[0].equals("마을버스") || args[0].equals("버스") || args[0].equals("지하철")) {
			
			int fare = 0; //기본요금을 저장할 변수 (대중교통인 경우에만 변수를 만들자)
			int overFare = 0; //추가 요금
			int distance = Integer.parseInt(args[1]); //입력된 이동 거리를 저장한 변수
			
			
			//입력된 대중교통의 기본 요금을 구하자
			if(args[0].equals("마을버스")) {
				fare = Work0615.TOWN_BUS;
			}else if(args[0].equals("버스")) {
				fare = Work0615.BUS;
			}else {
				fare = Work0615.SUBWAY;
			}//end else
			
			overFare = fare;
			
			//초과요금 구하기 위한 코드 작성
			//10km까지는 기본요금, 이동거리가 10km를 초과하면 매 5km마다 100원 추가 (11km부터 +100, 5km마다 추가로 +100)
			if(distance > 10) { //10km를 초과했을 때에만 초과요금을 계산한다.
				overFare = overFare + (((distance-10)/5)+1)*100; 
			}//end if
			
			//출력
			System.out.println("입력하신 교통수단 " + args[0] + "이고, 이동거리는 " + distance + "km이다.");
			System.out.println("교통수단의 기본요금은 " + fare + "원 입니다. 초과요금은 " + overFare + "원");
			System.out.println("편도요금 " + overFare + "원, 왕복요금 " + (overFare*2) + 
							   "원, 한달 20일 기준 총 이용요금 " + overFare*40 + "원 입니다.");
			
		} else {
			System.out.println(args[0] + "는(은) 대중교통수단이 아닙니다.");
		}//end else

	}//main

}//class
