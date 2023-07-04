package day09;

public class Animal {
private String name; //동물이름
private String sound; //클레스에서만 접근 가능, 울음소리
private int leg; // 다리 수
	
// default는 같은 패키지에서만 사용 가능
// 지정하다면 default로 정해짐

// 패키지가 다르면 같은 이름 사용 가능

// name이 private이므로 name을 불러올 수 있도록 매서드 작성
public void setName(String name) {// 매개변수를 받음
	this.name = name; // 받은 매개변수 값을 현 클래스 필드 변수에 넣음
}
 
public String getName() {//name을 돌려줌 
	return name;
	
	// 만약 출력처리라면  굳이 리턴하지 않고 여기서 출력문 사용하면 됨
	// public void getName(){
	// System.out.println(name);}
}

public void setSound(String sound) {
	this.sound = sound; // 자신의 sound에 매개변수 sound를 대입
	}

public  String getSound() {// 돌려주기위해 리턴 매서드 작성 
	return sound;
}

public void setLeg(int leg) {
	this.leg = leg;
	}

public  int  getLeg() {
	return leg;
}

public void print() {
	System.out.println(name+"\t"+sound+"\t"+leg);
}

public void print1() {
	System.out.printf("이름:%s\t울음:%s\t다리:%d\n", name, sound, leg);
}

}
