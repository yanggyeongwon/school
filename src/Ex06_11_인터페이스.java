	interface Copymachine{//�̿ϼ� �޼ҵ带 ����, abstract �ڵ����� ����, �θ�public �ڽĵ� public, ����� ���߻�� �Ǹ� implements�� �����.
		public void copy();
		int abc = 1;//�ڵ� final ���
		
	}
	interface Printmachine{
		public void print();
		
	}
	interface Faxmachine{
		public void fax();
		
	}
	
	class Ex{
		
	}
	class Compound extends Ex implements Copymachine,Printmachine,Faxmachine{
		public void copy() {
			System.out.println("����");
		}

		@Override
		public void fax() {  
			System.out.println("�ѽ�");
			
		}

		@Override
		public void print() {
			System.out.println("����Ʈ");
			
		}
	}

public class Ex06_11_�������̽� {

	public static void main(String[] args) {
		
		final int a = 1;
		//a =3;���� �ȵ�
		Compound c = new Compound();
		c.copy();
		
		Printmachine p = new Compound();
		p.print();
		
		Copymachine copy = new Compound();
		copy.copy();
	}

}
