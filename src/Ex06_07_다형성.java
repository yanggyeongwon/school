	class Car{
		String color = "white";
		int door = 4;
		 public void drive() {
			 System.out.println("Cardrive");
		 }
		 public void stop() {
			 System.out.println("stop");
		 }
	}
	
	class FireEngine extends Car{
		int door =6;
		int wheel = 10;
		public void drive() {
			System.out.println("FEdrive");
		}
		public void water() {
			System.out.println("water!");
		}
	}

public class Ex06_07_������ {

	public static void main(String[] args) {
		Car ca = null;
		
		FireEngine fi = new FireEngine();
		FireEngine fi2 = null;
		
		fi.water();
		ca = fi;//��ĳ����
		System.out.println("ca.door  : "+ ca.door);
//		System.out.println("ca.wheel : "+ ca.wheel);
		System.out.println("ca.color : "+ ca.color);
		System.out.println("fi.door  : "+ fi.door);
		System.out.println("fi.wheel : "+ fi.wheel);
		System.out.println("fi.color : "+ fi.color);
		
		ca.drive();
		ca.drive();
		
		if(ca instanceof FireEngine) {
			System.out.println("����");
			fi2 = (FireEngine)ca;//�ٿ�ĳ����
		}else {
			System.out.println("�Ұ���");
		}

		
		fi2.water();
		fi2.drive();
		
	}

}
