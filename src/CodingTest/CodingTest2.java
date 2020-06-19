package CodingTest;

import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	public Card(String name, String tel) {
		super();
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
public class CodingTest2 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();
		
		String inName, inTel;
		boolean flg, chkFlg=true;;

		while(chkFlg) {
			System.out.print("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:");
			int select= sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("�̸��� �Է��ϼ���:");
				inName=sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ���:");
				inTel=sc.next();
				list.add(new Card(inName, inTel));
				System.out.println("�߰��Ǿ����ϴ�");
				continue;
			case 2:
				System.out.print("�̸��� �Է��ϼ���:");
				inName=sc.next();
				flg=false;
				for(int i=0;i<list.size();i++) {
					if(inName.equals(list.get(i).getName())) {
						list.remove(i);
						System.out.println("�����Ǿ����ϴ�");
						flg=true;
						break;
					}
				}
				if(!flg) {
					System.out.println("�̸��� �߸��Է��ϼ̽��ϴ�.");
				}
				break;
			case 3:
				System.out.print("�̸��� �Է��ϼ���:");
				inName=sc.next();
				flg=false;
				for(int i=0;i<list.size();i++) {
					if(inName.equals(list.get(i).getName())) {
						flg=true;
					} 
				}
				if(!flg) {
					System.out.println("�̸��� �߸��Է��ϼ̽��ϴ�.");
					break;
				}
				System.out.print("��ȭ��ȣ�� �Է��ϼ���:");
				inTel=sc.next();
				flg=false;
				for(int i=0;i<list.size();i++) {
					if(inName.equals(list.get(i).getName())) {
						list.set(i, new Card(inName, inTel));
						System.out.println("�����Ǿ����ϴ�");
						flg=true;
						break;
					}
				}
				break;
			case 4:
				System.out.println("�̸�"+"\t"+"��ȭ��ȣ");
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i).getName()+"\t"+list.get(i).getTel());
				}
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���");
				break;
			}
		}

	}
}

//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:1
//�̸��� �Է��ϼ��� : kim
//��ȭ��ȣ�� �Է��ϼ��� : 1234
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:1
//�̸��� �Է��ϼ��� : park
//��ȭ��ȣ�� �Է��ϼ��� : 3333
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//park		3333
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:3
//�̸��� �Է��ϼ��� : park
//�����Ͻ� ��ȭ��ȣ�� : 7777
//�����Ǿ����ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//park		7777
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:3
//�̸��� �Է��ϼ��� : choi
//�̸��� �߸��Է��ϼ̽��ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:2
//�̸��� �Է��ϼ��� : park
//�����Ǿ����ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:2
//�̸��� �Է��ϼ��� : hong
//�̸��� �߸��Է��ϼ̽��ϴ�.
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
//�̸�		��ȭ��ȣ
//kim		1234
//
//1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:5
//���α׷��� �����մϴ�.








