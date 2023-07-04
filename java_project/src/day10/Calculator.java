package day10;

public class Calculator {
	int num1, num2;
	
	
	Calculator(){
		this(10, 15);
	}
	Calculator(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	public void sum() {
		System.out.println(num1+num2);
	}
	
	public void sub(int num1, int num2) {
		System.out.println(num1-num2);
	}
	
	public int mul() {
		return num1 * num2;
	}
	
	public double div(int num1, int num2) {
		return num1 / (double) num2;
	}
}
