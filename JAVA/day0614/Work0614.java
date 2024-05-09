package day0614;

public class Work0614 {
	public static final int TOWNBUS_COST = 800;	
	public static final int BUS_COST = 1250;
	public static final int SUBWAY_COST = 1300;
	
	public static void main(String[] args) {

		int cost = 0;
//		switch (args[0]) {
//		case "마을버스": 
//			cost=800;
//			break;
//		case "버스": 
//			cost=1250;
//			break;
//		case "지하철": 
//			cost=1300;
//			break;
//		default:
//			System.out.println("대중교통수단이 아닙니다.");
//			break;
//		}
		
		if(args[0].equals("마을버스")) {
			cost = TOWNBUS_COST;
		}else if(args[0].equals("버스")) {
			cost = BUS_COST;
		}else if(args[0].equals("지하철")) {
			cost = SUBWAY_COST;
		}else {
			System.out.println("대중교통수단이 아닙니다.");
		}
		
		if(cost!=0) {
			System.out.println("입력하신 교통수단은 " + args[0] + "이고, 이동거리는 " + args[1] +
							   "km이다. \n교통수단의 기본요금은 " + cost + "원 입니다.");
			
			if(Integer.parseInt(args[1]) > 10) {
				cost+=100;
				for(int i = 11; i <= Integer.parseInt(args[1]); i++) {
					if(i%5 == 0)
						cost+=100;
				}
			}
			
//			if(Integer.parseInt(args[1])>10) {
//				cost += 100;
//				for(int i = 1; i < Integer.parseInt(args[1])/5-1; i++) {
//					cost+=100;
//				}
//			}
		
			System.out.println("편도요금 " + cost + "원, 왕복요금 " + (cost*2) + 
							   "원, 한달 20일 기준 총 이용요금 " + (cost*2*20) + "원 입니다.");
		}
		
	}

}
