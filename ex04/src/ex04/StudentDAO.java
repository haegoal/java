package ex04;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	Connection con=Database.getConnection();
	
	public void update(Student vo) {
		try {
			String sql="update tbl_address set name = ?, address = ?, phone=? where no= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(4, vo.getNo());
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getAddress());
			ps.setString(3, vo.getPhone());
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생수정:" + e.toString());
		}
	}
	
	public void delete(int no) {
		try {
			String sql="delete from tbl_address where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생삭제:" + e.toString());
		}
	}
	
	public Student read(int no) {
		Student vo = new Student();
		try {
			String sql = "select * from tbl_address where no=?";
			PreparedStatement ps = con.prepareStatement(sql); //중요해서 트라이 캣치문에 넣어줘야함
			ps.setInt(1, no);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				vo.setNo(rs.getInt("no"));
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setPhone(rs.getString("phone"));
			}
		}catch(Exception e) {
			System.out.println("학생조회: " + e.toString());
		}
		return vo;
	}
	
	//학생등록 
	
	public void insert(Student vo) {
		try {
			String sql="insert into tbl_address (no, name, address, phone) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getNo());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getAddress());
			ps.setString(4, vo.getPhone());
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생등록:" + e.toString());
		}
	}
	
	public List<Student> slist(){
		List<Student> list = new ArrayList<Student>();
		try {
			String sql = "select * from tbl_address order by no";
			PreparedStatement ps = con.prepareStatement(sql); //중요해서 트라이 캣치문에 넣어줘야함
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Student vo = new Student();
				vo.setNo(rs.getInt("no"));
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setPhone(rs.getString("phone"));
				list.add(vo);
			}
		}catch(Exception e) {
			System.out.println("학생목록: " + e.toString());
		}
		return list;
	}
	
}
