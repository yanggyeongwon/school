package CodingTest;

import java.util.Scanner;

public class reTest{
	public static void onAction() throws Exception{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=0; i<10 ; i++) {
			try {
				if(i!=6) {
					System.out.println(i+"�� 6�� �ƴմϴ�");
				}else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println(i + "�� 6�� �³׿�");
				throw e;
			}
		}
	}
	public static void main(String [] args) {
		try {
			onAction();
		} catch (Exception e) {
			System.out.println("onAction���� 6�� �߰�");
		}finally {
			System.out.println("try-catch�� ���� finally");
		}
	}
}