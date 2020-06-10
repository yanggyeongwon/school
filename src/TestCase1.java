import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class TestCase1 {
	
	static char arr[][]; 
	public static void funtion(int a,int b,int n) { 
		int div = 0;
		if(n==1) {
			arr[a][b] = '*';
			return;
		}
		
		 div= n/3;
		
		for(int i=0;i<3;i++) { 
			for(int j=0;j<3;j++) {
				if(i==1 && j ==1) continue;
				funtion(a+(div*i),b+(div*j),div); 
			}
		}
		
		
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(sc.readLine());
		
		arr = new char[n][n];
		
		for(int i=0; i<arr.length; i++) {
			Arrays.fill(arr[i], ' ');//
		}
		
		funtion(0, 0, n);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}


}

