	

	class Pay{
		static String name;
		int rd1,rd2,rd3;//����//�Ǽ��ɾ�/����
		
		//���ݰ��
		int rd1(int a, int b) {
			if(a > b) {
				return (int)(a*0.03);
			}
			else if(a != b){
				a = rd1;
				return (int)(a*0.02);
			}
			else if(a >= b) {
				a = rd1;
				return (int)(a*0.01);
			}
			return 0;
		}
		
		//�Ǽ��ɾ� ���
		static int rd2(int a, int b){
			
			return a-b;
		}
		//������� 4�� ����ϴ� �޼ҵ�
	}	

public class Ex05_06_���� {
	
	static void rd3() {
		System.out.println(Pay.name);
	}

	public static void main(String[] args) {
		
		Pay P1 = new Pay();
		Pay P2 = new Pay();
		Pay P3 = new Pay();
		
		P1.rd1 = 3000000;
		int sum = P1.rd1(P1.rd1, P3.rd1);
		P1.rd2 = sum;
		P1.rd3 = Pay.rd2(P1.rd1,P1.rd2);
		
		P2.rd1 = 2000000;
		int sum1 = P2.rd1(P2.rd1, P1.rd1);
		P2.rd2 = sum1;
		P2.rd3 = Pay.rd2(P2.rd1,P2.rd2);
		
		
		P3.rd1 = 1000000;
		int sum2 = P3.rd1(P3.rd1, P3.rd1);
		P3.rd2 = sum2;
		P3.rd3 = Pay.rd2(P3.rd1,P3.rd2);
		
		Pay.name = "������";
		rd3();
		System.out.println("���� : "+sum);
		System.out.println("�Ǽ��ɾ� : "+P1.rd3);
		System.out.println("---------------");
		
		Pay.name = "�ҽ���";
		rd3();
		System.out.println("���� : "+sum1);
		System.out.println("�Ǽ��ɾ� : "+P2.rd3);
		System.out.println("---------------");
		
		
		Pay.name = "���ڹ�";
		rd3();
		System.out.println("���� : "+sum2);
		System.out.println("�Ǽ��ɾ� : "+P3.rd3);
		System.out.println("---------------");
		
	}

	


}
