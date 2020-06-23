import java.io.*;
import java.util.*;
public class Ex11_09_Scanner {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("data.txt");
		Scanner sc = new Scanner(f);
		
		int sum = 0,num;
//		sc.useDelimiter(" ");
		
		while(sc.hasNextInt()) {
			num = sc.nextInt();
			System.out.println(num);
			sum += num;
		}
		System.out.println("sum :" + sum);
		
		sc.close();
	}

}
