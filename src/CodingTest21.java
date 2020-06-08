import java.util.Scanner;

public class CodingTest21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int arr[] = new int[9];
		
		int max = 0;
		int index = 0;
		for(int i =0; i< arr.length;i++) {
			t = sc.nextInt();
		}
		
		for(int i = 0; i< arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);

	}

}
