package day0629;

/**
 * Person 클래스를 생성하여 사용하는 일
 * @author user
 */
public class UsePerson {

	public static void main(String[] args) {
		//객체 생성
		HongGilDong hgd = new HongGilDong();
		hgd.setName("홍길동");
		
		System.out.printf("눈 : %d, 코 : %d, 입 : %d, 이름 : %s\n", 
						  hgd.getEye(), hgd.getNose(), hgd.getMouth(), hgd.getName());
						//부모 클래스의 메소드를 자식 클래스에서 내것처럼 사용 -> 코드의 재사용성
		System.out.println(hgd.eat());
		System.out.println(hgd.eat("국밥", 40)); //국밥은 40푼
		
		//오버라이딩 - 부모클래스의 메소드를 자식 클래스에서 재정의
		//인스턴스 변수는 사용이 되는 기간동안 계속 유지
		System.out.println(hgd.fight(5)); //6->7
		System.out.println(hgd.fight(6)); //7->8
		System.out.println(hgd.fight(8)); //8->8
		System.out.println(hgd.fight(9)); //8->7
		System.out.println(hgd.fight(7)); //8->7
		
		System.out.println("------------------------------------------");
		
		Clark superman = new Clark();
		superman.setName("클락켄트");
		System.out.printf("눈 : %d, 코 : %d, 입 : %d, 이름 : %s\n", 
				superman.getEye(), superman.getNose(), superman.getMouth(), superman.getName());
		System.out.println(superman.eat());
		System.out.println(superman.eat("스테이크",10)); //스테이크는 10$
		
		//자신만의 특징
		String stone = "크립토나이트";
		System.out.println(stone + "은 " + superman.power(stone));
		stone = "다이아몬드";
		System.out.println(stone + "는 " + superman.power(stone));
		stone = "짱돌";
		System.out.println(stone + "은 " + superman.power(stone));
		
		//자식클래스는 부모의 정보가 있으므로 부모 객체에 할당가능(자식클래스로 객체화) 
		//Parent p = new Child();
		//부모 객체에서 자식이 가지고 있는 변수와 메소드는 사용 불가 
		//-> 오버라이딩 된 메소드는 사용 가능(오버라이드-최우선)
		
		System.out.println("------------------------------------------");
		
		String[] lang = hgd.language();
		System.out.println(hgd.getName() + "이 구사할 수 있는 언어");
		
		for(int i = 0; i < lang.length; i++) {
			System.out.printf("%s\t",lang[i]);
		}//end for
		
		System.out.println("\n------------------------------------------");
		
		//클락이 구사할 수 있는 언어를 개선된 for를 사용하여 출력
		System.out.println(superman.getName() + "가 구사할 수 있는 언어");
		String[] superLangArr = superman.language(); 
		for(String superLang : superLangArr) {
			System.out.printf(superLang + "\t");
		}
		
		System.out.println("\n------------------------------------------");
		
		System.out.println(superman.drivingForce() + " " + superman.upwordForce());
		
	}//main

}//class
