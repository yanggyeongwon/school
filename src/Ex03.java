
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
		
		for(int i=2; i<10; i++) {
			if(i%2==1) {
				continue;
			}
			for(int j=1; j<10; j++) {
				if(j>i) break;
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
