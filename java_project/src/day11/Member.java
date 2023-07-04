package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Member {
	private Long id;
	private String email;
	private String pw;
	private String name;
	private String joinDate;
	
	public Member() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh-mm-ss");
		joinDate = dtf.format(LocalDateTime.now());
	}
	public Member(Long id, String email, String name, String pw) {
		this();
		this.id = id;
		this.email = email;
		this.name = name;
		this.pw = pw;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPw() {
		return pw;
	}
	
	/////////////////////////////
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void print() {
		System.out.printf("%d\t%s\t%s\t%s\t%s\n", id,name, email, pw, joinDate );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
