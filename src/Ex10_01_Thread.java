class All {
	
}

class Big extends Thread  {
	public void run() {
		//if (target != null) {
		//        target.run();
		//}
		System.out.println("big()");
		for(char i='A'; i<'Z';i++) {// Thread.interrupt() 어떠한 대상 인터럽트
			System.out.print(i);
			try {
				sleep(1000,1000);
			} catch (InterruptedException ex) {
				// 간단한 테스팅 코드나 장난감 코드가 아니라면 이렇게 하지 말자!
				// InterruptedException은 적절히 처리되어야 한다.
			}

		}
		System.out.println();
	}
}
class Small implements Runnable{
	public void run() {
		
		for(char i='a'; i<'z';i++) {// Thread.interrupt() 어떠한 대상 인터럽트
			System.out.print(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException ex) {
				// 간단한 테스팅 코드나 장난감 코드가 아니라면 이렇게 하지 말자!
				// InterruptedException은 적절히 처리되어야 한다.
			}
		}
		System.out.println();
	}
}

public class Ex10_01_Thread {

	public static void main(String[] args) {
		System.out.println("프로그램시작");
		Big b = new Big();
		
		b.start();
		
		Small c = new Small();
		Thread th = new Thread(c);
		th.start();
		
		System.out.println("프로그램종료");

		

	}

}
