import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class TestCase2{
    static int n,cnt=0;
    static StringBuilder sb = new StringBuilder();
    static void hanoi(int n,int from,int by,int to){
        cnt++;
        if(n==1){
            sb.append(from+" "+to+"\n");
            return;
        }else{
            hanoi(n-1,from,to,by);
            sb.append(from+" "+to+"\n");
            hanoi(n-1,by,from,to);
        }
    }
    public static void main(String [] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(sc.readLine());
        hanoi(n,1,2,3);
        System.out.println(cnt);
        System.out.println(sb);
    }
}
