import java.util.Scanner;

public class CodingTest22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int tum = a * b * c;		// �Է� ���� ���
		
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};	// 0~9 ���ڸ� ���� �迭 ����, �ʱ�ȭ
		
		for(int i = 0; i < array.length; i++) {		// �迭�� ũ�⸸ŭ �ݺ�
			int count = 0;				// ��ġ�ϴ� ���ڸ� ���� ������ ����
			int sum = tum;			// �Է� ���ڸ� ���� (����)
			
			/* �Է� ���ڸ� �� �ڸ��� �� */
			while(sum != 0) {			
				if(sum%10 == array[i]) {	// �� �ڸ� ������ ��
					count++;					
				}
				sum /= 10;
			}
			System.out.println(count);
		}
		

	}

}
