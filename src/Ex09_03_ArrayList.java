import java.util.ArrayList;

public class Ex09_03_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("바나나");
		arr.add("오렌지");
		arr.add("사과");
		System.out.println("arr: "+ arr);
		System.out.println(arr.get(1));
		
		arr.add(2, "메론");
		
		System.out.println("arr :"+arr);
	}

}
