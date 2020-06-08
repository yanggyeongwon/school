import java.util.Scanner;

public class CodingTest19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
 
		for(int i = 1; i <= 2*N; i++){//N이 2일때 1<=4
			if(i%2 == 1){//2배수 1로 떨어지는애들
				for(int j = 1; j <= N; j++){//N은 3일때
					if(j%2 == 1){//처음은 1 true, 마지막 3이니까 true
						System.out.print("*1");
					}
					else{//2번째는 false N이 3이니까 3번 돌고 
						System.out.print(" 1");
					}
				}
			}
			else{//2배수가 1로 안떨어지는 아닌 애들
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