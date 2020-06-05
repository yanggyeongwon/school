
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//System.out.println(a+" "+b);
		System.out.printf("a+b=%d\n",a+b);
		System.out.printf("a-b=%d\n",a-b);
		System.out.printf("a*b=%d\n",a*b);
		System.out.printf("a/b=%.2f",(float)a/b);
	}

}
