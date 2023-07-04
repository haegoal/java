package day09;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board a = new Board("보드", 10, false);
		Board b = new Board();
		
		a.cntUp();
		a.print();
		
		b.setTitle("빌보드");
		b.setOpen(true);
		b.setCnt(5);
		b.cntUp1(5);
		b.print();
	}

}
