package day0627;

import java.util.ArrayList;
import java.util.List;

public class TestAnnotation {

	/**
	 * 6월27일에는 기분이 좋았으나 지금은 아님<br>
	 * <strong>Deprecated</strong><br>
	 * 얘 말고 쟤 쓰세요
	 */
	@Deprecated
	public void print() {
		System.out.println("아! 오늘은 기부니가 좋다!");
	}
	
	//접근지정자는 상관X 반환형 메소드명 매개변수 같아야함
	@Override //오버라이딩 검사 
	public String toString() {
		return "주소는 거절한다.";
	}
	
	//warning 무시
	//@SuppressWarnings("unused")
	@SuppressWarnings({ "rawtypes", "unused" })
	public void test() {
		int i = 0;
		int j = 0;
		List list = new ArrayList();
	}
	
	public static void main(String[] args) {
		TestAnnotation ta = new TestAnnotation();
		ta.print();
		
		String str = new String("내일은 휴강~ ^ㅇ^"); //toString
		System.out.println(str);
		System.out.println(ta);
		
	}
}