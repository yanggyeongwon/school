	abstract class Shape{
		
		public void make() {
			System.out.println("���� �׸���");
		}
		
		public abstract void draw();
		
	}
	
	class Circle extends Shape{
//		public Circle(){
//			super();
//		}
		@Override
		public void draw() {
			System.out.println("���׸���");			
		}
		
	}
	
	class Triangle extends Shape{
//		public Triangle(){
//			super();
//		}
		@Override
		public void draw() {
			System.out.println("�ﰢ��");
		}
		
	}
	
public class Ex06_09_�߻�Ŭ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c= new Circle();
		c.make();
		c.draw();
		
		Triangle t= new Triangle();
		t.make();
		t.draw();
	}

}
