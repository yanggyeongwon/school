import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex09_10_HashMap {

	public static void main(String[] args) {//key 중복 ㄴㄴ, value 중복 가능
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("아이린", new Integer(23));
		hm.put("슬기", new Integer(45));
		hm.put("웬디", new Integer(72));
		hm.put("조이", 26);
		hm.put("예리", 26);
		
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println(hm.get("웬디"));//72
		System.out.println(hm.get("아이유"));//null
		System.out.println(hm.get("26"));//null
		System.out.println("------------------");
		System.out.println(hm.containsKey("슬기"));//포함한다면 true/false :
		System.out.println(hm.containsKey("수지"));
		System.out.println(hm.containsKey("26"));
		System.out.println("------------------");
		System.out.println(hm.containsValue("슬기"));//value는 integer 이기때문에 " "를 없어야함
		System.out.println(hm.containsValue("26"));
		System.out.println(hm.containsValue(26));
		System.out.println("------------------");
		Set key = hm.keySet();
		System.out.println("key :"+ key);
		Collection<Integer> val = hm.values();
		System.out.println("value :"+val);
		
		Iterator<String> iter = key.iterator();

		while(iter.hasNext()) {//hasNext 1개 라도 있으면 true
			for(int i=0; i<key.size();i++) {
				String name = iter.next();
				System.out.println(name+":"+hm.get(name));
			}

	
		}
		
	}

}
