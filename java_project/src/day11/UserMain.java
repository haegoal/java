package day11;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<User> list = new ArrayList<User>();
		
		while(true) {
		
		System.out.println("========유저========");
		System.out.println("1회원가입2로그인3리스트0종료");
		int menu = sc.nextInt();
		if(menu==1) {
			User u = new User();
			System.out.println("이름입력바람");
			u.SetName(sc.next());
			System.out.println("아뒤입력바람");
			u.SetId(sc.next());
			System.out.println("비번입력바람");
			u.SetPw(sc.next());
			list.add(u);
			System.out.println(u.getName() + "님 회원가입 추카" );
		}else if(menu==2) {
			System.out.println("아뒤입력바람");
			String loginId = sc.next();
			System.out.println("비번입력바람");
			String loginPw = sc.next();
			boolean find = false;
			
			for(int i=0; i<list.size(); i++) {
				if(loginId.equals(list.get(i).getId())) {
					if(loginPw.equals(list.get(i).getPw())) {
						System.out.println("로그인성공");
						find = true;
						break;
					}
				}
			}if(!find) {
				System.out.println("로그인실패했땅");
			}
		}else if(menu==3) {
			for(int i=0; i<list.size(); i++) {
				list.get(i).print();
			}
		}else if(menu==0) {
			break;
		}	
		}System.out.println("프로그램종료");
		
	}

}
