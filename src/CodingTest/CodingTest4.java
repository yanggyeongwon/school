package CodingTest;
import java.util.*;
import java.io.*;

public class CodingTest4 {
    public static void main(String [] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine().trim());
        int[] sum = new int[n];
        
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            sum[i] = a+b;
        }
        	
        bw.flush();
        bw.close();
        br.close();
    }
}
