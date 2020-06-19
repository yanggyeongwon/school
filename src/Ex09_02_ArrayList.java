import java.util.*;

public class Ex09_02_ArrayList {

	public static void main(String[] args) {
		
		String s = "Hello";
		System.out.println("s :"+s.toString());//hello
		
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("arr size: " + arr.size());//0
		
		arr.add("����");
		arr.add("�¿�");
		arr.add("����");
		arr.add("ȿ��");
		arr.add("����");

		System.out.println("arr: " + arr);//���� �¿� ���� ȿ�� ����
		System.out.println("arr size: " + arr.size());//5
		System.out.println("arr: "+ arr.get(0));//����
		
		arr.add(1,"����");
		
		System.out.println("arr: " + arr);//���� �¿� ���� ȿ�� ����
		System.out.println("--------------------------------");
		
		ArrayList<String> add = new ArrayList<String>();
		
		add.add("������");
		add.add("����");
		
		System.out.println("add: "+ add);
		System.out.println("add size: "+ add.size());
		
		arr.addAll(add);
		
		System.out.println("arr: "+arr);
		System.out.println("add size: "+ add.size());
		System.out.println("arr size: "+ arr.size());
		
		String str = arr.remove(1);
		boolean b = arr.remove("����");
		
		System.out.println("str: " +str);
		System.out.println("b: " +b);
		System.out.println("add: "+ arr);
		arr.add("����");
		System.out.println("arr: "+ arr);
		
//		ArrayList<E> su = new ArrayList<E>();//���� Ŭ���� static ���� <E>�߰� �ϰ� ��밡�� 
//		su.add((E) "����");
		
		ArrayList<String> su = new ArrayList<String>();
		su.add("����");
		
		arr.removeAll(su);
		System.out.println(su);
		System.out.println("arr: "+ arr);
		System.out.println("arr size: "+arr.size());
		
		int pos = arr.indexOf("ȿ��");
		System.out.println("arr indexOf : " + pos);
		
		pos = arr.indexOf("����");
		System.out.println("pos indexOf :"+ pos);//����� ���� ������ ����
		
		boolean isExist = arr.contains("ȿ��");
		System.out.println("isExist : "+isExist);
		
		isExist = arr.contains("����");
		System.out.println("isExist : "+isExist);
		
		arr.set(1, "����");
		System.out.println("arr indexOf : " + arr);
		
		arr.clear();
		
		System.out.println("arr clear: "+ arr);
		System.out.println("arr size clear: "+arr.size());
		System.out.println("--------------------------------");
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		System.out.println("arr2 size: " + arr2.size());
		
		arr2.add(10);
		arr2.add(20);
		arr2.add(30);
		
		System.out.println("arr2 : " + arr2.toString());
		System.out.println("arr2 size: " + arr2.size());
		System.out.println("arr2 : "+ arr2.get(1));
		
		
		
	}


}
