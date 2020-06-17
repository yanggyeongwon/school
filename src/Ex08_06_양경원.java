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
		for(i=0; i<lotto.length; i++) {
			lotto [i] = (int)(Math.random()*45)+1;
			//System.out.print("숫자 "+ (i+1) +": ");
			for(j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*45)+1;
					j = -1;
				} 
			}
			//System.out.println(lotto[i]+ " ");
		}

		for(i=0; i<lotto.length;i++) {

			System.out.print("내 숫자"+(i+1)+" : ");
			my [i] = sc.nextInt();

			for(j=0; j<i; j++) {
				
				if(my[i] == my[j]) {
					System.out.print("중복됨 다시 입력 숫자 "+(i+1)+":");
					my [i] = sc.nextInt();
					j = -1;
					if(my[i] < 1 || my[i] > 45) {
						System.out.println("1~45사이의 수 입력하세요.");
						i--;
						continue;
					}
				}
			}

		}

		System.out.println("----컴퓨터가 발생시킨 번호----");
		for(i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		
		System.out.println();

		System.out.println("----내가 발생시킨 번호----");
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
		System.out.println("맞은 갯수 : " + count);
		
		switch(count) {
		case 6: System.out.println("당신은 !!  1등");
			break;
		case 5:	System.out.println("당신은 !!  2등");
			break;
		case 4: System.out.println("당신은 !!  3등");
			break;
		default : System.out.println("당신은 !!  꽝");
			break;
		}
		
	}

}
