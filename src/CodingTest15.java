import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CodingTest15 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int buger = 2001;
		int drink = 2001;
		
		
		for(int i = 0; i < 3 ;i++) {
			int result = Integer.parseInt(br.readLine());
			if(result < buger) {
				buger = result;
			}
		}
		System.out.println("버거"+buger);
		for(int i = 0; i < 2 ;i++) {
			int result = Integer.parseInt(br.readLine());
			if(result < drink) {
				drink = result;
			}
		}
		System.out.println("음료"+drink);
		System.out.println(buger + drink - 50);
		
		

	}

}
