package CodingTest;


class TestCase2 {
	public static int cal(int value) {
		int sum = value;
		while(value > 0) {
			sum += value %10;
			value /= 10;
			
		}
		return sum;
	}
	
	public static void main(String [] arge){

		int arr [] = new int[10001];
		
		for(int i=1; i<=arr.length;i++) {
			
			int sum = cal(i);
			if(sum <=10000) {
				arr[sum] = 1;
			}
			
		}
		
		for(int i = 1; i< arr.length;i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
	}
}