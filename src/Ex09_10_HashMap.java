import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex09_10_HashMap {

	public static void main(String[] args) {//key �ߺ� ����, value �ߺ� ����
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("���̸�", new Integer(23));
		hm.put("����", new Integer(45));
		hm.put("����", new Integer(72));
		hm.put("����", 26);
		hm.put("����", 26);
		
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println(hm.get("����"));//72
		System.out.println(hm.get("������"));//null
		System.out.println(hm.get("26"));//null
		System.out.println("------------------");
		System.out.println(hm.containsKey("����"));//�����Ѵٸ� true/false :
		System.out.println(hm.containsKey("����"));
		System.out.println(hm.containsKey("26"));
		System.out.println("------------------");
		System.out.println(hm.containsValue("����"));//value�� integer �̱⶧���� " "�� �������
		System.out.println(hm.containsValue("26"));
		System.out.println(hm.containsValue(26));
		System.out.println("------------------");
		Set key = hm.keySet();
		System.out.println("key :"+ key);
		Collection<Integer> val = hm.values();
		System.out.println("value :"+val);
		
		Iterator<String> iter = key.iterator();

		while(iter.hasNext()) {//hasNext 1�� �� ������ true
			for(int i=0; i<key.size();i++) {
				String name = iter.next();
				System.out.println(name+":"+hm.get(name));
			}

	
		}
		
	}

}
