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
public class Ex08_03_양경원 {

	public static void main(String[] args) {

		//		Person2 p1 = new Person2("kim","1234","김연아");
		//		Person2 p2 = new Person2("park","3456","박나래");
		//		Person2 p3 = new Person2("son","9876","송중기");

		Person2 p [] = {new Person2("kim","1234","김연아"),
				new Person2("park","3456","박나래"),
				new Person2("son","9876","송중기")};


		do {
				Scanner sc = new Scanner(System.in);

				System.out.println("id 입력하세욧");
				String Id = sc.next();

				System.out.println("pw 입력하세욧");
				String Pw = sc.next();

				if(Id.length() < 3 && Id.length() < 10) {
					System.out.println("3글자~8글자 입력해야 합니다.");
				}else {
					if(Id.equals(p[0].id) && Pw.equals(p[0].pw)) {
						System.out.println(p[0].name +" 님 반갑습니다.");
						System.out.println("계속 하시려면 y를 입력해 주세요");
						String yes = sc.next();
						String yes_y = yes;
						if(yes_y == "y") {
							System.out.println("y가 들어왓다");
							break;
						}
					}else if(Id.equals(p[1].id) && Pw.equals(p[1].pw)) {
						System.out.println(p[1].name +" 님 반갑습니다.");
						System.out.println("계속 하시려면 y를 입력해 주세요");
						String y = sc.next();
						if(y == y) {
							continue;
						}
					}else if(Id.equals(p[2].id) && Pw.equals(p[2].pw)) {
						System.out.println(p[2].name +" 님 반갑습니다.");
						System.out.println("계속 하시려면 y를 입력해 주세요");
						String y = sc.next();
						if(y == y) {
							continue;
						}
					}
				}

			




		} while (true);

	}

}
