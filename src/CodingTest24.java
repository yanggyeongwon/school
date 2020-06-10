import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest24 {
	public static long patc(int n) {
		if(n==0) {
			return 1;
		}
		return n * patc(n-1);
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		
		int Input = Integer.parseInt(sc.readLine());
		
		System.out.println(patc(Input));
		
	}

}
