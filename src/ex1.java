//	class Person{
//		String name;
//		int age;
//		double height;	
//		static nation;
//	}
//	class Product{
//		String color,color2,power,power2;
//		int channel,channel2;
//	}
//	class Product{
//			String color,color2,power,power2;
//			int channel,channel2;
//	}
	class Company{
		static String Lg,color;
		static int ch;
		boolean power;
		void chup(){
			ch++;
		}
		void power() {
			power = true ? true : false;
			//power = !power;
		}
	}
public class ex1 {
	
	public static void main(String[] args) {
		
		Company co = new Company();
		co.ch= 12;
		co.chup();
		co.power();
		System.out.println(co.power);
		Company.Lg = "LG";
		System.out.println(co.Lg);
		System.out.println(Company.Lg);
		System.out.println(co.ch);

//		Person man = new Person();
//		Person woman = new Person();
//		man.age = 17;
//		man.name = "Ã¶¼ö";
//		man.height = 173.8;
//		woman.age = 30;
//		woman.name = "¿µÈñ";
//		woman.height = 154.3;
//		Product pro =  new Product();
//		Person.nation;
//		pro.color = "red";
//		pro.color2 = "yellow";
//		pro.channel = 11;
//		pro.channel2 = 9;
//		pro.power = "on";
//		pro.power2 = "off";
//		System.out.println(pro.color2);
		
//		int mul = multiple();
//		System.out.println(mul);
//	}
//	
//	static int multiple() {
//		prn();
//		return 3*4;
//	}
//	
//	static void prn() {
//		System.out.println("----------------");
		
		
		
		
		
		
		
		
		
	}

}


	