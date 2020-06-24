import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


class ItemEventEx extends Frame implements ItemListener{
	
	Choice ch = new Choice();
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Label lb = new Label("꽃을 선택하세요");
	Label result = new Label("    ");
	
	ItemEventEx(){
		super.setSize(400,300);
		setVisible(true);
//		lb.setBackground(Color.red);
		
		p1.setBackground(Color.yellow);//setLayout(new BorderLayout()) 동서남북
		p2.setBackground(Color.blue);
		p3.setBackground(Color.red);
		
		String flower [] = {"진달래","장미","국화","벚꽃","개나리"};
		
		for(int i=0; i< flower.length; i++) {
			ch.add(flower[i]);
		}
		
		ch.addItemListener(this);//itemStateChanged()
		p1.add(lb);
		p2.add(ch);
		p3.add(result);
		
		super.add(p1,"North");
		add(p2,"Center");
		add(p3,"South");	
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.print(ch.getSelectedIndex()+1+":");
		System.out.println(ch.getSelectedItem());
		result.setText(ch.getSelectedItem());
		
	}
}
public class Ex12_03_ItemEvent {

	public static void main(String[] args) {
		ItemEventEx ie = new ItemEventEx();
		
	}

}
