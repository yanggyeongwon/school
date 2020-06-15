import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex07_05_divide {
	private static boolean divide(int num3, int num4) {
		try {
			int div = num3/num4;
			System.out.println("div : "+ div);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			return false;
		} finally {
			System.out.println("finally");
		}
		
	}
	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num1 = Integer.parseInt(br.readLine());
//		int num2 = Integer.parseInt(br.readLine());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수 1 : ");
		int num3 = sc.nextInt();
		System.out.println("수 2 : ");
		int num4 = sc.nextInt();
		
		boolean result = divide(num3,num4);
		if(result == true) {
			System.out.println("연산성공");
		}else {
			System.out.println("연산실패");
		}
	}

	

}
