import java.util.*;
public class Ex08_06_양경원 {

	public static void main(String[] args) {
		
		int lotto [] = new int [6];
		int my [] = new int [6];
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int j = 0;
		
		for(i=0; i<lotto.length;i++) {
			lotto [i] = (int)(Math.random()*45)+1;
			for(j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					System.out.println("중복됨 다시 숫자 "+ j +": "+ i);
					i--;
					
				} 
			}
			System.out.println(lotto[i]+ " ");
		}
		for(i=0; i<lotto.length;i++) {
			System.out.println("숫자"+(i+1)+" : ");
			my [i] = sc.nextInt();
			
		}
		for(i=0; i<lotto.length;i++) {
			System.out.println(my[i]+ " ");
		}
		
	}

}
