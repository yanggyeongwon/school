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
		
		//�г� ��ü ����
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		
		//��׶��� ��
		p1.setBackground(Color.magenta);
		p2.setBackground(Color.black);
		p3.setBackground(Color.blue);
		p4.setBackground(Color.red);
		
		//��ư ��
		b1 = new Button("��ư1");
		b2 = new Button("��ư2");
		b3 = new Button("��ư3");
		b4 = new Button("��ư4");
		
		//b1�� ��׶��� ��
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
		System.out.println("�׼� �߻�");//�̺�Ʈ �ҽ��� �̺�Ʈ�� �߻��Ǵ� ������Ʈ�� ���Ѵ�
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
		ExPanel ex = new ExPanel("Panel ����");

	}

}
