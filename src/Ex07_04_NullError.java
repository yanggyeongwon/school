
public class Ex07_04_NullError {

	public static void main(String[] args) {
		int a;

		try {
			//			String st = null;
			String st = "banana";
			System.out.println(st.length());

			//new NullPointerException();숨겨진 메소오오드
			//new NullPointerException e = new //new NullPointerException();
			a =3/1;// new ArithmeticException();
			System.out.println("a :" +a);

			int arr[] = {1,2,3};
			System.out.println(arr[3]);

			System.out.println("try 안");


		}catch(NullPointerException e1) {

			System.out.println("catch 안");

		}catch(ArithmeticException e2){

			System.out.println("catch2 안");
			System.out.println(e2.toString());
			System.out.println(e2.getMessage());

		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("3번방은 없음");
			
		}catch(Exception e) {//마지막에 위치
			
			System.out.println(e.toString());
			
		}finally {//반드시 실행
			
			System.out.println("finally 안");
		}
		System.out.println("예외처리");

	}

}

