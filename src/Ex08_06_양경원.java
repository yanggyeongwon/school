import java.util.*;
public class Ex08_06_���� {

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
			System.out.print("���� "+ (i+1) +": ");
			for(j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					System.out.println("�ߺ��� �ٽ� ���� "+ (i+1) +": "+ i);
					i--;
				} 
			}
			System.out.println(lotto[i]+ " ");
		}
		System.out.println("1~45������ �� �Է��ϼ���.");
		for(i=0; i<lotto.length;i++) {
			System.out.print("�� ����"+(i+1)+" : ");
			my [i] = sc.nextInt();
		}
		for(i=0; i<lotto.length;i++) {
			sum = my[i];
			System.out.print(sum+" ");
		}
		
	}

}
