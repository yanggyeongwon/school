package CodingTest;
import java.util.Scanner;

public class CodingTest19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
 
		for(int i = 1; i <= 2*N; i++){//N�� 2�϶� 1<=4
			if(i%2 == 1){//2��� 1�� �������¾ֵ�
				for(int j = 1; j <= N; j++){//N�� 3�϶�
					if(j%2 == 1){//ó���� 1 true, ������ 3�̴ϱ� true
						System.out.print("*1");
					}
					else{//2��°�� false N�� 3�̴ϱ� 3�� ���� 
						System.out.print(" 1");
					}
				}
			}
			else{//2����� 1�� �ȶ������� �ƴ� �ֵ�
				for(int j = 1; j <= N; j++){
					if(j%2 == 1){
						System.out.print(" 2");
					}
					else{
						System.out.print("*2");
					}
				}
			}
			System.out.print("\n");
		}
	}
}