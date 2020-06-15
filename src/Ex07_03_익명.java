interface RemoteControl{
	public void turnOn();
	public void turnOff();
}
abstract class Tv_t implements RemoteControl{

//	@Override
//	public void turnOn() {
//		System.out.println("tv Å´");
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("tv ²û");
//	}
	
}
public class Ex07_03_ÀÍ¸í {

	public static void main(String[] args) {
//		Tv_t t = new Tv_t();
//		t.turnOn();
//		t.turnOff();
		RemoteControl rc = new RemoteControl(){
			public void turnOn() {
				System.out.println("tv Å´");
			}
			public void turnOff() {
				System.out.println("tv ²û");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}

}
