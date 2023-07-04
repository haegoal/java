package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Account {
	private String name;
	private String account;
	private int balance;
	private String joinDate;
	String inAccount;
	static int num=100; 
	
	public Account() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh-mm-ss");
		joinDate = dtf.format(LocalDateTime.now());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = num++ + "-" + account;
	} 
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void print() {
		System.out.println(name+"\t"+account+"\t"+balance+"\t"+joinDate);
	}
	
	public void deposit(int money) {
			this.balance += money;
	}
	
	public boolean withdraw(int money) {
		if(balance >= money) {
			this.balance -= money;
			return true;
		}else {
			return false;
		}
		
	}

}
