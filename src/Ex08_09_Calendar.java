import java.util.Calendar;

public class Ex08_09_Calendar {

	public static void main(String[] args) {
//		Calendar c = new Calendar();protected 사용 x 같은패키지 다 사용/ 다른패키지 자식만 사용
		Calendar c = Calendar.getInstance();
		System.out.print("오늘날짜 : "+c.get(Calendar.YEAR)+"년 ");
		System.out.print(c.get(Calendar.MONTH)+1+"월");//0부터 시작
		System.out.print(c.get(Calendar.DATE)+"일 ");
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK)+"요일");//1부터 시작
		
		String week [] = {"","일","월","화","수","목","금","토"};
		
		System.out.println(week[c.get(Calendar.DAY_OF_WEEK)]+"요일");
	}

}
