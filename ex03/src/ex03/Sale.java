package ex03;

import java.util.*;

public class Sale {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		LinkedList<SaleVO> list = new LinkedList<SaleVO>();
		SaleVO sale = new SaleVO(100, "냉장고", 250, 10);
		list.add(sale);
		sale = new SaleVO(101, "세탁기", 220, 5);
		list.add(sale);
		sale = new SaleVO(102, "건조기", 230, 5);
		list.add(sale);

		while (run) {
			System.out.println("\n\n*********** 재고관리 ****************");
			System.out.println("1.입력 2.조회 3.목록 4.수정 5.삭제 0종료");
			System.out.println("------------------------------------");
			System.out.print("입력> ");
			String menu = sc.nextLine();

			switch (menu) {
			case "0":
				run = false;
				break;
			case "1":
				SaleVO s = new SaleVO();
				s.setCode(100 + (list.size()));
				System.out.println(s.getCode() + "코드입니다.");
				System.out.print("상품명 입력> ");
				s.setName(sc.nextLine());
				System.out.print("단가 입력> ");
				s.setPrice(Integer.parseInt(sc.nextLine()));
				System.out.print("수량 입력> ");
				s.setQnt(Integer.parseInt(sc.nextLine()));
				list.add(s);
				s.setSum(s.getPrice() * s.getQnt());
				s.print_land();
				break;
			case "2":
				System.out.println("이름을 입력해주세요.");
				String a = sc.nextLine();
				s = search(list, a);
				if (s.getName() == null) {
					System.out.println("없는 이름입니다.");
				} else {
					s.print_land();
				}
				break;
			case "3":
				for (SaleVO saleVO : list) {
					saleVO.setSum(saleVO.getPrice() * saleVO.getQnt());
					saleVO.print_land();
				}
				System.out.println(list.size() + "개 상품이 등록되어있습니다.");
				break;
			case "4":
				System.out.println("이름을 입력해주세요.");
				a = sc.nextLine();
				s = search(list, a);
				if (s.getName() == null) {
					System.out.println("없는 이름입니다.");
				} else {
					s.print_land();
					System.out.print("수정할 이름 입력>");
					String newName = sc.nextLine();
					if (newName != "") {
						s.setName(newName);
						System.out.println("상품이름:" + s.getName());
					}
					System.out.print("수정할 가격 입력>");
					String newPrice = sc.nextLine();
					if (newPrice != "") {
						s.setPrice(Integer.parseInt(newPrice));
						System.out.println("상품가격:" + s.getPrice());
					}
					System.out.print("수정할 수량 입력>");
					String newQnt = sc.nextLine();
					if (newQnt != "") {
						s.setQnt(Integer.parseInt(newQnt));
						System.out.println("상품가격:" + s.getQnt());
					}
					System.out.println("수정완료");
				}
				break;
			case "5":
				System.out.println("이름을 입력해주세요.");
				a = sc.nextLine();
				s = search(list, a);
				if (s.getName() == null) {
					System.out.println("없는 이름입니다.");
				} else {
					System.out.println("삭제하시겠습니까? Y/y");
					String b = sc.nextLine();
					if (b.equals("Y") || b.equals("y")) {
						System.out.println(s.getName() + "삭제완료");
						list.remove(s);
					}else {
					}
				}
				break;
			default:
				System.out.println("잘못입력함");
			}
		}
		System.out.println("프로그램 종료");
	}

	public static SaleVO search(LinkedList<SaleVO> list, String name) {
		SaleVO vo = new SaleVO();
		for (SaleVO s : list) {
			if (s.getName().equals(name)) {
				System.out.println(s.getName() + "존재합니다.");
				vo = s;
			}
		}
		return vo;
	}
}
