package day0626;

public class Work0626 {
	
	//영
	public int youngCnt(Work0626VO[] wVO) {
		int cnt = 0;
		for(int i = 0; i < wVO.length; i++) {
			if(wVO[i].getName().contains("영")) {
				cnt++;
			}
		}
		return cnt;
	}
	
	//이름을 바로 출력
	public void seoulPrint(Work0626VO[] wVO) {
		for(int i = 0; i < wVO.length; i++) {
			if(wVO[i].getAddress().startsWith("서울")) {
				System.out.print(wVO[i].getName() + " ");
			}
		}
	}
	
	//이름을 문자열에 저장
	public String seoulStr(Work0626VO[] wVO) {
		String seoulName = "";
		for(int i = 0; i < wVO.length; i++) {
			if(wVO[i].getAddress().startsWith("서울")) {
				seoulName = seoulName.concat(wVO[i].getName()+" ");
			}
		}
		return seoulName;
	}
	
	//나이 총합
	public int ageTotal(Work0626VO[] wVO) {
		int age = 0;
		for(int i = 0; i < wVO.length; i++) {
			age+=wVO[i].getAge();
		}
		return age;
	}
}
