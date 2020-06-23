import java.util.*;
import java.io.*;
public class Ex11_10_양경원 {

	public static void main(String[] args) throws IOException {

		
		
		System.out.println("단어장이름을 입력하세요 ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String file_Name = br.readLine();
			BufferedWriter bw = new BufferedWriter(new FileWriter(file_Name));//C:\sun\voca.txt
			while(true) {
				
				System.out.println("1.단어입력 2.단어검색 3.종료");
				
				String num = br.readLine();

//				if (num = 1) {
//					System.out.print("단어 / 뜻 입력>>");
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

//입력한 단어/뜻은 voca.txt에 쓰기
//1.단어입력 2.단어검색 3.종료 >> 1
//단어/뜻 입력>>apple/사과
//
//1.단어입력 2.단어검색 3.종료 >> 1
//단어/뜻 입력>>blue sky/파란 하늘
//
//1.단어입력 2.단어검색 3.종료 >> 2
//검색 단어 입력>>apple
//단어>apple
//단어의 뜻>사과
//
//1.단어입력 2.단어검색 3.종료 >> 2
//검색 단어 입력>>summer
//찾는 단어 없음
//
//1.단어입력 2.단어검색 3.종료 >> 3
//프로그램 종료합니다.
