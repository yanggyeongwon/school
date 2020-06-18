import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex09_11_HashMap {

	public static void main(String[] args) {

		HashMap<String,String> dic = new HashMap<String,String>();
		//		Map<String,String> dic = new HashMap<String,String>();

		dic.put("pencil","연필");
		dic.put("sky","하늘");
		dic.put("desk","책상");
		dic.put("face","얼굴");
		
		System.out.println(dic);
		Scanner sc = new Scanner(System.in);
		Set key = dic.keySet();
		
		while(true) {
			System.out.print("찾는 단어는? (q입력시 종료)");
			String id = sc.next();
			if(id.equals("q")) {
				break;
			}
			if(dic.get(id) == null) {
//			if(dic.containsKey(id)== false){
				System.out.println("찾는 단어가 없습니다.");
				continue;
			}else {
				System.out.println("뜻 :" + dic.get(id));
			}
		}

		System.out.println("시스템 종료");

	}

}
