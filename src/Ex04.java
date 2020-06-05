import java.text.DecimalFormat;

public class Ex04 {

	public static void main(String[] args) {
		
		int sum1 = 0;
		for(int j = 1; j<=100; j++) {
			sum1 = sum1+j;
			if((j%10) == 0) {
				System.out.println(sum1);
				sum1 = 0;
			}
		}
		
	}	

}
//1-10 /55
//11~20
//91~100 /5050
