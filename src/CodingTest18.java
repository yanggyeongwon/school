import java.util.Scanner;

public class CodingTest18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i =0;i<2*n-1;i++) {//n=9
			if(i < n) {//0 < 9
				for(int j=0; j<i; j++) //0<0
					System.out.print(" ");//1.공백 없음
				for(int j=0; j<(n-i)*2-1; j++)//9*1=9 1번째줄
					System.out.print("*");
				System.out.println();//2번재줄
			}else {
				for (int j=0; j<2*(n-1)-i; j++)
					System.out.print(" ");
				for (int j=0; j<(i+1-n)*2+1; j++)
					System.out.print("*");
				System.out.println();
			}
		}
	}

}
