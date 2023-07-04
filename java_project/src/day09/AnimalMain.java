package day09;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Animal();
		//dog.name = "뽀삐";// name이 private이므로 바로 사용이 어려루므로 매서드 호출
		dog.setName("뽀삐"); // 값을 저장위해
		//dog.sound = "멍멍";
		dog.setSound("멍멍");
		//dog.leg = 4;
		dog.setLeg(4);
		dog.print();
		
		
		
		// 값을 리턴 받아서 출력위해


  // 객체이름 cat 이름은 야용이 울음소리는 야옹 다리갯수는 4
  Animal  cat = new Animal();
  cat.setName("야용이");
  cat.setSound("야옹");
  cat.setLeg(4);
  cat.print();

  
  Animal  c = new Animal();
  c.setName("꼬끼오");
  c.setSound("꼬끼오");
  c.setLeg(2);
  c.print1();

  
  Animal  s = new Animal();
  s.setName("뱀뱀");
  s.setSound("쉭쉭");
  s.setLeg(0);
  s.print1();

	}
}
