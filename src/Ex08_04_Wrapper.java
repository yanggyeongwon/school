
public class Ex08_04_Wrapper {

	public static void main(String[] args) {
		Integer it1 = new Integer(11); // int ->Integer
		
		Integer it2 = 11;
		Integer it3 = 22;
		System.out.println(it2+it3);
		
		int it4 = 33;
		int it5 = new Integer(44);
		System.out.println();
		
		int i = Integer.parseInt("100");
		
		int j = Integer.parseInt("200");
		
		System.out.println(i+j);
		System.out.println("100" + "200");
		
		Integer a = Integer.valueOf("100");
		int b = Integer.valueOf("200");
		System.out.println(a+b);
		
		double c = Double.parseDouble("123.4");
		System.out.println(c);
		System.out.println("-------");
		i = Integer.parseInt("100");
		System.out.println(i);
		
		try {
			i = Integer.parseInt("100.3");
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("정수 변환 불가능");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		int arr [] = {1,2,3,4,5};
		int sum = 0;
		
		for(int q=0; q<arr.length; q++) {
			sum += arr[q];
		}
		System.out.println("sum :" + sum);
		
		String arr2 [] = {"1","2","3","4","5"};
		
		sum = 0;
		for(int q=0; q<arr.length;q++) {
			sum += Integer.parseInt(arr2[q]);
			System.out.println(sum);
		}
		System.out.println("sum :" + sum);
	}

}
