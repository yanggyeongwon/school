import java.util.*;
class Person_b{
	String id;
	String pw;
	
	public Person_b(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String toString() {
		return id+"/"+pw;
	}

}
public class Ex09_04_ArrayList {

	public static void main(String[] args) {
		
//		Person_b p1 = new Person_b("kim","1234");
//		Person_b p2 = new Person_b("park","5678");
//		Person_b p3 = new Person_b("choi","9999");
		Person_b p1[]= {new Person_b("kim","1234"),
						new Person_b("park","5678"),
						new Person_b("choi","9999")};
		
		ArrayList<Person_b> list = new ArrayList<Person_b>();
		for(int i=0; i<p1.length;i++) {
			list.add(p1[i]);
		}
		
//		list.add(p1);// -> true
//		list.add(p2);
//		list.add(new Person_b("choi","9999"));
		
//		System.out.println(list.get(0).id+","+list.get(0).pw);
//		System.out.println(list.get(0).pw);
		System.out.println(list.toString());
//		System.out.println(list.get(1));
		Person_b one = list.get(1);
		System.out.println("one: "+ one);
		System.out.println("one: "+ one.toString());
		System.out.println(list.get(1));
		
		for(int i=0; i<p1.length;i++) {
			System.out.println(list.get(i));
		}
		
	}

}


