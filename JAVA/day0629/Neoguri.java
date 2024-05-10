package day0629;

public class Neoguri extends Ramen{
	
	public Neoguri() {
		super("너구리",1200,"농심","통통","보통맛,순한맛");
	}
	
	public void dasima() {
		System.out.printf("** %s는 다시마가 있으니 같이 조리해주세요~",getName());
	}

	@Override
	public String[] ingredient() {
		String[] ingredientArr = {"면","분말스프","건더기스프","다시마"};
		return ingredientArr;
	}
	
	@Override
	public void cookRamen(String ing) {
			System.out.printf("*%s 조리법*\n1.물을 550ml 준비하고 끓여줍니다.\n"
					+ "2.물이 끓으면 %s를 넣습니다.\n"
					+ "3.기호에 따라 삶은 계란이나 유부, 신선한 야채를 추가해줍니다.\n4.5분동안 끓여줍니다.\n"
					+ "5.맛있게 먹습니다.v(^o^)v\n",
					getName(),ing);			
	}


}
