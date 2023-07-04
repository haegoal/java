package ex01;

import java.util.Scanner;

public class Address {
	public static void run() {
		Student[] students = new Student[5];

		Scanner s = new Scanner(System.in);
		boolean run = true;
		int cnt = 0;

		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.주소등록 2.주소목록 3.주소검색 4.주소수정0.종료");
			System.out.println("-------------------------");
			System.out.println("선택> ");
			String menu = s.nextLine();
			switch (menu) {
			case "0":
				run = false;
				break;
			case "1":
				Student student = new Student();
				student.setSno("2023" + cnt + 1);
				System.out.println("학번" + student.getSno());
				System.out.print("이름>");
				student.setSname(s.nextLine());
				System.out.print("주소>");
				student.setAddress(s.nextLine());
				students[cnt] = student;
				cnt++;
				System.out.println(cnt + "명 학생등록");
				break;
			case "2":
				for (int i = 0; i < cnt; i++) {
					System.out.println(students[i].toString());
				}
				break;
			case "3":
				System.out.print("찾으려는 이름 입력> ");
				String sa = s.nextLine();
				boolean find = false;
				for (int i = 0; i < cnt; i++) {
					if (sa.equals(students[i].getSname())) {
						System.out.println(students[i].toString());
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println(sa + "학생 등록되지않았습니다.");
				}
				break;
			case "4":
				System.out.print("수정할이름> ");
				String no = s.nextLine();
				find = false;
				for (int i = 0; i < cnt; i++) {
					if (no.equals(students[i].getSname())) {
						find = true;
						System.out.print("이름" + students[i].getSname() + "주소" + students[i].getAddress());
						System.out.print("새로운 주소>");
						String update = s.nextLine();
						if (update != "") {
							students[i].setAddress(update);
							System.out.println("주소변경완");
							break;
						}else {
							System.out.println("공백은 있을 수 없당");
						}
					}
				}
				if (!find) {
					System.out.println(no + "학생 등록되지않았습니다.");
				}
				break;
			default:
				System.out.println("잚못입력");
			}
		}
		System.out.println("프로그램 종료합니다.");
	}

}
