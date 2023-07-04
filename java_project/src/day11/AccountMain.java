package day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		List<Account> account = new ArrayList<Account>();

		while (true) {
			System.out.println("========일보은행=========");
			System.out.println("1계좌생성2입금3출금4계좌목록5계좌이체0종료");
			int menu = sc.nextInt();

			if (menu == 1) {
				Account a = new Account();
				System.out.println("이름입력> ");
				a.setName(sc.next());
				System.out.println("계좌입력> ");
				a.setAccount(sc.next());
				System.out.println("초기잔액입력> ");
				a.setBalance(sc.nextInt());
				account.add(a);
			} else if (menu == 2) {
				System.out.println("계좌번호입력바람");
				String inAccount = sc.next();
				System.out.println("돈입력바람");
				int money = sc.nextInt();
				boolean find = false;

				for (Account a : account) {
					if (inAccount.equals(a.getAccount())) {
						a.deposit(money);
						System.out.println(money + "원 입금완료");
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("계좌가 틀렸땅");
				}
			} else if (menu == 3) {
				System.out.println("계좌번호입력바람");
				String outAccount = sc.next();
				System.out.println("돈입력바람");
				int money = sc.nextInt();
				boolean find = false;

				for (Account a : account) {
					if (outAccount.equals(a.getAccount())) {
						if (a.withdraw(money)) {
							System.out.println(money + "원 출금완료");
							find = true;
							break;
						} else {
							System.out.println("그지다");
							find = true;
							break;
						}
					}
				}
				if (!find) {
					System.out.println("계좌가 틀렸땅");
				}

			} else if (menu == 4) {
				for (Account a : account) {
					a.print();
				}
			} else if (menu == 5) {
				System.out.println("출금할 계좌를 선택해주세요");
				String dlcp = sc.next();
				System.out.println("입금할 계좌를 선택해주세요");
				String dlcpp = sc.next();
				System.out.println("돈입력바람");
				int money = sc.nextInt();
				boolean find=false;
			
				for (Account a : account) {
					if (dlcp.equals(a.getAccount())) {
						find=true;
						if (a.withdraw(money)) {
							for (Account b : account) {
							if (dlcpp.equals(b.getAccount())) {
									b.deposit(money);
									break;
								}else {
									System.out.println("입금계좌없다");
									break;
								}
							}	
						} else {
							System.out.println("잔액부족");
							find=true;
							break;
						}
					}
				}if(!find) {
					System.out.println("출금계좌없다");
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("잘못입력");
			}
		}
		System.out.println("프로그램 종료");
	}

}
