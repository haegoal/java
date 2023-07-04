package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
	private String name;
	private String id;
	private String pw;
	private String joinDate;
	
	public User() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		joinDate = dtf.format(LocalDateTime.now());
	}
	public User(String name, String id, String pw) {
		this.name=name;
		this.id=id;
		this.pw=pw;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	////////////////////////////////
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public void SetId(String id) {
		this.id = id;
	}
	public void SetPw(String pw) {
		this.pw = pw;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%s\t%s\n", name, id, pw, joinDate);
	}
}
