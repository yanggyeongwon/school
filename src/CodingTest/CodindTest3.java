package CodingTest;
import java.io.*;
import java.util.Scanner;

//import java.util.Scanner;

public class CodindTest3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String name [] = new String[3];

		String [] arr = {"010", "011", "012", "013", "014", "015", "016", "017", "110", "111", "123"};
		
		int count = 0;		
		for(int i = 0; i < arr.length; i++) {
			name[i] = sc.next();
				if(name[i].equals(arr[i])) {	
					count++;
					System.out.println(count);
					break;
				}else {
					System.out.println(name[i]);
					System.out.println(arr[i]);
					System.out.println("안됏음");
				}
				
		}
		
		
	}

}
//배열안에 전화번호가있음 010/ 011 /012. . . .
//010을 제외한 나머지 번호들 중에 중복값  999