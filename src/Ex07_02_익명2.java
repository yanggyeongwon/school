	class Parent_pa{
		int x = 2;
		
		public void display() {
			System.out.println("P_x: "+x);
		}
	}
	class Child_c extends Parent_pa{
		public void display() {
			System.out.println("C_x: "+x*x);
		}
	}
	class Car_c2{
		public void drive() {
			System.out.println("�θ��θ�");
		}
	}
public class Ex07_02_�͸�2 {

	public static void main(String[] args) {
		Parent_pa pa = new Parent_pa();
		pa.display();
		
		Child_c c = new Child_c();
		c.x = 5;
		c.display();
		
		Child_c c2 = new Child_c();
		
		c2.display();
		
		new Parent_pa() {
			public void display() {
				System.out.println(x*x*x);
			}
		}.display();
		
		new Car_c2() {
			public void drive() {
				System.out.println("�޶��޶�");
			}
		}.drive();
	}

}

