package CodingTest;
import java.util.Scanner;
import java.util.Arrays;

public class CodingTest20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] arry  = new int [N];
		for(int i = 0;i < N;i++) {
			arry[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arry);
		System.out.print(arry[0] + " " + arry[N-1]);
	}
	
}
