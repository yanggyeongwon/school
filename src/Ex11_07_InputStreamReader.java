import java.io.*;
import java.util.*;
public class Ex11_07_InputStreamReader {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.println("������ �Է�: ");
		
		String str = br.readLine();
		
		int i = Integer.parseInt(br.readLine());
		
		System.out.println("str : " + str);
		br.close();
		
		
		//bw.close();
		//bw.flush();
	}
}









