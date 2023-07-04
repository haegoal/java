package day10;

import java.util.ArrayList;
import java.util.List;

public class ArraylistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= new String[10];
		
		a[0] = "안녕";
		a[1] = "반가워요";
		a[2] = "잘있어요";
		
		
		List<String> b = new ArrayList<String>();
	
		b.add("안녕");
		b.add("반가워요");
		b.add("잘있어요");
		
		for(int i=0; i<3; i++) {
			System.out.println(a[i]);
		}
		for(int i=0; i<b.size(); i++) {
			System.out.println(b.get(i));
		}
	}

}
