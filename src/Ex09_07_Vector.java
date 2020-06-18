import java.util.Enumeration;
import java.util.Vector;

public class Ex09_07_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		v.add("��");
		v.add("����");
		v.add("��");
		v.add("�ܿ�");
		
		System.out.println("v :" + v);
		Enumeration<String> en = v.elements();//v�� �����ϴ� ��� ������ / elements ��������� true ������ false / enum ������ �����ʹ���

		while(en.hasMoreElements()) {//boolean ���� 
			String el = en.nextElement();
			System.out.println(el);
		}
		System.out.println();
		
		for(String temp : v) {
			System.out.println(temp);
		}
	}

}
