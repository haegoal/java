package day09;

public class Board {
	private String title;
	private int cnt;
	private boolean open;
	
	public Board() {
		
	}
	
	public Board(String title, int cnt, boolean open){
		this.title = title;
		this.cnt = cnt;
		this.open = open;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public boolean getOpen() {
	return open;
	}
	
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public void cntUp() {
		this.cnt++;
	}
	public int cntUp1(int cnt) {
		return this.cnt += cnt;
	}
	
	public void print() {
		System.out.println("전체값은>");
		System.out.println("=====================");
		System.out.printf("이름: %s \t카운트: %d\t오픈여부: %b\n",title, cnt, open);
	}
}
