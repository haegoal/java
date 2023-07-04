package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<User> List = new ArrayList<User>();
		
		while(true) {
		
		System.out.println("=========회원시스템=========");
		System.out.println("1회원가입 2로그인 3리스트 0종료");
		int menu = sc.nextInt();
		
		if(menu==1) {


			System.out.println("이름입력바람");
			String a = sc.next();
			System.out.println("아디입력바람");
			String b = sc.next();
			System.out.println("비번입력바람");
			String c = sc.next();
			User f = new User(a, b, c);
			List.add(f);
		}else if(menu==2) {
			System.out.println("아이디입력바람");
			String loginId = sc.next();
			System.out.println("비번입력바람");
			String loginPw = sc.next();
			boolean find = false;
			
			for(int i=0; i<List.size(); i++) {
				if(loginId.equals(List.get(i).getId())){
					if(loginPw.equals(List.get(i).getPw())){
						System.out.println("로그인성공했따잉");
						find = true;
						break;
					}
				}
			}if(!find) {
				System.out.println("실패했다잉");
			}
		}else if(menu==3) {
			for(int i=0; i<List.size(); i++) {
				List.get(i).print();
			}
		}else if(menu==0) {
			break;
		}else {
			System.out.println("틀렷따잉");
		}
		}System.out.println("종료한다잉");
	}
}
