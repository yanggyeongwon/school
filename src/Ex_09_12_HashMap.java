import java.util.*;

class Movie{
	private String title;
	private int age;
	Movie(String title,int age){
		this.title = title;
		this.age = age;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return title+ "/"+age;
	}


}
public class Ex_09_12_HashMap {

	public static void main(String[] args) {
		Map<String,Movie> hm = new HashMap<String,Movie>();
		Scanner sc = new Scanner(System.in);
		Movie m1 = new Movie("���",15);
		Movie m2 = new Movie("ħ����",19);
		Movie m3 = new Movie("���̾��",12);

		hm.put(new String("�Ե��ó׸�"), m1);
		hm.put("�������", m2);
		hm.put("�ް��ڽ�", m3);
//      hm.put("�������", m1);
		hm.put("CGV", m1);

		System.out.println(hm.toString());


		System.out.print("��ȭ�� : ");
		String theater = sc.next();
		if(hm.get(theater) == null) {
			System.out.println("�߸��Է��Ͽ����ϴ�");
		}else {
			System.out.println(hm.get(theater));
		}

		Movie m4 = new Movie("�",12);
		hm.replace("�������", m4);
		System.out.println(hm);
		
		hm.remove("CGV");
		System.out.println(hm);
		
		hm.clear();
		System.out.println(hm);
		System.out.println(hm.size());
	}

}
