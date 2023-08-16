package ex06;

import java.text.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDAO dao = new ProductDAO();
		SaleDAO dao2 = new SaleDAO();
		DecimalFormat df = new DecimalFormat("#,###원");
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Scanner s = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("\n\n******* 상품관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
			System.out.println("6.판매정보조회 ");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			String menu = s.nextLine();
			switch (menu) {
			case "6":
				while (true) {
					System.out.println("코드를 입력해주세요.");
					String scode = s.nextLine();
					if (scode == "") {
						break;
					} else {
						if (isNumber(scode) == false) {
							break;
						}
						ProductVO vo5 = dao.read(Integer.parseInt(scode));
						if (vo5.getPname() == null) {
							System.out.println("조회할상품이없당");
						} else {
							System.out.println("상품이름" + vo5.getPname());
							System.out.println("상품가격" + vo5.getPprice());
							System.out.println("----------------------------------");
							System.out.println("판매수량\t판매가격\t판매금액\n");
							for (SaleVO vo : dao2.list(Integer.parseInt(scode))) {
								System.out.printf("%d\t%s\t%s\t%s\n", vo.getQnt(), df.format(vo.getSprice()),
										df.format(vo.getQnt() * vo.getSprice()),sdf.format(vo.getSdate()));
							}
							break;
						}

					}
				}
				break;
			case "0":
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			case "1":
				ProductVO vo1 = new ProductVO();
				System.out.print("이름입력> ");
				String pname = s.nextLine();
				if (pname == "") {
					System.out.println("입력을 종료합니다.");
					break;
				} else {
					vo1.setPname(pname);
					while (true) {
						System.out.print("가격입력> ");
						String pprice = s.nextLine();
						if (isNumber(pprice)) {
							vo1.setPprice(Integer.parseInt(pprice));
							dao.insert(vo1);
							System.out.println("상품등록완료");
							break;
						}
					}
				}
				break;
			case "2":
				while (true) {
					System.out.print("P코드입력바람>");
					String pcode = s.nextLine();
					if (pcode == "") {
						System.out.println("조회를 종료합니다.");
						break;
					}
					if (isNumber(pcode)) {
						ProductVO vo2 = dao.read(Integer.parseInt(pcode));
						if (vo2.getPname() == null) {
							System.out.println("해당 상품이 존재하지않습니다.");
						} else {
							System.out.println("상품이름" + vo2.getPname());
							System.out.println("상품가격" + vo2.getPprice());
							break;
						}
					}
				}
				break;
			case "3":
				for (ProductVO vo : dao.list()) {
					System.out.printf("%d\t%s\t%s\n", vo.getPcode(), vo.getPname(), df.format(vo.getPprice()));
				}
				System.out.println(dao.list().size() + "개 상품이 등록되었습니다.");
				break;
			case "4":
				break;
			case "5":
				while (true) {
					System.out.print("삭제할 코드를 입력해주세요.");
					String pcode = s.nextLine();
					if (pcode == "") {
						System.out.println("종료합니다.");
						break;
					}
					if (isNumber(pcode)) {
						ProductVO vo4 = dao.read(Integer.parseInt(pcode));
						if (vo4.getPname() == null) {
							System.out.println("상품이 없습니다.");
						} else {
							System.out.println("상품이름" + vo4.getPname());
							System.out.println("상품가격" + vo4.getPprice());
							System.out.print("삭제하려면 Y/y");
							String y = s.nextLine();
							if (y.equals("Y") || y.equals("y") || y.equals("ㅛ")) {
								try {
									dao.delete(Integer.parseInt(pcode));
									System.out.println("삭제완료");
									break;
								} catch (Exception e) {
									System.out.println("상품삭제불가능");
								}
							} else {
								System.out.println("삭제가 취소됐습니다.");
							}
							break;
						}
					}
				}
				break;
			default:
				System.out.println("잘못누름");
			}
		}

	}

	static boolean isNumber(String pprice) {
		try {
			int number = Integer.parseInt(pprice);
			return true;
		} catch (Exception e) {
			System.out.println("숫자로 입력하세요.");
			return false;
		}
	}
}