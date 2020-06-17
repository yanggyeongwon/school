class Person_pa extends Object{//to.string 기능 주소를 리턴한다.
	private String name;
	private int age;
	
	
	public Person_pa(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+","+age;
	}
	public boolean equals(Object obj) {
		//System.out.print(obj.age); 부모클래스는 접근 못함 age에
		if(obj instanceof Person_pa) {
			Person_pa p = (Person_pa)obj;
			return this.age == p.age;//this.age => man.age | p.age =>woman.age
			//System.out.println(p.age);
		}
		return false;
	}
}
public class Ex08_01_toString {

	public static void main(String[] args) {
		Person_pa man = new Person_pa("보검", 20);
		Person_pa woman = new Person_pa("윤아", 20);
		System.out.println(man.toString());
		System.out.println(woman);//참조변수 == 참조변수.toString();
		
		System.out.println(man.equals(woman));//woman ->obj
		System.out.println(man==woman);
	}

}
