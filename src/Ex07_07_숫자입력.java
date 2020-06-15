import java.util.Scanner;

public class Ex07_07_숫자입력 {

	public static void main(String[] args) {
		double d= Math.random();

		int input = 0;
		int answer = (int)(Math.random() * 100)+1;
		int cut = 0;
		System.out.println(answer);
		do {
			cut++;
			System.out.println("1~100까지 입력하시오");
			Scanner sc = new Scanner(System.in);

			try {
				input =  sc.nextInt();
			} catch (Exception e) {
				//				System.out.println(e.toString());
				//				System.out.println(e.getMessage());
				System.out.println("유효하지 않은 값 다시 시도하시오");
				continue;
			}
			if(answer > input) {
				System.out.println("더 큰수 입력하시오");

			}else if(answer < input){
				System.out.println("작은 큰수 입력하시오");
			}else {
				System.out.println("총 입력 횟수 : "+ cut);
				System.out.println("정답입니다.");
				break;
			}

		} while (true);
		System.out.println("프로그램을 종료합니다");
	}
}
