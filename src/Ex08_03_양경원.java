import java.util.Scanner;

class Person2{
	String id,pw,name;

	public Person2(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}
public class Ex08_03_���� {

	public static void main(String[] args) {

		Person2 p [] = {new Person2("kim","1234","�迬��"),
				new Person2("park","3456","�ڳ���"),
				new Person2("son","9876","���߱�")};

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("id �Է��ϼ���");
			String Id = sc.next();
			String y = "y";
			String n = "n";
			if(Id.length() < 3 || Id.length() > 8) {
				System.out.println("3����~8���� �Է��ؾ� �մϴ�.");

			}else if(!(Id.equals(p[0].id) || Id.equals(p[1].id) || Id.equals(p[2].id))) {
				System.out.println("�Ƶ𰡾ƴϾ�");
				System.out.println("��� �Ͻ÷��� y�� �Է��� �ּ���");

				String nt = sc.next();
				if(n.equals(nt)) {
					System.out.println("���α׷� ����");
					break;
				}

			}else {
				System.out.println("pw �Է��ϼ���");
				String Pw = sc.next();
				if(!(Pw.equals(p[0].pw) || Pw.equals(p[1].pw) || Pw.equals(p[2].pw))){
					System.out.println("��й�ȣ�� �ƴϾ�");
					System.out.println("��� �Ͻ÷��� y�� �Է��� �ּ���");

					String yes = sc.next();
					String nt = sc.next();
					if(y.equals(yes)) {
						continue;
					}
				}
				if(Id.equals(p[0].id) && Pw.equals(p[0].pw)) {
					System.out.println(p[0].name +" �� �ݰ����ϴ�.");
					System.out.println("��� �Ͻ÷��� y�� �Է��� �ּ���");

					String yes = sc.next();
					String nt = sc.next();
					if(y.equals(yes)) {
						continue;
					}
				}else if(Id.equals(p[1].id) && Pw.equals(p[1].pw)) {
					System.out.println(p[1].name +" �� �ݰ����ϴ�.");
					System.out.println("��� �Ͻ÷��� y�� �Է��� �ּ���");

					String yes = sc.next();
					String nt = sc.next();
					if(y.equals(yes)) {
						continue;
					}
				}else if(Id.equals(p[2].id) && Pw.equals(p[2].pw)) {
					System.out.println(p[2].name +" �� �ݰ����ϴ�.");
					System.out.println("��� �Ͻ÷��� y�� �Է��� �ּ���");

					String yes = sc.next();
					String nt = sc.next();
					if(y.equals(yes)) {
						continue;
					}
				}
			}

		} while (true);

	}

}
