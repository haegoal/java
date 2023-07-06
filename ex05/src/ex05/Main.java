package ex05;

import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;

public class Main {
	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년MM월 dd일");
		Scanner s =new Scanner(System.in);

		boolean run=true;
		while(run) {
			System.out.println("\n\n******* 학생관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			String menu=s.nextLine();
			switch(menu) {
			case "0":
				run=false;
				System.out.println("프로그램을 종료합니다.");
				break;
			case "1":
				StudentVO stu = new StudentVO();
				stu.setSno(dao.getNo());
				System.out.println("학번" + stu.getSno());
				System.out.print("이름>");
				stu.setSname(s.nextLine());
				stu.setDept("컴정");
				System.out.println("학과" + stu.getDept());
				stu.setBir("2000-01-01");
				System.out.println("생일>" + stu.getBir());
				dao.insert(stu);
				System.out.println(stu.getSname() + "학생이 등록되었습니다.");
				break;
			case "2":
				System.out.print("조회할 학번>");
				String sno = s.nextLine();
				StudentVO stu2 = dao.read(sno);
				if(stu2.getSname() == null) {
					System.out.println("학생이없다");
				}else {
					System.out.println("이름>" + stu2.getSname());
					System.out.println("학과>" + stu2.getDept());
					System.out.println("생일>" + stu2.getBir());
					System.out.println("학년>" + stu2.getYear());
				}
				break;
			case "3":
				for (StudentVO vo : dao.list()) {
					System.out.printf("%s\t%s\t%s\t%s\t%d\n", vo.getSno(), vo.getSname(), vo.getDept(), vo.getBir().substring(0,10), vo.getYear());
				}
				break;
			case "4":
				System.out.print("학생번호 입력>");
				sno = s.nextLine();
				StudentVO stu4 = dao.read(sno);
				if(stu4.getSname() == null) {
					System.out.println(sno + "학생이없다");
				}else {
					System.out.print(stu4.getSname() + ">");
					String newName = s.nextLine();
					if(newName != "") {
						stu4.setSname(newName);
					}
					System.out.print(stu4.getDept() + ">");
					String newDept= s.nextLine();
					if(newDept != "") {
						stu4.setDept(newDept);
					}
					stu4.setBir(stu4.getBir().substring(0,10));
					System.out.print(stu4.getYear() + ">");
					String newYear = s.nextLine();
					if(newYear != "") {
						stu4.setYear(Integer.parseInt(newYear));
					}
					dao.update(stu4);
				}
				break;
			case "5":
				System.out.print("학생번호 입력>");
				sno = s.nextLine();
				StudentVO stu3 = dao.read(sno);
				if(stu3.getSname() == null) {
					System.out.println(sno + "학생이없다");
				}else {
					System.out.println(stu3.toString());
					System.out.print("삭제할꺼면 Y/y");
					String sc = s.nextLine();
					if(sc.equals("Y") || sc.equals("y")) {
						dao.delete(sno);
						System.out.println("삭제완료");
					}
				}
				break;	
			default: 
				System.out.println("메뉴를 다시선택하세요!");
			}
		}
	}
}
