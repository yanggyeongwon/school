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
		for(i=0; i<lotto.length; i++) {
			lotto [i] = (int)(Math.random()*45)+1;
			//System.out.print("���� "+ (i+1) +": ");
			for(j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*45)+1;
					j = -1;
				} 
			}
			//System.out.println(lotto[i]+ " ");
		}

		for(i=0; i<lotto.length;i++) {
			System.out.print("�� ����"+(i+1)+" : ");
			my [i] = sc.nextInt();

			for(j=0; j<i; j++) {
				if(my[i] == my[j]) {
					System.out.print("�ߺ��� �ٽ� �Է� ���� "+(i+1)+":");
					my [i] = sc.nextInt();
					j = -1;
					if(my[i] < 1 || my[i] > 45) {
						System.out.println("1~45������ �� �Է��ϼ���.");
						i--;
						continue;
					}
				}
			}

		}

		System.out.println("----��ǻ�Ͱ� �߻���Ų ��ȣ----");
		for(i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println("----���� �߻���Ų ��ȣ----");
		for(i=0; i<lotto.length; i++) {
			System.out.print(my[i]+" ");
		}
		
		for(i=0;i<lotto.length;i++) {
			for(j=0;j<lotto.length;j++) {
				if(lotto[i] == my[j]) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("���� ���� : " + count);
		
		switch(count) {
		case 6: System.out.println("����� !!  1��");
			break;
		case 5:	System.out.println("����� !!  2��");
			break;
		case 4: System.out.println("����� !!  3��");
			break;
		default : System.out.println("����� !!  ��");
			break;
		}
		
	}

}
