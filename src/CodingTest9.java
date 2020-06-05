import java.util.Scanner;

public class CodingTest9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int st = sc.nextInt();
		sc.close();
		
		for(int i=0; i<st; i++) {
			for(int j=0; j<st; j++) {
				if(j < st-(i+1)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.print("\n");
		}

	}

}
