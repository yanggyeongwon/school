
public class Ex07_04_NullError {

	public static void main(String[] args) {
		int a;

		try {
			//			String st = null;
			String st = "banana";
			System.out.println(st.length());

			//new NullPointerException();������ �޼ҿ�����
			//new NullPointerException e = new //new NullPointerException();
			a =3/1;// new ArithmeticException();
			System.out.println("a :" +a);

			int arr[] = {1,2,3};
			System.out.println(arr[3]);

			System.out.println("try ��");


		}catch(NullPointerException e1) {

			System.out.println("catch ��");

		}catch(ArithmeticException e2){

			System.out.println("catch2 ��");
			System.out.println(e2.toString());
			System.out.println(e2.getMessage());

		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("3������ ����");
			
		}catch(Exception e) {//�������� ��ġ
			
			System.out.println(e.toString());
			
		}finally {//�ݵ�� ����
			
			System.out.println("finally ��");
		}
		System.out.println("����ó��");

	}

}

