import java.util.Scanner;

public class Ex07_07_�����Է� {

	public static void main(String[] args) {
		double d= Math.random();

		int input = 0;
		int answer = (int)(Math.random() * 100)+1;
		int cut = 0;
		System.out.println(answer);
		do {
			cut++;
			System.out.println("1~100���� �Է��Ͻÿ�");
			Scanner sc = new Scanner(System.in);

			try {
				input =  sc.nextInt();
			} catch (Exception e) {
				//				System.out.println(e.toString());
				//				System.out.println(e.getMessage());
				System.out.println("��ȿ���� ���� �� �ٽ� �õ��Ͻÿ�");
				continue;
			}
			if(answer > input) {
				System.out.println("�� ū�� �Է��Ͻÿ�");

			}else if(answer < input){
				System.out.println("���� ū�� �Է��Ͻÿ�");
			}else {
				System.out.println("�� �Է� Ƚ�� : "+ cut);
				System.out.println("�����Դϴ�.");
				break;
			}

		} while (true);
		System.out.println("���α׷��� �����մϴ�");
	}
}
