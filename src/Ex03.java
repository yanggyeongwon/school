import java.util.Scanner;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
//		-----------------------------과제
//		for(int i=5; i>0; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
//		----------------------------과제
		
//		for(int i=2; i<10; i++) {
//			if(i%2==1) {
//				continue;
//			}
//			for(int j=1; j<10; j++) {
//				if(j>i) break;
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
//		----------------------------
//		int i = 1;
//		while(i<=5) {
//			System.out.println(i);
//			i++;
//		}
//		---------------------------------
//		Scanner sc = new Scanner(System.in);
//		int num ;
//		int sum =0;
//		while(true) {
//			System.out.println("숫자입력 : ");
//			num = sc.nextInt();
//
//			if(num < 0) 
//				break;
//			sum += num;
//		}
//		System.out.println(sum);
//		-----------------------------------
		
//		int [] arr = {1,2,3 };
//		
//		for(int i =0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		
//		int [] arr2 = new int [] {1,2,3,4,5};
//		
//		
//		for(int j=0; j<arr2.length;j++) {
//			System.out.println(arr2[j]);
//		}
		
//		int [] arr3 = new int[10];
//		for(int a=0; a<arr3.length;a++) {
//			System.out.println(arr3[a]);
//		}
		
//		double [] arr4 = {1.1,2.2,3.3};
//		
//		for(int i=0;i<arr4.length;i++) 
//			System.out.println(arr4[i]);
//		--------------------------------------------
//		int [] score = {79,88,91,33,100,55,95};
//		int sum = 0;
//		
//		for(int i =0; i < score.length ; i++) {
//			Arrays.sort(score);
//			sum += score[i];
//			System.out.println(score[i]);
//		}
//		System.out.println(score[0]);
//		System.out.println(score[6]);
//		System.out.println(sum/score.length);
//		------------------------------------
//		int [] score = {79,88,91,33,100,55,95};
//		int sum = 0,max,min;
//		
//		max = score[0];
//		min = score[0];
//		for(int i = 1; i<score.length;i++) {
//			if(max<score[i]) {
//				max = score[i];
//			}else if(min>score[i]){
//				min = score[i];
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);
		
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		int sum [] = new int[5];
//		
//		for(int i = 0; i<sum.length;i++) {
//			sum[i] = sc.nextInt();
//		}
//		for(int i = 0; i<sum.length;i++) {
//			System.out.println(sum[i]);
//		}
		
		//int a [] = {1,2,3};
		//int score [][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//		int score [][] = new int[4][3];
		int score [][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int i,j;
		for(i=0; i<4;i++) {
			for(j=0; j<=2; j++) {
				System.out.print(score[i][j]);
			}
			System.out.println();
		}

	}
}