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
				fos.write(i+48);
			}
			
			System.out.println();
			
			while((num = fis.read()) != -1) {
				System.out.print((char)num+" ");
			}

			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}//1~8까지 쓰고 // 콘솔에 1~8 출력

		
		
		
	}

}
