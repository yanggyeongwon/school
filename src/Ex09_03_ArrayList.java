import java.util.ArrayList;

public class Ex09_03_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("�ٳ���");
		arr.add("������");
		arr.add("���");
		System.out.println("arr: "+ arr);
		System.out.println(arr.get(1));
		
		arr.add(2, "�޷�");
		
		System.out.println("arr :"+arr);
	}

}
