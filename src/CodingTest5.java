import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = Integer.parseInt(br.readLine());
		br.close();
		
		int n = 1;
		while(n<=i) {
			System.out.println(n);
			n++;
		}
		
	}

}
