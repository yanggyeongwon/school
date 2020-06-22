import java.io.File;
import java.io.IOException;

public class Ex11_01_File {

	public static void main(String[] args) {
		String a = File.pathSeparator;
		String b = File.separator;
		System.out.println(a);
		System.out.println(b);
		File f1 = new File("c:"+ File.separator + "sun" + File.separator + "aaa.txt");
		File f2 = new File("c:\\sun","aaa.txt");
		File dir = new File("c:\\sun");
		File f3 = new File(dir,"aaa.txt");
		File f4 = new File("c:\\sun\\aaa.txt");
		
		System.out.println(f1.length());
		System.out.println(f2.length());
		System.out.println(f3.length());
		System.out.println(f4.length());
		
		File f5 = new File("A");
		File f6 = new File("B");
		File f7 = new File("C");
		File f8 = new File(f5,"aa.txt");
		
		if(f5.exists()) {
			f5.renameTo(f6);
			System.out.println("���� �̸� �ٲٱ� ����");
			try {
				f8.createNewFile();
				System.out.println("���� ������");
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		else {
			f5.mkdir();
			System.out.println("���� ����");	
		}
		
		if(f7.exists()) {
			boolean bb = f7.delete();
			System.out.println("bb: "+ bb);
		}
	}

}
