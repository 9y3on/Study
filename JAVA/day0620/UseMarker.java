package day0620;

/**
 * Marker 클래스를 객체로 생성하여 사용하는 일을 하는 클래스
 * @author user
 */
public class UseMarker {

	public static void main(String[] args) {
		
		//마카펜 객체가 제공하는 기능을 사용하기 위해 객체화
		//1.객체 생성
		Marker black = new Marker();
		//black 마카펜 객체에 "검은"을 넣어주세요.
		//black.color = "검은"; //접근지정자가 프라이빗이므로 다른 클래스에서 접근불가
		
		//생성된 마카펜 객체에 값을 설정 하는 일. setter method
//		black.setCap(1);
//		black.setBody(1);
//		black.setColor("검은");
		
		//2. 객체가 제공하는 기능 사용
		String msg = black.write("잘하셨습니다.");
		
		//생성된 마카펜 객체가 갖고있는 값을 얻는 일. getter method
		System.out.println("뚜껑의 수 : " + black.getCap() + ", 몸체의 수 : " + 
							black.getBody() + ", 색 : " + black.getColor());
		
		System.out.println(msg);
		
		System.out.println();
		
		//setter, getter method는 서비스형 메소드로 반드시 존재하지 않아도 됨
		
		//빨간색 마카펜을 만들어서 어쩔티비 저쩔티비 뇌절티비
		Marker red = new Marker();
		red.setColor("빨간");
		System.out.println("뚜껑의 수 : " + red.getCap() + ", 몸체의 수 : " + 
				red.getBody() + ", 색 : " + red.getColor());
		System.out.println(red.write("어쩔티비 저쩔티비 뇌절티비"));
		
		System.out.println();
		
		//생성자 오버로딩, 두 번째 마커펜 생성사 사용
		Marker red2 = new Marker(1,2,"초록");
		System.out.println("뚜껑의 수 : " + red2.getCap() + ", 몸체의 수 : " + 
				red2.getBody() + ", 색 : " + red2.getColor());
		System.out.println(red2.write("어쩔티비 저쩔티비 뇌절티비"));

	}

}
