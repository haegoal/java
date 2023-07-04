package day09;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		People a = new People();
		People b = new People("이순신", 80);
		
		a.setName("홍길동");
		a.setAge(90);
		
		
		a.ageUp();
		b.ageUp1(5);
		a.print();	
		b.print();
		
		System.out.println(a.getName() + "만나이" + a.koreanAge());
		System.out.println(b.getName() + "만나이" + b.koreanAge());
	}

}
