import java.util.*;

class Person3{
	String name;
	int age;
	double height;
	static String nation;
	
}
public class Ex08_05_Math {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));
		
		long num1 = Math.round(3.856);
		System.out.println("num: "+num1);
		
		double num2 = Math.ceil(4.123);
		System.out.println(num2);
		
		double num3 = Math.floor(4.7);
		System.out.println(num3);
		
		int num4 = (int)(Math.random()*36)+13;
		System.out.println(num4);//0*10 <= x*10 < 1*10
	}

}
