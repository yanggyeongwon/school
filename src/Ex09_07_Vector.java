import java.util.Enumeration;
import java.util.Vector;

public class Ex09_07_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		v.add("봄");
		v.add("여름");
		v.add("봄");
		v.add("겨울");
		
		System.out.println("v :" + v);
		Enumeration<String> en = v.elements();//v가 관리하는 요소 가져옴 / elements 요소있으면 true 없으면 false / enum 열거형 데이터담음

		while(en.hasMoreElements()) {//boolean 리턴 
			String el = en.nextElement();
			System.out.println(el);
		}
		System.out.println();
		
		for(String temp : v) {
			System.out.println(temp);
		}
	}

}
