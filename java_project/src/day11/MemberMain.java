package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Member> member = new ArrayList<Member>();
		Long id = 100l;
		
		while(true) {
			System.out.println("1멤버등록2멤버리스트3검색0종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu==1) {
				System.out.println("이메일입력바람");
				String email = sc.next();
				System.out.println("비번바람");
				String pw = sc.next();
				System.out.println("이름바람");
				String name = sc.next();
				Member m = new Member(id++, email, pw, name);
				System.out.println(name + "님 회원가입 추카");
				member.add(m);
			}else if(menu==2) {
				System.out.println("no\t이메일\t비밀번호\t이름\t가입날짜");
				System.out.println("================================");
				for (Member m : member) {
					m.print();
				}
			}else if(menu==3) {
				System.out.println("검색할아이디");
				Long searchId = sc.nextLong();
				boolean find = false;
				
				for (Member m : member) {
					if(searchId.equals(m.getId())) {
						m.print();
						find = true;
						break;
					}
				}if(!find) {
					System.out.println("없는 아이디");
				}
			}else if(menu==0) {
				break;
			}else {
				System.out.println("잘못누름");
			}
		}System.out.println("프로그램 종료");
		
		
	}

}
