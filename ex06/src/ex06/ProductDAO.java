package ex06;

import java.sql.*;

import java.util.*;

public class ProductDAO {
	Connection con = Database.connect();
	
	
	
	
	
	public void delete(int pcode) throws Exception{
			String sql = "delete from products where pcode=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pcode);
			ps.execute();
	}
	
	public ProductVO read(int pcode) {
		ProductVO vo= new ProductVO();
		try {
			String sql = "select * from products where pcode = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pcode);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				vo.setPcode(rs.getInt("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setPprice(rs.getInt("pprice"));
			}
		}catch(Exception e) {
			System.out.println("상품조회:" + e.toString());
		}
		return vo;
	}
	
	public void insert(ProductVO vo) {
		try {
			String sql = "insert into products (pcode, pname, pprice) values(pcode_seq.nextval, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getPname());
			ps.setInt(2, vo.getPprice());
			ps.execute();
		}catch(Exception e) {
			System.out.println("상품입력:" + e.toString());
		}
	}
	
	
	public List<ProductVO> list(){
	List<ProductVO> array = new ArrayList<ProductVO>();
	try {
		String sql = "select * from products order by pcode desc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			ProductVO vo = new ProductVO();
			vo.setPcode(rs.getInt("pcode"));
			vo.setPname(rs.getString("pname"));
			vo.setPprice(rs.getInt("pprice"));
			array.add(vo);
		}
	}catch(Exception e) {
		System.out.println("상품목록:" + e.toString());
	}
	return array;
	}
}
