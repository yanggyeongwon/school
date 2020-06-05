import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sc = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i=sc;i>0;--i) {
			System.out.println(i);
		}
	}

}
