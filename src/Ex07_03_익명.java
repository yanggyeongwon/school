interface RemoteControl{
	public void turnOn();
	public void turnOff();
}
abstract class Tv_t implements RemoteControl{

//	@Override
//	public void turnOn() {
//		System.out.println("tv Ŵ");
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("tv ��");
//	}
	
}
public class Ex07_03_�͸� {

	public static void main(String[] args) {
//		Tv_t t = new Tv_t();
//		t.turnOn();
//		t.turnOff();
		RemoteControl rc = new RemoteControl(){
			public void turnOn() {
				System.out.println("tv Ŵ");
			}
			public void turnOff() {
				System.out.println("tv ��");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}

}
