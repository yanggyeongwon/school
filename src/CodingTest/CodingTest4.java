package CodingTest;

import java.util.*;
import java.io.*;
public class CodingTest4 {

	public static void main(String[] args) throws IOException {

		BufferedReader in_name = null;
		BufferedWriter in_save = null;

		String Fruit,Fruit2 = null,find;

		System.out.println("단어장이름을 입력하세요 ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		//C:\sun\voca.txt
		String file_Name = br.readLine();
		BufferedWriter bw = new BufferedWriter(new FileWriter(file_Name));
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {

			System.out.println("1.단어입력 2.단어검색 3.종료");

			try {

				num = sc.nextInt();

				switch (num) {
				case 1:

					System.out.print("단어 / 뜻 입력하세요");
					
					in_name = new BufferedReader(new InputStreamReader(System.in));
					Fruit = in_name.readLine();
					in_save = new BufferedWriter(new FileWriter(file_Name,true));
					
					in_save.write(Fruit);
					in_save.newLine();
					
					//in_save.flush();
					in_save.close();
					break;

				case 2:
					System.out.print("검색 단어 입력하세요");
					BufferedReader in_name2 = new BufferedReader(new InputStreamReader(System.in));
					Fruit2 = in_name.readLine();
					BufferedWriter in_save2 = new BufferedWriter(new FileWriter(file_Name));
					
					while((find = in_name2.readLine()) != null) {
						String [] in_Fruit = find.split("/");
						System.out.println(in_Fruit[0]);

					
					if(in_Fruit[0].trim().compareTo(Fruit2.trim()) == 0) {
							System.out.println("오류 3");
							System.out.print("단어 : "+ in_Fruit[0]);
							System.out.print("단어의 뜻 :"+ in_Fruit[1]);
						}else {
							System.out.println("틀림");
						}
					}
					break;

				default:

					break;
				}
				if(num == 3) {

					System.out.println("시스템 종료합니다.");
					in_name.close();
					in_save.close();
					sc.close();
					break;
				}
			} catch (NullPointerException e) {
				
				System.out.println("Null!!");
			}
			

		}while(true);

	}
}