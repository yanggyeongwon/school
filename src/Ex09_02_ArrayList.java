import java.util.*;

public class Ex09_02_ArrayList {

	public static void main(String[] args) {
		
		String s = "Hello";
		System.out.println("s :"+s.toString());
		
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("arr size: " + arr.size());
		
		arr.add("윤아");
		arr.add("태연");
		arr.add("수영");
		arr.add("효연");
		arr.add("수영");

		System.out.println("arr: " + arr);
		System.out.println("arr size: " + arr.size());
		System.out.println("arr: "+ arr.get(0));
		
		arr.add(1,"서현");
		
		System.out.println("arr: " + arr);
		System.out.println("--------------------------------");
		
		ArrayList<String> add = new ArrayList<String>();
		
		add.add("아이유");
		add.add("수지");
		
		System.out.println("add: "+ add);
		System.out.println("add size: "+ add.size());
		
		arr.addAll(add);
		
		System.out.println("arr: "+arr);
		System.out.println("add size: "+ add.size());
		System.out.println("add size: "+ arr.size());
		
		String str = arr.remove(1);
		boolean b = arr.remove("수영");
		
		System.out.println("str: " +str);
		System.out.println("b: " +b);
		System.out.println("add: "+ arr);
		arr.add("수영");
		System.out.println("arr: "+ arr);
		
//		ArrayList<E> su = new ArrayList<E>();//메인 클래스 static 옆에 <E>추가 하고 사용가능 
//		su.add((E) "수영");
		
		ArrayList<String> su = new ArrayList<String>();
		su.add("수영");
		
		arr.removeAll(su);
		System.out.println(su);
		System.out.println("arr: "+ arr);
		System.out.println("arr size: "+arr.size());
		
		int pos = arr.indexOf("효연");
		System.out.println("arr indexOf : " + pos);
		
		pos = arr.indexOf("웬디");
		System.out.println("pos indexOf :"+ pos);//양수는 있음 음수는 없음
		
		boolean isExist = arr.contains("효연");
		System.out.println("isExist : "+isExist);
		
		isExist = arr.contains("웬디");
		System.out.println("isExist : "+isExist);
		
		arr.set(1, "유리");
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
