import java.io.*;
public class Ex11_06_FileReader {



	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		FileReader fr = null;
		
		int i;
		try {
			fw = new FileWriter("write.txt");
			
			fw.write("즐거운 자바수업");
			fw.flush();
			fr = new FileReader("write.txt");
			
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			fw.close();
			fr.close();
		}
	}

}
