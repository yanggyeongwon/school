	class Man_a{
		String name;
		int age;

		Man_a(String name,int age){
			this.name = name;
			this.age = age;
			
		}
		
		public String getName() {
			return name;
		}
		public void display() {
			System.out.println(name+","+age);
		}
		
	}
	class Worker{
		String company;
		Man_a m;

		Worker(String n,int a,String c){
//			this.name = n;
//			this.age = a;
			m = new Man_a(n,a);
			
			this.company = c;
		}
		void display() {
			System.out.println(m.getName());
			System.out.println(m.name+"\n"+m.age+"\n"+company);
		}
		
	}
	
public class Ex06_04_���� {

	public static void main(String[] args) {
		Worker wo = new Worker("�Ŀ��",22,"�޷н���ũ");
		wo.display();
		
	}

}
