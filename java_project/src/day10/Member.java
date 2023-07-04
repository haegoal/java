package day10;

public class Member {
	private String email;
	private String pw;
	private String name;
	private String JoinDate;
	
	public Member (){
		
	}
	public Member (String email, String pw, String name, String JoinDate){
		this.email = email;
		this.pw = pw;
		this.name = name;
		this.JoinDate = JoinDate;
	}
	
	public String getEmail() {
		return email;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getJoinDate() {
		return JoinDate;
	}
////////////////////////////////////////
	
	public void setJoinDate(String JoinDate) {
		this.JoinDate = JoinDate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%s\t%s", email, pw, name, JoinDate);
	}
}
