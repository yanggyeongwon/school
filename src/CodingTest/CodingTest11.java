package CodingTest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CodingTest11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(str.nextToken());
			int B = Integer.parseInt(str.nextToken());
			
			if(A ==0 && B ==0)break;
			
			int sum = A + B;
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
	}

}
