import java.util.Scanner;

public class Ex04_07_���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score[] = null;
		int N,stu,num,tmp;
		int sum = 0;
		int i,j=0;
		int max=0;
		int min=0;

		
		while(true) {
			num = sc.nextInt();
			
			
			
			if(num == 1) {
				System.out.println("�л����Է� : ");
				
				stu = sc.nextInt();
				score = new int[stu];
				
			}else if(num == 2) {
				System.out.println("�����Է� : ");
				if(score == null) {
					System.out.println("1�� �л��� ���� �Է��Ͻÿ�");
					continue;
				}
				for(i=0; i<score.length;i++) {
					System.out.print(i+1+"�� �л� ���� : ");
					score[i] = sc.nextInt();	
				}
			}else if(num == 3) {
				System.out.println("�������");
				for(i=0; i<score.length;i++) {
					System.out.println(i+1+"�� �л� ���� : "+score[i]);
				}
				
			}
			else if(num == 4) {
				System.out.println("�м�");
				//����,���,�ִ밪,�ּҰ�, ����
				for(i=0; i<score.length;i++) {
					sum += score[i];
				}
				
				max = score[0];
				min = score[0];
				for(i = 1; i<score.length;i++) {
					if(max<score[i]) {
						max = score[i];
					}
					if(min>score[i]){
						min = score[i];
					}
				}
				int sumf = sum/score.length;
				System.out.println("���� : " +sum);
				System.out.printf("��� : %.2f\n" ,(float)sumf);
				System.out.println("�ִ밪 : " +max);
				System.out.println("�ּڰ� : " +min);
				
				for(i = 0; i<score.length-1 ; i++) {
					for(j = i+1 ; j<score.length ; j++) {
						if(score[i] > score[j]) {
							
							tmp = score[j];
							score[j]= score[i];
							score[i] = tmp;
							
						}
					}
				}
				for(i=0; i<score.length;i++) {
					System.out.print(score[i]);
				}
			}
			else if(num == 5) {
				System.out.println("������");
				break;
			}
			else {
				System.out.println("�ٸ���ȣ �Է�");
			}
			
		}
		System.out.println("����");

	}

}
