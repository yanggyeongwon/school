	class Robot{
		
	}
	class DanceRobot extends Robot{
		public void dance() {
			System.out.println("���� ��ϴ�.");
		}
	}
	class SingRobot extends Robot{
		public void sing() {
			System.out.println("�뷡�� �մϴ�.");
		}
	}
	
	class DrawRobot extends Robot{
		public void draw() {
			System.out.println("�׸��� �׸��ϴ�.");
		}
	}

public class Ex06_08_������ {
	
	static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot da = new DanceRobot();
			da.dance();
		}else if(r instanceof SingRobot) {
			SingRobot ri = new SingRobot();
			ri.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot dr = new DrawRobot();
			dr.draw();
		}
		
		
	}
	public static void main(String[] args) {
//		Robot ro = null;
//		DanceRobot da = new DanceRobot();
//		ro = da;
//		
//		ro.dance();
//		
//		SingRobot ri = new SingRobot();
//		ri.sing();
//		
//		DrawRobot dr = new DrawRobot();
//		dr.draw();
		
//		Robot da = new DanceRobot();
//		Robot sr = new SingRobot();
//		Robot dr = new DrawRobot();
		
		Robot [] arr1 = {new DanceRobot(),new SingRobot(),new DrawRobot()};
		
		for(int i=0; i<arr1.length;i++) {
			action(arr1[i]);
		}
	}

}
