package day0627;

public class SeungYeon extends Person {
	private int spicy;
	
	public SeungYeon() {
		spicy = 0;
	}
	
	/**
	 * 매운음식을 잘 먹는다<br>
	 * 신라면은 매운 걸 못 느껴서 spciy가 그대로<br>
	 * 엽떡은 약간 매워서 먹을 때마다 spciy가 증가<br>
	 * spciy가 3이 되면 우유나 쿨피스로 진정시킬 수 있음<br>
	 * @param food 매운 음식의 종류
	 * @return 
	 */
	public String spicyFood(String food) {
		String result = "";
		if(food.equals("신라면")) {
			result = food + "은 별로 안 매워";
		}else if(food.equals("엽떡")) {
			result = food + "은 맛있따! ~(^ㅇ^~)";
			spicy++;
			if(spicy>3) {
				spicy = 3;
				result = "그만! 우유 아니면 쿨피스가 필요해";
			}
		}else if(food.equals("우유") || food.equals("쿨피스")) {
			result = food + " 먹으니까 안 맵다 ^ㅇ^b";
			spicy--;
			if(spicy < 0) {
				spicy = 0;
				result = food + " 안 먹어도 지금은 멀쩡해";
			}
		}else {
			result = food + " 말고 신라면 아니면 엽떡 먹을래";
		}
		
		return result;
	}

}
