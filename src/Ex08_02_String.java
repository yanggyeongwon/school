import java.util.Scanner;

public class Ex08_02_String {

	public static void main(String[] args) {
		int a=1,b=2;
		System.out.println(a==b);
		String str1 = new String("have a nice");
		String str2 = new String("have a nice");
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str1.equals(str2));//대소문자 비교함
		if(str1.equals(str2)) {
			System.out.println("str1과 str2문자열 같음");
		}else {
			System.out.println("str1과 str2문자열 같지않음");
		}
		System.out.println(str1.equalsIgnoreCase(str2));//대소문자 비교않함
		System.out.println(str1 == str2);
		System.out.println(str1.compareTo(str2));//반환값이 아스키코드로 반환함 첫번째 자리수부터 다르면 첫번째 자리수 아스키코드 - 첫번째 자리수 아스키코드  = 정수
		
		System.out.println(str1.concat(str2));//문자열 합쳐 반환
		
		System.out.println(str1.indexOf("nice"));//문자열 위치 번호 값 반환
		
		System.out.println(str1.indexOf("happy"));//음수일땐 값이 없음
		
		System.out.println(str1.lastIndexOf("a"));
		System.out.println(str1.contains("nice"));//문자열 포함 여부 확인 t/f로 반환
		System.out.println(str1.contains("happy"));
		
		System.out.println(str1.charAt(3));//문자열에 위치한 글자 반환
		char c = str1.charAt(3);
		System.out.println(c);
		System.out.println(str1.substring(7,11));//7번째~11번째 까지 11포함 안함
		System.out.println(str1.substring(7));
		
		System.out.println(str1.replace("a", "x"));// a를 x로 변경
		
		String s = "     abc    d  1$ e  fg    ";
		System.out.println(s.trim());//문자 앞뒤 공백 없애기
		s = s.trim();
		System.out.println(s.toUpperCase());//소문자 대문자로 변경
		
		String fullName = "Hello.java";
	
		String flieName = fullName.substring(0,5);
		String ext = fullName.substring(6);
		
		System.out.println("파일명 " + flieName);
		System.out.println("확장자 " + ext);
		System.out.println("-------------");
		
		String fileName2 = fullName.substring(0,fullName.indexOf("."));
		String ext2 = fullName.substring(fullName.lastIndexOf(".")+1);
		
		System.out.println("파일명 " + fileName2);
		System.out.println("확장자2 " + ext2);
		
		System.out.println("-------------");
		
		int fileName3 = fullName.indexOf(".");
		if(fileName3 == 5) {
			System.out.println("파일명 3 : "+fullName.substring(0,fileName3));
			System.out.println("확장자 3 : "+fullName.substring(fileName3+1));
			
		}
		System.out.println("-------------");
		
		String id = "kim";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력");
		String inputId = sc.next();

		System.out.println("비밀번호 입력");
		String inputPw = sc.next();
		
		if(inputId.equals(id) && inputPw.equals(pw)) {
			
			System.out.println("로그인이 가능합니다.");
		}else {
			System.out.println("아이디 또는 비밀번호 틀렸습니다.");
		}
		
		
		
		
	}
}
