	

	class Pay{
		static String name;
		int bonbong,tax,silsu;//����//�Ǽ��ɾ�/����
		
		void setTax() {
			if(bonbong>=3000000) {
				tax = (int)(bonbong * 0.3);
				
			}else if(bonbong>=2000000) {
				tax = (int)(bonbong * 0.2);
				
			}else {
				tax = (int)(bonbong * 0.1);
			}
		}
//		//���ݰ��
//		int rd1(int a, int b) {
//			if(a > b) {
//				return (int)(a*0.03);
//				
//			}
//			else if(a != b){
//				return (int)(a*0.02);
//			}
//			else if(a >= b) {
//				return (int)(a*0.01);
//			}
//			return 0;
//		}
////			
////			if(a > b) {//300>100
////				return (int)(a*0.03);
////			}
////			if(a < b){//200!=300
////				return (int)(a*0.02);
////			}
////			if(a >= b) {//100>=100
////				return (int)(a*0.01);
////			}
////			return 0;
////			
////			for(int i=0; i<4;i++) {
////				if(a > b) {
////					return (int)(a*0.03);
////				}
////				if(a < b) {
////					
////					return (int)(a*0.02);
////				}
////				if(a != b) {
////					return 0;
////				}
////			}
////			return (int)(a*0.01);
////		}
////		
//		//�Ǽ��ɾ� ���
//		static int rd2(int a, int b){
//			
//			return a-b;
//		}
//		//������� 4�� ����ϴ� �޼ҵ�
//		static void rd3() {
//			System.out.println(Pay.name);
//		}
//
//	}	
	}

public class Ex05_06_���� {
	
	
	public static void main(String[] args) {
		
		Pay P1 = new Pay();
		Pay P2 = new Pay();
		Pay P3 = new Pay();
		
//		P1.rd1 = 3000000;
//		int sum = P1.rd1(P1.rd1, P3.rd1);
//		P1.rd2 = sum;
//		P1.rd3 = Pay.rd2(P1.rd1,P1.rd2);
//		
//		P2.rd1 = 2000000;
//		int sum1 = P2.rd1(P2.rd1, P1.rd1);
//		P2.rd2 = sum1;
//		P2.rd3 = Pay.rd2(P2.rd1,P2.rd2);
//		
//		
//		P3.rd1 = 1000000;
//		int sum2 = P3.rd1(P3.rd1, P3.rd1);
//		P3.rd2 = sum2;
//		P3.rd3 = Pay.rd2(P3.rd1,P3.rd2);
//		
//		Pay.name = "������";
//		P1.rd3();
//		System.out.println("���� : "+P1.rd1);
//		System.out.println("���� : "+sum);
//		System.out.println("�Ǽ��ɾ� : "+P1.rd3);
//		System.out.println("---------------");
//		
//		Pay.name = "�ҽ���";
//		P1.rd3();
//		System.out.println("���� : "+P2.rd1);
//		System.out.println("���� : "+sum1);
//		System.out.println("�Ǽ��ɾ� : "+P2.rd3);
//		System.out.println("---------------");
//		
//		
//		Pay.name = "���ڹ�";
//		P1.rd3();
//		System.out.println("���� : "+P3.rd1);
//		System.out.println("���� : "+sum2);
//		System.out.println("�Ǽ��ɾ� : "+P3.rd3);
//		System.out.println("---------------");
//		
	}
}
