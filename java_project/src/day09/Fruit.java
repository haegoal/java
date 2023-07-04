package day09;

public class Fruit {
	String name, color;
	boolean isSeed;
	
	public Fruit() {
		
	}
	
	public Fruit(String name) {
		this.name = name;
	}
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
		
	}	
	public Fruit(String name, String color, boolean isSeed) {
		
	}	
	
	
	
	
	public void print() {
		System.out.printf("%s%s%b\n",name, color, isSeed);
	}
}
