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
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력한 값은 :"+input+"입니다");
	}

}
public class Ex10_02_Thread {

	
	public static void main(String[] args) {
		//String input = JOptionPane.showInputDialog("아무값이나 입력하세요");//입력창
		//System.out.println("입력한 값은 :"+input+"입니다");
		NumberPrint c = new NumberPrint();
		c.start();
		
		c.exit();
		System.out.println("main 끝");
		
		

		



	}

}
