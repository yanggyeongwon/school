import java.util.Scanner;

public class CodingTest19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N%2==0) {
			System.out.print("*");
			for(int i = 0;i<N; i++) {
				System.out.print(" *");
				
			}
		}
		
	}

}
