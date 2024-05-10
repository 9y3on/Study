package day0629;

public abstract class Ramen {
	
	private String name;
	private String brand;
	private String noodle;
	private String powder;
	private String ingredient;
	private int price;
	
	public Ramen() {
		//기본 생성자
	}
	
	public Ramen(String name, int price, String brand, String noodle, String powder) {
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.noodle = noodle;
		this.powder = powder;
		this.ingredient = String.join(",", ingredient());
	}
	
	public String getName() {
		return name;
	}
	
	public String getNoodle() {
		return noodle;
	}
	
	public String getPowder() {
		return powder;
	}
	
	public String getIngredient() {
		return ingredient;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void information() {
		System.out.printf("[제품명]%s [브랜드]%s [가격] %d원 [면의 굵기] %s [맛] %s [재료] ", 
				getName(),getBrand(), getPrice(),getNoodle(),getPowder());
		System.out.print(ingredient);
	}
	
	public abstract String[] ingredient();
	public abstract void cookRamen(String ing);
}
