import java.util.Calendar;

public class Ex08_09_Calendar {

	public static void main(String[] args) {
//		Calendar c = new Calendar();protected ��� x ������Ű�� �� ���/ �ٸ���Ű�� �ڽĸ� ���
		Calendar c = Calendar.getInstance();
		System.out.print("���ó�¥ : "+c.get(Calendar.YEAR)+"�� ");
		System.out.print(c.get(Calendar.MONTH)+1+"��");//0���� ����
		System.out.print(c.get(Calendar.DATE)+"�� ");
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK)+"����");//1���� ����
		
		String week [] = {"","��","��","ȭ","��","��","��","��"};
		
		System.out.println(week[c.get(Calendar.DAY_OF_WEEK)]+"����");
	}

}
