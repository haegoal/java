package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address1 {

	public static void run() {
		Scanner sc = new Scanner(System.in);
	
		List<Student> list = new ArrayList<Student>();
		Student s = new Student("20231", "홍길동", "인천 서구");
		list.add(s);
		s = new Student("20232", "심청이", "인천 주안");
		list.add(s);
		s = new Student("20233", "감강찬", "인천 부평");
		list.add(s);

		boolean run = true;

		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.주소등록 2.주소목록 3.주소검색 4.주소수정 5.주소삭제 0.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			String menu = sc.nextLine();
			switch (menu) {
			case "0":
				run = false;
				break;
			case "1":
				s = new Student();
				s.setSno("2023" + (list.size() + 1));
				System.out.println("학번" + s.getSno());
				System.out.print("이름> ");
				s.setSname(sc.nextLine());
				System.out.print("주소> ");
				s.setAddress(sc.nextLine());
				list.add(s);
				System.out.println(list.size() + "명 등록완료");
				break;
			case "2":
				for (Student st : list) {
					System.out.println(st.toString());
				}
				break;
			case "3":
				System.out.print("찾으려는 이름> ");
				String a = sc.nextLine();
				boolean find = false;

				for (Student st : list) {
					if (st.getSname().equals(a)) {
						System.out.println(st.toString());
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("없는 학생입니다.");
				}
				break;
			case "4":
				System.out.print("찾으려는 이름> ");
				a = sc.nextLine();
				find = false;

				for (Student st : list) {
					if (st.getSname().equals(a)) {
						find = true;
						System.out.println("이름:" + st.getSname() + "주소" + st.getAddress());
						System.out.print("바꾸려는 주소 입력>");
						String b = sc.nextLine();
						if (b != "") {
							st.setAddress(b);
							break;
						} else {
							System.out.println("공백은 입력몬해");
						}
					}
				}
				if (!find) {
					System.out.println("없는 학생입니다.");
				}
				break;
			case "5":
				System.out.println("삭제할려는 이름 입력바람");
				a = sc.next();
				find = false;

				for (Student st : list) {
					if (a.equals(st.getSname())) {
						System.out.println(s.getSname() + " 님 삭제완료");
						list.remove(st);
						find = true;
						break;
					}
				}
				if (!find) System.out.println(a + "없는 학생입니다.");
				break;
			default:
				System.out.println("잘못입력함");
				break;
			}
		}
		System.out.println("프로그램이 종료됩니다.");
	}
}
