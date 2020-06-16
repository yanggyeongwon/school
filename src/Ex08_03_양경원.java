import java.util.Scanner;

class Person2{
	String id,pw,name;

	public Person2(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}
public class Ex08_03_양경원 {

	public static void main(String[] args) {

		Person2 p [] = {new Person2("kim","1234","김연아"),
				new Person2("park","3456","박나래"),
				new Person2("son","9876","송중기")};

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("id 입력하세욧");
			String Id = sc.next();
			String y = "y";
			String n = "n";
			if(Id.length() < 3 || Id.length() > 8) {
				System.out.println("3글자~8글자 입력해야 합니다.");

			}else if(!(Id.equals(p[0].id) || Id.equals(p[1].id) || Id.equals(p[2].id))) {
				System.out.println("아디가아니앗");
				System.out.println("계속 하시려면 y를 입력해 주세요");

				String nt = sc.next();
				if(n.equals(nt)) {
					System.out.println("프로그램 종료");
					break;
				}

			}else {
				System.out.println("pw 입력하세욧");
				String Pw = sc.next();
				if(!(Pw.equals(p[0].pw) || Pw.equals(p[1].pw) || Pw.equals(p[2].pw))){
					System.out.println("비밀번호가 아니앗");
					System.out.println("계속 하시려면 y를 입력해 주세요");

					String yes = sc.next();
					String nt = sc.next();
					if(y.equals(yes)) {
						continue;
					}
				}
				if(Id.equals(p[0].id) && Pw.equals(p[0].pw)) {
					System.out.println(p[0].name +" 님 반갑습니다.");
					System.out.println("계속 하시려면 y를 입력해 주세요");

					String yes = sc.next();
					String nt = sc.next();
					if(y.equals(yes)) {
						continue;
					}
				}else if(Id.equals(p[1].id) && Pw.equals(p[1].pw)) {
					System.out.println(p[1].name +" 님 반갑습니다.");
					System.out.println("계속 하시려면 y를 입력해 주세요");

					String yes = sc.next();
					String nt = sc.next();
					if(y.equals(yes)) {
						continue;
					}
				}else if(Id.equals(p[2].id) && Pw.equals(p[2].pw)) {
					System.out.println(p[2].name +" 님 반갑습니다.");
					System.out.println("계속 하시려면 y를 입력해 주세요");

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
