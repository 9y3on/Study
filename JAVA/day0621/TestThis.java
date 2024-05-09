package day0621;



/**
 * this keyword 형식<br>
 * instance 영역에서 사용되며, 인스턴스 변수를 식별하기위해서 사용
 * @author user
 */
public class TestThis {
	int temp;
	int foo;
	
	/**
	 * this를 사용하지않고 인스턴스 변수와 지역변수를 식별하려면<br>
	 * 객체를 받아서 객체.변수명으로 식별한다.
	 * @param temp
	 * @param tt
	 */
	public void setTemp(int temp, TestThis tt) {
		tt.temp = temp; //인스턴스 변수 temp는 heap에 저장, 매개변수 temp는 stack에 저장(지역변수이므로)
						//이름이 같다면 java는 stack의 변수를 사용함
		
		System.out.println(this); //this : 메소드를 호출하는 instance(객체) 주소로 변환
								  //메소드를 호출하는 객체의 주소를 반환
								  //객체 주소를 반환하므로 객체가 생성되어야 사용가능 = static에서 사용 불가(객체 생성전 실행되므로)
		
		//heap영역에 저장된 인스턴스 변수 temp에 접근하려면 temp의 주소가 필요, 해당 주소는 stack영역의 tt에서 가지고 있음
		//그렇기 때문에 temp의 주소를 가진 tt를 이용해 temp에 접근할 수 있지만(tt.temp) 일일히 객체의 주소를 받아야함
		//이 때, this를 사용하면 메소드를 호출하는 객체의 주소를 바로 받아올 수 있기때문에 편리
		//this 키워드 형식은 인스턴스 영역이면 모두 사용 가능, 메소드 형식은 생성자의 첫 번째 줄에서만 사용 가능
		
		//method안 변수는 지역변수, 외부에서는 사용 불가(밖으로 나오면 사라지기때문에)
	}
	
	public int getTemp() {
		return temp;
	}
	
	/**
	 * this는 method를 호출한 객체의 주소로 변경 <br>
	 * tt.setFoo() => this는 tt가 된다. <br>
	 * tt1.setFoo() => this는 tt1이 된다. -- this 사용시 Java가 알아서 메소드를 호출한 객체의 주소를 가져옴
	 * @param foo
	 */
	public void setFoo(int foo) {
		this.foo = foo;
	}
	
	public int getFoo() {
		return foo;
	}
	
	public static void main(String[] args) {
		TestThis tt = new TestThis(); //tt만이 heap의 주소를 가짐, stack영역에서
		TestThis tt1 = new TestThis();
		tt.setTemp(200,tt);
		tt1.setTemp(200,tt1);
		System.out.println(tt.getTemp());
		tt.setFoo(100);
		System.out.println(tt.getFoo());
			
	}

}
