	abstract class Shape{
		
		public void make() {
			System.out.println("도형 그리기");
		}
		
		public abstract void draw();
		
	}
	
	class Circle extends Shape{
//		public Circle(){
//			super();
//		}
		@Override
		public void draw() {
			System.out.println("원그리기");			
		}
		
	}
	
	class Triangle extends Shape{
//		public Triangle(){
//			super();
//		}
		@Override
		public void draw() {
			System.out.println("삼각형");
		}
		
	}
	
public class Ex06_09_추상클래스 {

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
