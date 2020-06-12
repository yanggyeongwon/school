package CodingTest;
import java.util.Scanner;

public class CodingTest17 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int star = sc.nextInt();
		
		for(int i=0; i<star;i++) {
			for(int j =0; j<i;j++) {
				System.out.print("*");	
			}
			System.out.println("*");	
		}
		
		
		for (int i=star-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
