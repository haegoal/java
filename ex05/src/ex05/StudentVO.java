package ex05;

import java.util.Date;

public class StudentVO {
	private String sno;
	private String sname;
	private String dept;
	private String bir;
	private int year;
	

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getBir() {
		return bir;
	}

	public void setBir(String bir) {
		this.bir = bir;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "StudentVO [sno=" + sno + ", sname=" + sname + ", dept=" + dept + ", bir=" + bir + ", year=" + year
				+ "]";
	}
}


