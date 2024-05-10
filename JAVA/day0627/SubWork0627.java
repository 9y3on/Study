package day0627;

public class SubWork0627 extends SuperWork0627{
	
	public SubWork0627() {
		//기본 생성자
	}

	//이름 출력
	@Override
	public void separateName(String[] names) {
		super.separateName(names);
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i].substring(1) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] names = {"강다연","김다영","김선경","김인영","김주민","박상준","박서영"};
		SubWork0627 subWork = new SubWork0627();
		subWork.separateName(names);
		
		System.out.println("------------is a------------");
		
		//is a 관계로 객체화
		SuperWork0627 isSubWork = new SubWork0627();
		isSubWork.separateName(names);
	}

}
