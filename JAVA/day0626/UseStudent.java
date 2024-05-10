package day0626;

public class UseStudent {

	public static void main(String[] args) {

		//학생 한 명의 정보를 저장
		Student stu = new Student("강다연", 25, 173.4, 0.0, "kang@test.com");
		
		System.out.printf("학생명 : %s, 나이 : %d살, 키 : %.1fcm, 몸무게 : %.1fkg, 이메일 : %s", 
						stu.getName(), stu.getAge(), stu.getHeight(), stu.getWeight(), stu.getEmail());
		System.out.println();
		
		//학생 여러명의 정보를 저장 => 일괄처리 => 배열(고정길이)
		//1.배열 선언
		Student[] strList = new Student[3]; //모든 방의 값이 null로 초기화
		//2.모든 방의 값이 null로 초기화
		for(int i = 0; i < strList.length; i++) {
			System.out.println(strList[i]);
		}
		
		//new 데이터형[열의수] 로 먼저 배열 생성 후 
		//-> 배열명[열번호] = new 생성자(); 해서 배열안에 객체 생성(쉽게 말해 배열 안에 배열을 생성)
		//3. 배열의 각 방의 값을 설정
		strList[0] = new Student("김선경", 26, 182.5, 75.77, "sk@test.com");
		strList[1] = new Student("김주민", 27, 179.11, 76.52, "jumin@test.com");
		strList[2] = new Student("박상준", 26, 180.54, 75.77, "park@test.com");
		
		System.out.println("이름\t나이\t키");
		Student temp = null; //strList의 값을 저장하기 위해 변수 선언
		for(int i = 0; i < strList.length; i++) {
			temp = strList[i];
			System.out.println(temp.getName() + "\t" + temp.getAge() + "\t" + temp.getHeight());
		}
	
		
	
	}//main

}//class
