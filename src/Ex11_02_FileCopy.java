import java.io.*;


public class Ex11_02_FileCopy {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("From.txt");
			FileOutputStream fos = new FileOutputStream("To.txt");
			//false: 생성되고 내용지우고 다시생성 , true : 내용 뒤에 기존내용 추가
			
			
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
