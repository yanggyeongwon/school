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

}

public class Ex09_06_���� {

	public static void main(String[] args) {
		ArrayList<Card> arr = new ArrayList<Card>();
		Scanner sc = new Scanner(System.in);
		
		String name,num;
		do {
			boolean flag = false;
			System.out.println("1.�����߰�  2.���Ի���  3.���Լ���  4.���Ժ���  5.����");	

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
				num = sc.next();

				arr.add(new Card(name,num));

				//System.out.println(arr);
				break;
			case 2:

				System.out.print("�̸��� �Է��ϼ���");
				name = sc.next();
				for(int i=0; i<arr.size();i++) {
					if(name.equals(arr.get(i).getName())) {
						arr.remove(arr.get(i));
						flag=true;
						System.out.println("�����Ǿ����ϴ�.");
						break;
					}
				}
				if(flag == false) {
					System.out.println("�̸��� �߸� �Է��Ͽ����ϴ�.");
				}
				break;

			case 3:

				
				System.out.print("�̸��� �Է��ϼ���");
				name = sc.next();
				for(int i=0; i<arr.size();i++) {
					if(arr.get(i).getName().equals(name)) {
						System.out.print("�ٲٽ� ��ȭ��ȣ�� �Է��ϼ���. :");
						num = sc.next();
						arr.get(i).setTel(num);
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
				System.out.println("�̸�\t��ȭ��ȣ");
				for(int i=0;i<arr.size();i++) {
					System.out.println(arr.get(i).getName()+"\t"+arr.get(i).getTel());
				}
				break;
			default:
				System.out.println("1~5���� ��ȣ�� �Է�");
				break;
			}
		}while(true);
	}
}
