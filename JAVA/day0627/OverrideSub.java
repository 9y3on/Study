package day0627;

/**
 * 부모 클래스에서 제공하는 method가 자식 클래스에서 맞지 않으면<br>
 * 부모 클래스의 method를 자식 클래스에서 변경하는 것
 * @author user
 */
public class OverrideSub extends OverrideSuper {

	int subJ;
	
	@Override //Override가 잘 되었는지 체크
	public void print() {
		System.out.println("자식 subJ : " + subJ);
	}
	
	public void test() {
		System.out.println("자식의 method");
	}
	
	//접근 지정자는 광의의 접근 지정자로 변환 가능 || 광의 : 접근이 원활한 쪽
	//default -> protected -> public (거꾸로는 안됨)
	//오버라이딩 할 때 접근 지정자는 달라도 되지만 접근의 폭이 더 좁아지는 접근 지정자는 사용불가
	@Override
	public void overTest() {
		
	}
	
	public static void main(String[] args) {
		//is a 관계의 객체화 : 부모 클래스명 객체명 = new 자식클래스의 생성자();
		//Override된 method가 존재하면 자식의 method가 호출
		OverrideSuper os = new OverrideSub();
		//os.test(); 자식의 method인 test는 
		//OverrideSuper클래스에 존재하지 않으므로 호출 불가
		os.print(); //Override를 하면 오버라이딩된 
					//자식의 method가 최우선적으로 호출된다.
	}//main

}//class
