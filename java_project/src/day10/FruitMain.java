package day10;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit();
		
		apple.name = "사과";
		apple.color = "빨강";
		apple.isSeed = true;
		
		Fruit banana = new Fruit("바나나");
		Fruit melon = new Fruit("멜론", "초록");
		Fruit orange = new Fruit("오렌지","주황",true);
		
		apple.print();
		banana.print();
		melon.print();
		orange.print();
	}

}
