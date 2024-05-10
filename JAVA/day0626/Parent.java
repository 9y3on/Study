package day0626;

public class Parent {
	
	int p_i;
	int p_j;
	
	//모든 클래스의 생성자 첫 줄에는 부모클래스의 기본 생성자를 호출하는
	//super()가 숨어있음
	//인자가 있는 생성자가 있을 경우 기본 생성자는 만들어지지 않기때문에
	//부모의 기본 생성자가 없어서 자식 클래스에서 에러가 발생
//	public Parent(int i) {
//	}
	public void printPI() {
		System.out.println("부모의 " + p_i + "/" + p_j);
	}

}
