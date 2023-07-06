package ex04;

public class Main {
	public static void main(String[] args) {
//		Address.run();
//		Database.getConnection();
		StudentDAO dao = new StudentDAO();
//		Student stu =new Student(200, "음메" ,"인천","010-123-456");
//		dao.insert(stu);
//		System.out.println(dao.read(200));
//		dao.delete(20);
		Student stf =new Student(102, "또우너" ,"깐따삐야 568구역","010-123-4567");
		dao.update(stf);
		
		
		
		for (Student vo : dao.slist()) {
			System.out.printf( vo.toString()+ "\n");	
		}
	}
}
