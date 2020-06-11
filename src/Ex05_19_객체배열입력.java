import java.util.Scanner;

class Man{
	private String name;
	private int age;
	Man(String name,int age){
		this.name = name;
		this.age = age;
	}
	String show() {
		return name +","+ age;
	}
}
public class Ex05_19_객체배열입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
//		System.out.println("이름");
//		name = sc.next();
//		System.out.println("나이");
//		age = sc.nextInt();
//		Man si = new Man(name,age);
//		System.out.println(si.show());
		
		Man m[] = new Man[3];
		
		for(int i=0; i<m.length;i++) {
			System.out.println("이름");
			name = sc.next();
			System.out.println("나이");
			age = sc.nextInt();
			m[i] = new Man(name,age) ;
		}
		
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].show());
		}
	}

}
