package CodingTest;

import java.util.Scanner;

public class reTest{
	public static void onAction() throws Exception{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=0; i<10 ; i++) {
			try {
				if(i!=6) {
					System.out.println(i+"는 6이 아닙니다");
				}else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println(i + "는 6이 맞네여");
				throw e;
			}
		}
	}
	public static void main(String [] args) {
		try {
			onAction();
		} catch (Exception e) {
			System.out.println("onAction에서 6을 발견");
		}finally {
			System.out.println("try-catch문 종료 finally");
		}
	}
}