import java.util.Scanner;

class Person2{
	String id,pw,name;

	public Person2(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public void show() {
		
	}
}
public class Ex08_03_���� {

	public static void main(String[] args) {

		//		Person2 p1 = new Person2("kim","1234","�迬��");
		//		Person2 p2 = new Person2("park","3456","�ڳ���");
		//		Person2 p3 = new Person2("son","9876","���߱�");

		Person2 p [] = {new Person2("kim","1234","�迬��"),
				new Person2("park","3456","�ڳ���"),
				new Person2("son","9876","���߱�")};


		do {
				Scanner sc = new Scanner(System.in);

				System.out.println("id �Է��ϼ���");
				String Id = sc.next();

				System.out.println("pw �Է��ϼ���");
				String Pw = sc.next();

				if(Id.length() < 3 && Id.length() < 10) {
					System.out.println("3����~8���� �Է��ؾ� �մϴ�.");
				}else {
					if(Id.equals(p[0].id) && Pw.equals(p[0].pw)) {
						System.out.println(p[0].name +" �� �ݰ����ϴ�.");
						System.out.println("��� �Ͻ÷��� y�� �Է��� �ּ���");
						String yes = sc.next();
						String yes_y = yes;
						if(yes_y == "y") {
							System.out.println("y�� ���Ӵ�");
							break;
						}
					}else if(Id.equals(p[1].id) && Pw.equals(p[1].pw)) {
						System.out.println(p[1].name +" �� �ݰ����ϴ�.");
						System.out.println("��� �Ͻ÷��� y�� �Է��� �ּ���");
						String y = sc.next();
						if(y == y) {
							continue;
						}
					}else if(Id.equals(p[2].id) && Pw.equals(p[2].pw)) {
						System.out.println(p[2].name +" �� �ݰ����ϴ�.");
						System.out.println("��� �Ͻ÷��� y�� �Է��� �ּ���");
						String y = sc.next();
						if(y == y) {
							continue;
						}
					}
				}

			




		} while (true);

	}

}
