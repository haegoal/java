package day09;

public class People {
	private String name;
	private int age;
	
	People(){
		
	}
	People(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println(name + age);
	}
	
	public void ageUp() {
		this.age += 1;
	}
	public void ageUp1(int age) {
		this.age += age;
	}
	
	public int koreanAge() {
		return age-2;
	}

}
