package day0629;

public class ShinRamen extends Ramen{
	
	public ShinRamen() {
		super("신라면",1000,"농심","보통","매운맛");
	}

	public void spicy() {
		System.out.printf("** %s은 매우니 조심해주세요~",getName());
	}
	
	@Override
	public String[] ingredient() {
		String[] ingredient = {"면","분말스프","건더기스프"};
		return ingredient;
	}
	
	@Override
	public void cookRamen(String ing) {
			System.out.printf("*%s 조리법*\n1.물을 550ml 준비하고 끓여줍니다.\n"
					+ "2.물이 끓으면 %s를 넣습니다.\n"
					+ "3.4분 30초동안 끓여줍니다.\n"
					+ "4.맛있게 먹습니다.(^o^b)\n",
					getName(),ing);			
	}
}
