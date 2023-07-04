package ex02;

import java.util.LinkedList;
import java.util.Scanner;

public class Grade {

	public static void run() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		LinkedList<ScoreVO> list = new LinkedList<ScoreVO>();
		ScoreVO s = new ScoreVO("202301", "둘리", 90, 90, 90);
		list.add(s);
		s = new ScoreVO("202302", "마이콜", 80, 70, 60);
		list.add(s);
		s = new ScoreVO("202303", "고길동", 40, 50, 30);
		list.add(s);

		while (run) {
			System.out.println("*********** 성적관리 ****************");
			System.out.println("1.입력 2.조회 3.목록 4.수정 5.삭제 0종료");
			System.out.println("------------------------------------");
			System.out.print("입력> ");
			String menu = sc.nextLine();

			switch (menu) {
			case "0":
				run = false;
				break;
			case "1":
				s = new ScoreVO();
				s.setNo("2023" + 0 + (list.size() + 1));
				System.out.println("학번은" + s.getNo());
				System.out.print("이름 입력해주세용");
				s.setName(sc.nextLine());
				System.out.print("국어점수입력크바람");
				s.setKor(Integer.parseInt(sc.nextLine()));
				System.out.print("영어점수입력크바람");
				s.setEng(Integer.parseInt(sc.nextLine()));
				System.out.print("수학점수입력크바람");
				s.setMat(Integer.parseInt(sc.nextLine()));
				list.add(s);
				break;
			case "2":
				System.out.print("이름입력바람>");
				String a = sc.nextLine();
				boolean find = false;
				for (ScoreVO s2 : list) {
					if (a.equals(s2.getName())) {
						find = true;
						s2.setGrade(getGrade(s2.getAvg()));
						System.out.println(s2.toString());
						break;
					}
				}
				if (!find) {
					System.out.println("그런사람없다잉");
				}
				break;
			case "3":
				for (ScoreVO s2 : list) {
					s2.setGrade(getGrade(s2.getAvg()));
					System.out.println(s2.toString());
				}
				break;
			case "4":
				System.out.print("(관리자메뉴)수정할 이름입력바람>");
				a = sc.nextLine();
				search(list, a);
				if(s.getName() == null) {
					System.out.println("없는이름입니다.");
				}
			
				break;
			case "5":
				System.out.print("삭제할 이름입력바람>");
				a = sc.nextLine();
				find = false;
				for (ScoreVO s2 : list) {
					if (a.equals(s2.getName())) {
						find = true;
						s2.setGrade(getGrade(s2.getAvg()));
						System.out.println(s2.toString() + "\n 입니다. 삭제하시려면 Y/y");
						String b = sc.nextLine();
						if(b.equals("Y") || b.equals("y")) {
							list.remove(s2);
							System.out.println("삭제완료");
						}else {
							System.out.println("삭제를 취소했다잉");
						}
						break;
					}
				}
				if (!find) {
					System.out.println("그런사람없다잉");
				}
				break;
			default:
				System.out.println("잘못눌렀다잉");
			}

		}
		System.out.println("프로그램 종료됩니다.");
	

	}
	
	public static ScoreVO search(LinkedList<ScoreVO> list, String name) {
		ScoreVO vo= new ScoreVO();
		for (ScoreVO s : list) {
			if(name.equals(s.getName())) {
				s.setGrade(getGrade(s.getAvg()));
				System.out.println(s.toString());
				vo = s;
			}                                                                                                  
		}
		
		return vo;
	}
	


	public static String getGrade(double avg) {
		String grade = "";
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}
}
