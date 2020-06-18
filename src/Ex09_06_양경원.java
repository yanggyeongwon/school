import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	public Card(String name,String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String toString() {
		return name+"\t"+ tel;
	}
}

public class Ex09_06_���� {

	public static void main(String[] args) {
		ArrayList<Card> arr = new ArrayList<Card>();

		String name;
		do {

			System.out.println("1.�����߰�  2.���Ի���  3.���Լ���  4.���Ժ���  5.����");

			Scanner sc = new Scanner(System.in);

			int select = sc.nextInt();
			if(select == 5) {
				System.out.println("�ý����� �����մϴ�");
				break;
			}
			switch (select) {
			case 1:

				System.out.print("�̸��� �Է��ϼ���");
				name = sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ���");
				String num = sc.next();

				arr.add(new Card(name,num));

				//System.out.println(arr);
				break;
			case 2:

				System.out.print("�̸��� �Է��ϼ���");
				name = sc.next();
				for(int i=0; i<arr.size();i++) {
					if(name.equals(arr.get(i).getName())) {
						arr.remove(arr.get(i));
					}
				}

				System.out.println("�����Ǿ����ϴ�.");
				break;
			case 3:

				boolean flag = false;
				System.out.print("�̸��� �Է��ϼ���");
				name = sc.next();
				for(int i=0; i<arr.size();i++) {
					if(arr.get(i).getName().equals(name)) {
						System.out.print("�ٲٽ� ��ȭ��ȣ�� �Է��ϼ���. :");
						String tel = sc.next();
						arr.get(i).setTel(tel);
						System.out.println("����Ǿ����ϴ�.");
						flag=true;
						break;
					}
				}
				if(flag == false) {
					System.out.println("�̸��� �߸� �Է��Ͽ����ϴ�.");

				}
				break;
			case 4:
				//				System.out.println("�̸�\t��ȭ��ȣ");
				System.out.println(arr);
				break;
			default:
				break;
			}
		}while(true);
	}
}
