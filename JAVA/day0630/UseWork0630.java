package day0630;

public class UseWork0630 {

	public static void main(String[] args) {
		Work0630 w = new Work0630();
		
		//1번
		String fileName = w.backUpFile("test");
		System.out.println(fileName);
		
		//2번
		System.out.println(w.getPassword());
		
		//char[]배열 사용한 2번
		System.out.println(w.pass2());
		
		//Math.random을 적게 사용한 2번
		System.out.println(w.pass3());
		
		
		//다른 배열과 달리 char 배열은 주소가 아닌 값이 출력된다.
		char[] arr = {'c','h','a','r'};
		System.out.println(arr);
		
	}

}
