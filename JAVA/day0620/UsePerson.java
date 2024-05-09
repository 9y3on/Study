package day0620;

/**
 * Person 클래스를 생성하여 사용하는 일
 * @author user
 */
public class UsePerson {

	/**
	 * Java Application (메인 메소드를 가지는 클래스)<br>
	 * APP : 단독으로 실행될 수 있는 프로그램<br>
	 * API Doc : 클래스 설명서
	 * @param args
	 */
	public static void main(String[] args) {
		//사람 객체 생성
		Person dongwon = new Person();
		//값 할당
//		dongwon.setEye(2);
//		dongwon.setNose(1);
//		dongwon.setMouth(1);
		dongwon.setName("이동원");
		//객체 사용
		System.out.printf("눈의 수 %d개, 코의 수 %d개, 입의 수 %d개, 이름 %s\n",
						   dongwon.getEye(),dongwon.getNose(),
						   dongwon.getMouth(),dongwon.getName());
		
		//객체가 제공하는 기능 사용
		System.out.println(dongwon.eat());
		System.out.println(dongwon.eat("돈가스",13000));
		System.out.println("-------------------------------------------------");
		
		//사람 객체 생성
		Person jinban = new Person(3,1,1);
		//값 할당
//		jinban.setEye(3);
//		jinban.setNose(1);
//		jinban.setMouth(1);
		jinban.setName("천진반");
		//객체 사용
		System.out.printf("눈의 수 %d개, 코의 수 %d개, 입의 수 %d개, 이름 %s\n",
							jinban.getEye(),jinban.getNose(),
							jinban.getMouth(),jinban.getName());
		
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("선두",0));
		System.out.println("-------------------------------------------------");
		
		
		//1.객체 생성
		Person yeon = new Person();
		//2.값 할당
//		yeon.setEye(2);
//		yeon.setNose(1);
//		yeon.setMouth(1);
		yeon.setName("승연");
		//3.객체 사용
		System.out.printf("눈의 수 %d개, 코의 수 %d개, 입의 수 %d개, 이름 %s\n",
							yeon.getEye(),yeon.getNose(),
							yeon.getMouth(),yeon.getName());
		System.out.println(yeon.eat());
		System.out.println(yeon.eat("우동",10000));

		
		//private singleton pattern으로 객체를 생성할 때
	}//main

}//class
