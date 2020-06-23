import java.io.*;
import java.util.*;
public class Ex11_08_InputStreamReader {



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		try {
			System.out.println("���� �̸� �Է� : ");
			String file_Name = br.readLine();//���� ����

			BufferedWriter bw = new BufferedWriter(new FileWriter(file_Name));//fileWriter ���� �б� 

			System.out.println("ȭ�Ͽ� ������ ������ �Է� �ϼ��� : ");
			String text;

			while((text = br.readLine()) != null) {
				bw.write(text);
				bw.newLine();//���� �ν�
			}
			bw.flush();
			bw.close();
			br.close();
			
			System.out.println("�ݺ��� ��Ĩ�ϴ�.");
			
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

