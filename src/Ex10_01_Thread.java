class All {
	
}

class Big extends Thread  {
	public void run() {
		//if (target != null) {
		//        target.run();
		//}
		System.out.println("big()");
		for(char i='A'; i<'Z';i++) {// Thread.interrupt() ��� ��� ���ͷ�Ʈ
			System.out.print(i);
			try {
				sleep(1000,1000);
			} catch (InterruptedException ex) {
				// ������ �׽��� �ڵ峪 �峭�� �ڵ尡 �ƴ϶�� �̷��� ���� ����!
				// InterruptedException�� ������ ó���Ǿ�� �Ѵ�.
			}

		}
		System.out.println();
	}
}
class Small implements Runnable{
	public void run() {
		
		for(char i='a'; i<'z';i++) {// Thread.interrupt() ��� ��� ���ͷ�Ʈ
			System.out.print(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException ex) {
				// ������ �׽��� �ڵ峪 �峭�� �ڵ尡 �ƴ϶�� �̷��� ���� ����!
				// InterruptedException�� ������ ó���Ǿ�� �Ѵ�.
			}
		}
		System.out.println();
	}
}

public class Ex10_01_Thread {

	public static void main(String[] args) {
		System.out.println("���α׷�����");
		Big b = new Big();
		
		b.start();
		
		Small c = new Small();
		Thread th = new Thread(c);
		th.start();
		
		System.out.println("���α׷�����");

		

	}

}
