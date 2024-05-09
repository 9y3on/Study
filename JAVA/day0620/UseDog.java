package day0620;

public class UseDog {

	public static void main(String[] args) {
		Dog husky = new Dog();
		
		husky.setVariety("허스키");
		husky.setEye(2);
		husky.setNose(1);
		husky.setMouth(1);
		husky.setEar(2);
		husky.setLeg(4);
		husky.setTail(1);
		
		System.out.printf("종류 %s, 눈 %d개, 코 %d개, 입 %d개, 귀 %d개, 다리 %d개, 꼬리 %d개\n",
							husky.getVariety(), husky.getEye(), husky.getNose(),
							husky.getMouth(), husky.getEar(), husky.getLeg(), husky.getTail());
		
		System.out.println(husky.run());
		System.out.println(husky.run(10));
		System.out.println(husky.bark());
		
		System.out.println();
		
		Dog maltese = new Dog();
		maltese.setVariety("말티즈");
		maltese.setEye(2);
		maltese.setNose(1);
		maltese.setMouth(1);
		maltese.setEar(2);
		maltese.setLeg(4);
		maltese.setTail(1);
		
		System.out.printf("종류 %s, 눈 %d개, 코 %d개, 입 %d개, 귀 %d개, 다리 %d개, 꼬리 %d개\n", 
							maltese.getVariety(), maltese.getEye(), maltese.getNose(), 
							maltese.getMouth(), maltese.getEar(), maltese.getLeg(), maltese.getTail());
		
		System.out.println(maltese.run());
		System.out.println(maltese.run(5));
		System.out.println(maltese.bark());
	}

}
