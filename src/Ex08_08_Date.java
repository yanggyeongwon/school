import java.text.SimpleDateFormat;
import java.util.*;
public class Ex08_08_Date {

	public static void main(String[] args) {
		
		Date a = new Date();
//		Date a = new Date(120,6,17);
//		Date a = new Date("2020/6/17");
		System.out.println(a);
		System.out.println(a.toString());//��������.obj
		System.out.println(a.getMonth());
		System.out.println(a.getDay());//�������� �� 0 �� 1 ȭ 2 �� 3
		System.out.println(a.getDate());
		System.out.println(a.getMinutes());
		
		SimpleDateFormat sdf1,sdf2,sdf3;//��¥��������
		sdf1 = new SimpleDateFormat("YY-MM-d�� E����");
		System.out.println(sdf1.format(a));
		sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
		System.out.println(sdf2.format(a));
		sdf3 = new SimpleDateFormat("yyyy�� MM�� dd�� h:m: s a");
		System.out.println(sdf3.format(a));
		
	}

}
