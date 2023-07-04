package day10;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
		
		dog.setName("강아지");
		dog.setSound("멍멍");
		dog.setLeg(4);
		
		Animal cat = new Animal();
		
		cat.setName("냐옹이");
		cat.setSound("냐옹이다옹");
		cat.setLeg(4);
		
		Animal chicken = new Animal();
		
		chicken.setName("새벽2시에우는닭");
		chicken.setSound("꽤애애애애애액");
		chicken.setLeg(2);
		
		Animal snake = new Animal();
		
		snake.setName("이무기");
		snake.setSound("쉑쉑버거");
		snake.setLeg(0);
		
		
		System.out.printf("%s\t%s\t%d\n", dog.getName(), dog.getSound(), dog.getLeg());
		System.out.printf("%s\t%s\t%d\n", cat.getName(), cat.getSound(), cat.getLeg());
		System.out.printf("%s\t%s\t%d\n", chicken.getName(), chicken.getSound(), chicken.getLeg());
		System.out.printf("%s\t%s\t%d\n", snake.getName(), snake.getSound(), snake.getLeg());
		
	}

}
