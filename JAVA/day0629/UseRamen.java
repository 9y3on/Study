package day0629;

public class UseRamen {

	public static void main(String[] args) {
		ShinRamen shin = new ShinRamen();
		String ingredient = shin.getIngredient();
		shin.information();
		System.out.println();
		shin.spicy();
		System.out.println("\n");
		shin.cookRamen(ingredient);
		
		System.out.println("\n-----------------------------------------------"
							+ "----------------------------------------------");
		
		Neoguri neoguri = new Neoguri();
		ingredient = neoguri.getIngredient();
		neoguri.information();
		System.out.println();
		neoguri.dasima();
		System.out.println("\n");
		neoguri.cookRamen(ingredient);

	}

}
