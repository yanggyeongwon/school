class Person{
	private String name;
	private int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void display(){
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}
}
class Student extends Person{
	int kor,eng;
	public Student(String n, int a, int k, int e) {
		super(n,a);
		this.kor = k;
		this.eng = e;
	}
	public void display() {
		super.display();
		System.out.println("kor = "+ kor);
		System.out.println("eng = "+ eng);
		
	};
}
class Employee extends Person{
	String company,part;
	public Employee(String n,int a, String c, String p) {
		super(n,a);
		this.company = c;
		this.part = p;
	}
	public void display() {
		super.display();
		System.out.println("company = "+ company);
		System.out.println("part = "+ part);
	};
}
class Teacher extends Employee{
	private String subject;
	
	public Teacher(String n, int a, String c, String p, String s) {
		super(n, a, c, p);
		this.subject = s;
		
	}
	public void display() {
		super.display();
		System.out.println("subject = "+ subject);
	}
	
}

public class Ex06_03_양경원 {

	public static void main(String[] args) {
		
		Person pe = new Person("효연",12);
		pe.display();
		System.out.println("----------");
		
		Student st = new Student("윤아",29,100,100);
		st.display();
		System.out.println("----------");
		
		Employee em = new Employee("이승기", 42,"삼성","연구부");
		em.display();
		System.out.println("----------");
		
		Teacher te = new Teacher("강아지", 42,"LG","개발부","뭐");
		te.display();

	}

}
