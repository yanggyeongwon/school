import javax.swing.JOptionPane;

class NumberPrint extends Thread{
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ex) {

			}
		}
	}
	public void exit() {
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��� ���� :"+input+"�Դϴ�");
	}

}
public class Ex10_02_Thread {

	
	public static void main(String[] args) {
		//String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");//�Է�â
		//System.out.println("�Է��� ���� :"+input+"�Դϴ�");
		NumberPrint c = new NumberPrint();
		c.start();
		
		c.exit();
		System.out.println("main ��");
		
		

		



	}

}
