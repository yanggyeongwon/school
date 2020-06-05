import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class CodingTest10 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		String [] word = input.split(" ");
		
		int a = Integer.parseInt(word[0]); 
		int b = Integer.parseInt(word[1]);
		
		String array = br.readLine();
		String [] num = array.split(" ");
		for(int i=0;  i<a; i++) {
			
			int N = Integer.parseInt(num[i]);
			if(N < b) bw.write(num[i] + " ");
			
		}
		bw.flush();
		br.close();
		bw.close();

	}

}

