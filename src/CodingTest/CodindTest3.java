package CodingTest;
import java.io.*;

//import java.util.Scanner;

public class CodindTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		
		int j = Integer.parseInt(sc.readLine());
		sc.close();
		
		int sum = 0;
		
		for(int i=1; i<=j ; i++) {
			sum += i;
			
		}
		System.out.println(sum);
	}

}
