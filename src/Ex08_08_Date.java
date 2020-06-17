import java.text.SimpleDateFormat;
import java.util.*;
public class Ex08_08_Date {

	public static void main(String[] args) {
		
		Date a = new Date();
//		Date a = new Date(120,6,17);
//		Date a = new Date("2020/6/17");
		System.out.println(a);
		System.out.println(a.toString());//참조변수.obj
		System.out.println(a.getMonth());
		System.out.println(a.getDay());//요일정보 일 0 월 1 화 2 수 3
		System.out.println(a.getDate());
		System.out.println(a.getMinutes());
		
		SimpleDateFormat sdf1,sdf2,sdf3;//날짜형식지정
		sdf1 = new SimpleDateFormat("YY-MM-d일 E요일");
		System.out.println(sdf1.format(a));
		sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
		System.out.println(sdf2.format(a));
		sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 h:m:s a");
		System.out.println(sdf3.format(a));
		
	}

}
