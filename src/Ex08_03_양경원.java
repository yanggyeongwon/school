import java.util.Scanner;

class Person2{
	private String id,pw,name;

	public Person2(String id, String pw, String name){
		this.setId(id);
		this.setPw(pw);
		this.setName(name);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
				

			}else if(!(Id.equals(p[0].getId()) || Id.equals(p[1].getId()) || Id.equals(p[2].getId()))) {
				System.out.println("�Ƶ𰡾ƴϾ�");
				System.out.println("��� �Ұų�? y/n");

				String nt = sc.next();
				if(n.equals(nt)) {
					System.out.println("���α׷� ����");
					break;
				}

			}else {
				System.out.println("pw �Է��ϼ���");
				String Pw = sc.next();
				if(!(Pw.equals(p[0].getPw()) || Pw.equals(p[1].getPw()) || Pw.equals(p[2].getPw()))){
					System.out.println("��й�ȣ�� �ƴϾ�");
					System.out.println("��� �Ұų�? y/n");

					String yes = sc.next();

					if(y.equals(yes)==true) {//retry.equalsIgnoreCase
						continue;
					}else {
						System.out.println("���α׷� ����");
						break;
					}
				}
				for(int i= 0; i<p.length;i++) {
					if(Id.equals(p[i].getId()) && Pw.equals(p[i].getPw())) {
						System.out.println(p[i].getName() +" �� �ݰ����ϴ�.");
						System.out.println("��� �Ұų�? y/n");

						String yes = sc.next();

						if(y.equals(yes)==true) {
							continue;
						}else {
							System.out.println("���α׷� ����");
							break;
						}
					}
					continue;
				}
				
			}

		} while (true);

	}

}
