package day09;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit();
		apple.name = "사과";
		apple.color = "빨강";
		apple.isSeed = true;
		apple.print();
		
		
		Fruit melon = new Fruit("멜론");
		melon.color = "초록";
		melon.isSeed = true;
		melon.print();
		Fruit orange = new Fruit("오렌지", "주황");
		orange.isSeed = true;
		orange.print();
		
		}
	}

