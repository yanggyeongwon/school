import java.io.*;

public class Ex11_03_BufferedStream {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos;
		BufferedInputStream bis;
		int num;
		try {
			FileOutputStream fos = new FileOutputStream("data.txt");		
			bos = new BufferedOutputStream(fos,5);
			
			FileInputStream fis  = new FileInputStream("data.txt");
			bis = new BufferedInputStream(fis,5);
			
			for(int i = 1; i<9; i++) {
				System.out.print(i);
				bos.write(i+48);
			}
			
			System.out.println();
			bos.flush();
			while((num = bis.read()) != -1) {
				System.out.print((char)num+" ");
			}
			
			bos.close();
			bis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}//1~8���� ���� // �ֿܼ� 1~8 ���

		
		
		
	}

}
