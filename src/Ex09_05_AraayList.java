import java.util.ArrayList;
import java.util.Scanner;

class Music_M{
	private String title;
	private String singer;
	private int price;

	public Music_M(String title,String singer,int price_){
		this.title = title;
		this.singer = singer;
		this.price = price_;
	}
	public String toString() {
		return title+"/"+singer+"/"+price;
	}
}
public class Ex09_05_AraayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Music_M> arr = new ArrayList<Music_M>();

		String y;

		do {	
			System.out.println("����");
			String title_ = sc.next();

			System.out.println("����");
			String singer_ = sc.next();

			System.out.println("����");
			int price_ = sc.nextInt();
			
			System.out.println("��� �ϰ���ϱ�?y/n");
			y = sc.next();
			if(y.equals("y")) {
				continue;
			}else {
				arr.add(new Music_M(title_,singer_,price_));
				System.out.println(arr);
				for(int i=0; i<arr.size();i++) {
					
					System.out.println("ã�� ���� �Է�:");
					String Id_ = sc.next();
					System.out.println(Id_ +"���� ����: ");
					String Ti_ = sc.next();
					
					for(int j = 0; j<arr.size();j++) {
						System.out.println("��� �ϰ���ϱ�?y/n");
						y = sc.next();
						if(y.equals("y")) {
							continue;
						}else {
							break;
						}
					}
//					System.out.println("ã�� ���� �Է�: ");
//					String Id_2 = sc.next();
//					if(Id_2.equals(title_)) {
//						System.out.println("����");
//					}else {
//						System.out.println("�Ƴ�");
//					}
//					for(int i = 0; i<arr.size();i++) {
//						System.out.println("��� �ϰ���ϱ�?y/n");
//						y = sc.next();
//						if(y.equals("y")) {
//							continue;
//						}else {
//							break;
//						}
//					}
				}
				break;
			}

		} while (true);

		

			
		




	}

}
