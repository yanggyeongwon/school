	class Parent{
		int x=10;
		public void method() {
			System.out.println("p_x:"+x);
		}
	}
	class child extends Parent{
		int x=20;
		public void method() {
			int x=30;
			super.method();
			System.out.println("x:"+x);
			System.out.println("this.x:"+this.x);
			System.out.println("super.x:"+super.x);
			super.method();
		}
	}

public class Ex06_05_super {

	public static void main(String[] args) {
//		Parent pa = new Parent();
//		pa.method();
		child ch = new child();
		ch.method();

	}

}
