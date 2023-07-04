package day10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> a = new ArrayList<Member>();
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
		
		while(true) {
			System.out.println("====멤버관리=====");
			System.out.println("1멤버등록2멤버리스트3검색4멤버수정5멤버삭제0종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu==1) {
				System.out.println("이메일선택> ");
				String e = sc.next();
				System.out.println("비번선택> ");
				String pw = sc.next();
				System.out.println("이름선택> ");
				String na = sc.next();
				String jd = dtf.format(LocalDateTime.now());
				Member b = new Member(e, pw, na,jd);
				a.add(b);
				System.out.println(na + "님 멤버가입 추카합니다");
			}else if(menu==2) {
				for(int i=0; i<a.size(); i++) {
					a.get(i).print();
					System.out.println("");
				}
			}else if(menu==3) {
				System.out.println("찾을 이메일 입력바람");
				String eq = sc.next();
				boolean find = false;
				for(int i=0; i<a.size(); i++) {
					if(eq.equals(a.get(i).getEmail())) {
						a.get(i).print();
						System.out.println("");
						find = true;
						break;
					}
				}if(!find) {
					System.out.println("없는이메일");
				}
			}else if(menu==4) {
				System.out.println("이메일 입력바람");
				String es = sc.next();
				boolean find = false;
				
				for(int i=0; i<a.size(); i++) {
					if(es.equals(a.get(i).getEmail())) {
						System.out.println("수정할 비번을 선택해주세요");
						a.get(i).setPw(sc.next());
						System.out.println("수정완료");
						find = true;
						break;
					}
				}if(!find) {
					System.out.println("없는이메일");
				}
			}else if(menu==5) {
				System.out.println("삭제할 이메일 입력바람");
				String er = sc.next();
				boolean find = false;
				
				for(int i=0; i<a.size(); i++) {
					if(er.equals(a.get(i).getEmail())) {
						a.remove(i);
						System.out.println("삭제성공");
						find = true;
						break;
					}
				}if(!find) {
					System.out.println("없는이메일");
				}
			}else if(menu==0) {
				break;
			}else {
				System.out.println("잘못입력");
			}
		}System.out.println("프로그램종료");
		
	}

}
