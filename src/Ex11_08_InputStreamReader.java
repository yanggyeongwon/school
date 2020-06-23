import java.io.*;
import java.util.*;
public class Ex11_08_InputStreamReader {



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		try {
			System.out.println("파일 이름 입력 : ");
			String file_Name = br.readLine();//파일 쓰기

			BufferedWriter bw = new BufferedWriter(new FileWriter(file_Name));//fileWriter 파일 읽기 

			System.out.println("화일에 저장할 내용을 입력 하세요 : ");
			String text;

			while((text = br.readLine()) != null) {
				bw.write(text);
				bw.newLine();//엔터 인식
			}
			bw.flush();
			bw.close();
			br.close();
			
			System.out.println("반복을 마칩니다.");
			
			BufferedReader br2 = new BufferedReader(new FileReader(file_Name));

			String line;
			try {
				while((line = br2.readLine()) != null) {
					System.out.print(line);
				}
			} catch (NullPointerException e) {

			}//c:\\sun\\x.txt
			
			br2.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

