import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex09_11_HashMap {

	public static void main(String[] args) {

		HashMap<String,String> dic = new HashMap<String,String>();
		//		Map<String,String> dic = new HashMap<String,String>();

		dic.put("pencil","����");
		dic.put("sky","�ϴ�");
		dic.put("desk","å��");
		dic.put("face","��");
		
		System.out.println(dic);
		Scanner sc = new Scanner(System.in);
		Set key = dic.keySet();
		
		while(true) {
			System.out.print("ã�� �ܾ��? (q�Է½� ����)");
			String id = sc.next();
			if(id.equals("q")) {
				break;
			}
			if(dic.get(id) == null) {
//			if(dic.containsKey(id)== false){
				System.out.println("ã�� �ܾ �����ϴ�.");
				continue;
			}else {
				System.out.println("�� :" + dic.get(id));
			}
		}

		System.out.println("�ý��� ����");

	}

}
