package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> a = new ArrayList<Student>();
		
		
		while(true) {
			System.out.println("=====학사관리시스템=====");
			System.out.println("1학생등록2학생리스트3학생검색4종료");
			System.out.println("메뉴>");
			int menu = sc.nextInt();
			if(menu==1){
				Student s = new Student();
				System.out.println("학번> ");
				s.setNo(sc.next());
				System.out.println("이름> ");
				s.setName(sc.next());
				System.out.println("학과> ");
				s.setDept(sc.next());
				System.out.println("학년> ");
				s.setYear(sc.nextInt());
				System.out.println(s.getName() + "학생등록완료!");
				a.add(s);
			}else if(menu==2) {
				System.out.println("학번\t이름\t학과\t학년");
				System.out.println("====================");
				for(int i=0; i<a.size(); i++) {
					a.get(i).print();
				}
			}else if(menu==3) {
				System.out.println("학번>");
				String no = sc.next();
				System.out.println("이름>");
				String na = sc.next();
				System.out.println("학과>");
				String d = sc.next();
				System.out.println("학년>");
				int ye = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<a.size(); i++) {
					if(a.get(i).getNo().contains(no)) {  
						if(a.get(i).getName().contains(na)) {
							if(a.get(i).getDept().contains(d)) {
								if(a.get(i).getYear()==ye) {
									a.get(i).print();
									find = true;
									break;
								}
							}
						}
					}
				}if(!find) {
					System.out.println("조회불가능");
				}
				
			}else if(menu==4) {
				break;
			}else {
				System.out.println("잘못입력함");
			}
			
		}System.out.println("종료");
		
		
		
	}

}
