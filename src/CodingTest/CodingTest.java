package CodingTest;
import java.util.*;

public class CodingTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M < 45) {
			H--;
			M = 60 - (M - 45);
			if(H < 0) {
				H=23;
			}
			System.out.println(H+" "+M);
		}else {
			System.out.println(H+" "+(M-45));
		}
		
		
	}
}