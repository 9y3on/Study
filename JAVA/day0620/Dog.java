package day0620;

public class Dog {
	
	private String variety;
	private int eye;
	private int nose;
	private int mouth;	
	private int ear;
	private int leg;
	private int tail;
	
	public void setVariety(String variety) {
		this.variety = variety;
	}
	
	public void setEar(int ear) {
		this.ear = ear;
	}
	public void setEye(int eye) {
		this.eye = eye;
	}
	public void setNose(int nose) {
		this.nose = nose;
	}
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public void setTail(int tail) {
		this.tail = tail;
	}
	
	public String getVariety() {
		return variety;
	}
	
	public int getEye() {
		return eye;
	}
	
	public int getNose() {
		return nose;
	}
	
	public int getMouth() {
		return mouth;
	}
	
	public int getEar() {
		return ear;
	}
	
	public int getLeg() {
		return leg;
	}
	
	public int getTail() {
		return tail;
	}
	
	public String run() {
		return variety + "가 달린다.";
	}
	
	public String run(int minite) {
		return variety + "가 " + minite + "분 동안 달린다.";
	}
	
	public String bark() {
		return variety + "가 짖는다.";
	}

}
