import java.io.*;
import java.util.*;

public class Ex11_11_WordCount_양경원 {

	public static void main(String[] args) throws IOException {
		//한문장으로 출력
		//줄 수 lineCount : 39
		//방의 갯수 : 247
		//공백 만나면 하나씩 끊어서 자동으로 배열에 담는다 for문으로 배열 생성
		//대소문자 구문 해서 각각 몇번 나왔는지 갯수 세기  sound : 1 // Sound : 1
		//Map활용
		BufferedReader br = new BufferedReader(new FileReader("lyrics.txt"));
		String str, lyrics = "";
		int lineCount = 0;
		
		while((str = br.readLine()) != null){
//			System.out.print(str);
			lyrics += str+" ";
			lineCount++;
		
		}
		System.out.println(lyrics);		
		System.out.println("lineCount : "+lineCount++);
		String[] result = lyrics.split(" ");
		System.out.println("방의 갯수 : "+result.length);
		
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
		for(int i=0; i<result.length;i++) {
			if(hs.get(result[i]) == null) {
				hs.put(result[i], 1);				
			}else {
				Integer v = hs.get(result[i])+1;
				hs.put(result[i], v);
				
				//hs.put(result[i], hs.get(result[i])+1);		
			}
			
		}
		
		Set key = hs.keySet();
		
		Iterator<String> iter = key.iterator();

		while(iter.hasNext()) {
			for(int i=0; i<key.size();i++) {
				String name = iter.next();
				System.out.println(name+":"+hs.get(name));
			}	
		}

		
//		int lineCnt=0;
//		int i = 1;
//		int sum = 0;
//		String line = "";
//		BufferedReader br,br2,br3;
//		
//		FileReader fi = new FileReader("lyrics.txt");
//		br = new BufferedReader(new FileReader("lyrics.txt"));
//
//		try { 
//			br2 = new BufferedReader(new FileReader("lyrics.txt"));
//			while(br2.readLine() != null) 
//				lineCnt++; 
//		}catch(Exception ex) {
//			ex.printStackTrace(); 
//		} 
//
//		System.out.println("라인 카운터어: "+lineCnt);
//
//		
//		//방의 갯수
//		StringTokenizer st;
//		int cnt = 0;
//		String str = "";
//		int igon;
//		br3 = new BufferedReader(new FileReader("lyrics.txt"));
//		while((str = br3.readLine()) != null) {
//			st = new StringTokenizer(str);
//			cnt += st.countTokens();
//			igon = str.compareToIgnoreCase(str);
//			
//		}
//		System.out.println("방의 갯수 : "+cnt);
//
//		
//		
//
//		
//
//		//		while((i = fi.read()) != -1){
//		//			System.out.print((char)i);
//		//		}
//
//		//한줄 출
//		while ((line = br.readLine()) != null ){
//			StringTokenizer tk = new StringTokenizer(line, " ");
//			String token;
//			while ( tk.hasMoreTokens() ) {
//				token = tk.nextToken();
//				System.out.printf(token + " ");
//			}
//			
//			i++;
//			
//		}
//		br.close();

		
	}

}
