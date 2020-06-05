import java.text.DecimalFormat;

public class Ex04 {

	public static void main(String[] args) {
		DecimalFormat i = new DecimalFormat("#.##");
		
		int kor,eng,math;
		kor =33;
		eng=44;
		math =55;
		int sum = kor+eng+math;
		double avg = (double)sum/3;
		
		
		System.out.printf("avg = %.2f", avg);
		
	}	

}

