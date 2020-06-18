import java.util.HashSet;
import java.util.Set;

public class Ex09_09_set {

	public static void main(String[] args) {		
		
		Set<Integer> hs = new HashSet<Integer>();
//		while(hs.size() <= 5) {
//			hs.add((int)((Math.random()*10)+1));
//		}
//		for(int a: hs) {
//			System.out.println(a);
//		}
		int count = 0;
		while(true) {
			int num = (int)((Math.random()*10)+1);
			hs.add(num);
			count++;
			if(hs.size() == 6) {
				break;
			}
//			if(count == 6) {
//				break;
//			}
		}
		System.out.println("¹Ýº¹È½¼ö : "+count);
		System.out.println(hs);
		Integer arr [] = new Integer[6];
		hs.toArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
