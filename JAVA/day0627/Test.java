package day0627;

import java.awt.Dialog;
import java.awt.Frame;

//Dialog를 상속받으면 Dialog 클래스에는 기본 생성자가 없으므로 err
public class Test extends Dialog{
	//1.기본 생성자를 정의하고
	public Test() {
		//2.부모 클래스의 기본 생성자가 아닌 매개변수를 정의한 생성자를 호출하면 err 사라짐
		super(new Frame()); //Dialog는 기본 생성자가 없으므로 다른 생성자를 지정하여 호출
		//super(); //자식 클래스의 생성자 첫 줄에는 무조건 super()가 숨어있다. 
				   //-> 부모 클래스의 기본 생성자 호출
	}

}
