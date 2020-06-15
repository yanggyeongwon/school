	interface Copymachine{//미완성 메소드를 갖음, abstract 자동으로 붙음, 부모가public 자식도 public, 상속은 다중상속 되며 implements로 상속함.
		public void copy();
		int abc = 1;//자동 final 상수
		
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
			System.out.println("복사");
		}

		@Override
		public void fax() {
			System.out.println("팩스");
			
		}

		@Override
		public void print() {
			System.out.println("프린트");
			
		}
	}

public class Ex06_11_인터페이스 {

	public static void main(String[] args) {
		
		final int a = 1;
		//a =3;변경 안됨
		Compound c = new Compound();
		c.copy();
		Printmachine p = new Compound();
		p.print();
		
		Copymachine copy = new Compound();
		copy.copy();
	}

}
