import java.util.*;
public class Ex08_06_���� {

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
					System.out.println("�ߺ��� �ٽ� ���� "+ j +": "+ i);
					i--;
					
				} 
			}
			System.out.println(lotto[i]+ " ");
		}
		for(i=0; i<lotto.length;i++) {
			System.out.println("����"+(i+1)+" : ");
			my [i] = sc.nextInt();
			
		}
		for(i=0; i<lotto.length;i++) {
			System.out.println(my[i]+ " ");
		}
		
	}

}
