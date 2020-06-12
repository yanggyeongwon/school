package CodingTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sr = new StringBuilder();
		String str;
		
		while((str = br.readLine()) != null) {
			int a = str.charAt(0) - 48;
			int b = str.charAt(2) - 48;
			sr.append(a+b).append("\n");
		}
		System.out.println(sr);
	}

}
