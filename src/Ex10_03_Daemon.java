class DaemonTest extends Thread{

	public void run() {
		while(true) {
			try {
				sleep(3050);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
			if(Ex10_03_Daemon.autoSave == true) {
				autoSave();	
			}
		}	
	}
	public void autoSave() {
		System.out.println("작업 화일이 자동 저장되었습니다.");
	}

}
public class Ex10_03_Daemon {

	static boolean autoSave = false;

	public static void main(String[] args) {

		DaemonTest t =new DaemonTest();
		t.setDaemon(true);
		t.start();

		for(int i=0; i<=20;i++) {
			System.out.println("\t"+i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(i%3 == 0){
				autoSave = true;
			}
		}
		System.out.println("프로그램 종료");
	}

}
