
public class Ex03 {

	public static void main(String[] args) {
//		 int i = 1;
//		 switch (i) {
//		 	case 1:
//		 		System.out.println("A");
//		 		break;
//
//		 	default:
//		 		System.out.println("default");
//		}
		
//		int i = 11;
//		int j = (i%2==0) ? 0 : 1;
//		
//		System.out.println("j�� �� : "+j);	
//		
//		if(j != 0) {
//			
//			System.out.println("Ȧ");
//			System.out.println("if���� ture�϶� "+j);	
//		}else {
//			System.out.println("¦");
//			System.out.println("if���� false�϶� "+j);	
//		}
//		
//		switch (j) {
//		case 1:
//			System.out.println("Ȧ");	
//			System.out.println("case 1: "+j);	
//			break;
//
//		default:
//			System.out.println("¦");
//			System.out.println("default :"+j);	
//		}
		
		int Q = 50;
		int W = 40;
		int E = 30;
		int R = 50;
		//int sum = ((Q+W+E+R)/4)>40 ? 1 : 2;
		int sum = Q+W+E+R;
		
		System.out.println(sum);
		
		switch (sum/4) {
		case 40:
			System.out.println("40����̻�");
			break;
		case 42:
			System.out.println("42�̻�");
			break;
		default: 
			System.out.println("40�������");
		}
	}

}
