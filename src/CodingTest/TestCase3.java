package CodingTest;

import java.util.Scanner;

public class TestCase3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();;
		int sum;

		if(c-b <= 0) { 
			sum = -1;
		}else {
			sum = a / (c-b)+1;		
		}
		System.out.println(sum);

	}

}
