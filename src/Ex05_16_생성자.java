class Parson2{
	private String name;
	private int age;
	private double height;
	
	Parson2(){
		System.out.println("Parson2()");
		name = "슬기";
		age = 20;
		height = 143.2;
	}
	Parson2(String name,int age,double height){
		System.out.println("Parson2(String a,int b,double c");
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	void setName(String a){
		this.name = name; 
	}
	
	String getName() {
		return  name;
	}
	
	int getAge() {
		return age;
	}
	
	double getHeight() {
		return height;
	}
	void display() {
		System.out.println("----------------");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
	}
	
	String show(){
		return name +" "+ age +" "+ height;
	}
}
public class Ex05_16_생성자 {

	public static void main(String[] args) {
		Parson2 sc = new Parson2();

		System.out.println(sc.getName());
		System.out.println(sc.getAge());
		System.out.println(sc.getHeight());
		
		Parson2 sc2 = new Parson2("웬디",50,173.2);
		
		System.out.println(sc2.getName());
		System.out.println(sc2.getAge());
		System.out.println(sc2.getHeight());
		
		sc.display();
		sc2.display();
		System.out.println("++++++++");
		

		System.out.println(sc.show());
		System.out.println(sc2.show());
		

	}

}
