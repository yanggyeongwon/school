import java.util.*;
import java.io.*;
public class Ex11_10_���� {

	public static void main(String[] args) throws IOException {

		
		
		System.out.println("�ܾ����̸��� �Է��ϼ��� ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String file_Name = br.readLine();
			BufferedWriter bw = new BufferedWriter(new FileWriter(file_Name));//C:\sun\voca.txt
			while(true) {
				
				System.out.println("1.�ܾ��Է� 2.�ܾ�˻� 3.����");
				
				String num = br.readLine();

//				if (num = 1) {
//					System.out.print("�ܾ� / �� �Է�>>");
//
//					String str;
//					while((str = br.readLine()) != null) {
//						bw.write(str);
//						bw.newLine();
//					}
//				}
//				else if(num == 2) {
//					
//				}
//				else if( num == 3) {
//					
//				}

			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//�Է��� �ܾ�/���� voca.txt�� ����
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 1
//�ܾ�/�� �Է�>>apple/���
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 1
//�ܾ�/�� �Է�>>blue sky/�Ķ� �ϴ�
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 2
//�˻� �ܾ� �Է�>>apple
//�ܾ�>apple
//�ܾ��� ��>���
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 2
//�˻� �ܾ� �Է�>>summer
//ã�� �ܾ� ����
//
//1.�ܾ��Է� 2.�ܾ�˻� 3.���� >> 3
//���α׷� �����մϴ�.
