import java.util.*;
public class Ex08_06_양경원 {

	public static void main(String[] args) {
		
		int lotto [] = new int [6];
		int my [] = new int [6];
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int j = 0;
		int sum = 0;
		for(i=0; i<lotto.length;i++) {
			lotto [i] = (int)(Math.random()*45)+1;
			System.out.print("숫자 "+ (i+1) +": ");
			for(j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					System.out.println("중복됨 다시 숫자 "+ (i+1) +": "+ i);
					i--;
				} 
			}
			System.out.println(lotto[i]+ " ");
		}
		System.out.println("1~45사이의 수 입력하세요.");
		for(i=0; i<lotto.length;i++) {
			System.out.print("내 숫자"+(i+1)+" : ");
			my [i] = sc.nextInt();
		}
		for(i=0; i<lotto.length;i++) {
			sum = my[i];
			System.out.print(sum+" ");
		}
		
	}

}
