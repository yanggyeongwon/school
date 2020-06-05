import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest13 {

	public static void main(String[] args) throws IOException {
		BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(sr.readLine());
		
		int zero = 0;
		int copy = N;
		
		do {
			N = ((N%10)*10) + (((N/10) + (N%10))%10);
			zero++;
		} while (copy != N);
		
		System.out.println(zero);
		

	}

}
