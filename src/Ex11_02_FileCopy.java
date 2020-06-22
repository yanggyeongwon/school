import java.io.*;


public class Ex11_02_FileCopy {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("From.txt");
			FileOutputStream fos = new FileOutputStream("To.txt");
			//false: �����ǰ� ��������� �ٽû��� , true : ���� �ڿ� �������� �߰�
			
			
			while(true) {
				int i = fis.read();
				if(i==-1) {
					break;
				}
				System.out.print((char)i);
				fos.write(i);
			}
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
