package ex04;

import java.util.*;

public class Address {
	public static void run() {

		List<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Student student = new Student(100, "고길동", "서울시 강북구", "010-112-119");
		list.add(student);
		student = new Student(101, "둘리", "얼음별 쥬라기월드", "010-");
		list.add(student);
		student = new Student(102, "도우너", "깐따삐야", "010-1234-5678");
		list.add(student);
		boolean run = true;

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.등록 | 2.목록 | 3.조회 | 4.수정 5.삭제  0.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");

			String menu = sc.nextLine();

			switch (menu) {
			case "0":
				run = false;
				break;
			case "1":
				student = new Student();
				student.setNo(100 + list.size());
				System.out.println("학번은" + student.getNo() + "입니다.");
				System.out.print("이름을 입력해주세요.");
				student.setName(sc.nextLine());
				System.out.print("주소을 입력해주세요.");
				student.setAddress(sc.nextLine());
				System.out.print("폰번호를 입력해주세요.");
				student.setPhone(sc.nextLine());
				System.out.println(student.toString() + "추가 되었습니다.");
				System.out.println("총 학생 수" + (list.size() + 1));
				list.add(student);
				break;
			case "2":
				for (Student student2 : list) {
					System.out.println(student2.toString());
				}
				System.out.println(list.size() + "명이등록되었습니다.");
				break;
			case "3":
				student = new Student();
				System.out.print("이름 입력>");
				String a = sc.nextLine();
				student = equal(list, a);
				if (student.getName() == null) {
					System.out.println("존재하지않는 사람입니다.");
				} else {
					System.out.println("데이터가 존재합니다.");
					System.out.println(student.toString());
				}
				break;
			case "5":
				student = new Student();
				System.out.print("이름 입력>");
				a = sc.nextLine();
				student = equal(list, a);
				if (student.getName() == null) {
					System.out.println("존재하지않는 사람입니다.");
				} else {
					System.out.println("데이터가 존재합니다.");
					System.out.println(student.toString());
					System.out.print("삭제하시려면 Y/y");
					String delete = sc.nextLine();
					if (delete.equals("Y") || delete.equals("y")) {
						System.out.println(student.getName() + "가 삭제되었습니다.");
						list.remove(student);
					}
				}

				break;
			case "4":
				student = new Student();
				System.out.print("이름 입력>");
				a = sc.nextLine();
				student = equal(list, a);
				if (student.getName() == null) {
					System.out.println("존재하지않는 사람입니다.");
				} else {
					System.out.println("데이터가 존재합니다.");
					System.out.println(student.toString());
					System.out.println("------------수정------------");
					System.out.println("1.학번 2.이름 3.주소 4.번호 5종료");
					String menu2 = sc.nextLine();

					switch (menu2) {
					case "1":
						System.out.print("바꾸려는 학번 입력바람>");
						int sno = sc.nextInt();
							student.setNo(sno);
							break;
					case "2":
						System.out.print("바꾸려는 이름 입력바람>");
						String sname = sc.nextLine();
						if (sname != "") {
							student.setName(sname);
							break;
						} else {
							System.out.println("공백은 불가능");
						}
					case "3":
						System.out.print("바꾸려는 주소 입력바람>");
						String saddress = sc.nextLine();
						if (saddress != "") {
							student.setAddress(saddress);
							break;
						} else {
							System.out.println("공백은 불가능");
						}
					case "4":
						System.out.print("바꾸려는 번호 입력바람>");
						String sphone = sc.nextLine();
						if (sphone != "") {
							student.setPhone(sphone);
							break;
						} else {
							System.out.println("공백은 불가능");
						}
					case "5":
						System.out.println("종료합니다.");
						break;
					default:
						System.out.println("1-5에까지만 선택바랍니다.");
					}
				}
				break;
			default:
				System.out.println("잘못누름");
			}

		} // while
		System.out.println("프로그램 종료");
	}// run

	public static Student equal(List<Student> list, String a) {
		Student vo = new Student();
		for (Student student : list) {
			if (student.getName().equals(a)) {
				vo = student;
			}
		}
		return vo;
	}
}// address
