import java.util.Scanner;

public class Ex08_02_String {

	public static void main(String[] args) {
		int a=1,b=2;
		System.out.println(a==b);
		String str1 = new String("have a nice");
		String str2 = new String("have a nice");
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str1.equals(str2));//��ҹ��� ����
		if(str1.equals(str2)) {
			System.out.println("str1�� str2���ڿ� ����");
		}else {
			System.out.println("str1�� str2���ڿ� ��������");
		}
		System.out.println(str1.equalsIgnoreCase(str2));//��ҹ��� �񱳾���
		System.out.println(str1 == str2);
		System.out.println(str1.compareTo(str2));//��ȯ���� �ƽ�Ű�ڵ�� ��ȯ�� ù��° �ڸ������� �ٸ��� ù��° �ڸ��� �ƽ�Ű�ڵ� - ù��° �ڸ��� �ƽ�Ű�ڵ�  = ����
		
		System.out.println(str1.concat(str2));//���ڿ� ���� ��ȯ
		
		System.out.println(str1.indexOf("nice"));//���ڿ� ��ġ ��ȣ �� ��ȯ
		
		System.out.println(str1.indexOf("happy"));//�����϶� ���� ����
		
		System.out.println(str1.lastIndexOf("a"));
		System.out.println(str1.contains("nice"));//���ڿ� ���� ���� Ȯ�� t/f�� ��ȯ
		System.out.println(str1.contains("happy"));
		
		System.out.println(str1.charAt(3));//���ڿ��� ��ġ�� ���� ��ȯ
		char c = str1.charAt(3);
		System.out.println(c);
		System.out.println("����Ʈ��"+str1.substring(7,11));//7��°~11��° ���� 11���� ����
		System.out.println(str1.substring(7));
		
		System.out.println(str1.replace("a", "x"));// a�� x�� ����
		
		String s = "     abc    d  1$ e  fg    ";
		System.out.println(s.trim());//���� �յ� ���� ���ֱ�
		s = s.trim();
		System.out.println(s.toUpperCase());//�ҹ��� �빮�ڷ� ����
		
		String fullName = "Hello.java";
	
		String flieName = fullName.substring(0,5);
		String ext = fullName.substring(6);
		
		System.out.println("���ϸ� " + flieName);
		System.out.println("Ȯ���� " + ext);
		System.out.println("-------------");
		
		String fileName2 = fullName.substring(0,fullName.indexOf("."));
		String ext2 = fullName.substring(fullName.lastIndexOf(".")+1);
		
		System.out.println("���ϸ� " + fileName2);
		System.out.println("Ȯ����2 " + ext2);
		
		System.out.println("-------------");
		
		int fileName3 = fullName.indexOf(".");
		if(fileName3 == 5) {
			System.out.println("���ϸ� 3 : "+fullName.substring(0,fileName3));
			System.out.println("Ȯ���� 3 : "+fullName.substring(fileName3+1));
			
		}
		System.out.println("-------------");
		
		String id = "kim";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� �Է�");
		String inputId = sc.next();

		System.out.println("��й�ȣ �Է�");
		String inputPw = sc.next();
		
		if(inputId.equals(id) && inputPw.equals(pw)) {
			
			System.out.println("�α����� �����մϴ�.");
		}else {
			System.out.println("���̵� �Ǵ� ��й�ȣ Ʋ�Ƚ��ϴ�.");
		}
		
		
		
		
	}
}
