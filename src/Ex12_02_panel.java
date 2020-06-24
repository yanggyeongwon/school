import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ExPanel extends Frame implements ActionListener{
	Button b1,b2,b3,b4;
	ExPanel(String title){
		
		super(title);
		super.setSize(400,300);
//		super.setResizable(false);
		super.setVisible(true);
		
		
		super.setLayout(new FlowLayout());
		
		//패널 객체 생성
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		
		//백그라운드 색
		p1.setBackground(Color.magenta);
		p2.setBackground(Color.black);
		p3.setBackground(Color.blue);
		p4.setBackground(Color.red);
		
		//버튼 색
		b1 = new Button("버튼1");
		b2 = new Button("버튼2");
		b3 = new Button("버튼3");
		b4 = new Button("버튼4");
		
		//b1의 백그라운드 색
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		b1.setBackground(Color.yellow);
		
		p1.add(b1);
		p2.add(b2);
		p3.add(b3);
		
		super.add(p1,"North");
		super.add(p2,"South");
		super.add(p3,"Center");
		super.add(b4);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("액션 발생");//이벤트 소스는 이벤트가 발생되는 컴포넌트를 말한다
		Object obj = e.getSource();

		if(obj == b1) {
			super.setBackground(Color.cyan);
		}else if(obj == b2) {
			super.setBackground(Color.orange);
		}else if(obj == b3){
			super.setBackground(Color.magenta);
		}else {
			super.setBackground(Color.blue);
		}
		
	}
}
public class Ex12_02_panel {

	public static void main(String[] args) {
		ExPanel ex = new ExPanel("Panel 예제");

	}

}
