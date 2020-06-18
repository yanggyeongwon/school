package CodingTest;

import java.util.ArrayList;
import java.util.Scanner;

class Music_M{
	private String title;
	private String singer;
	private int price;

	public Music_M(String title,String singer,int price){
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getprice() {
		return singer;
	}
	public void setprice(String price) {
		this.singer = price;
	}
	
	public String toString() {
		return title+"/"+singer+"/"+price;
	}
}
public class TestCase2{

    public static void main(String [] args){

    	Scanner sc = new Scanner(System.in);
    	ArrayList<Music_M> list = new ArrayList<Music_M>();
    	
    	String y;
    	
    	while (true) {
        	System.out.println("����");
    		String title_ = sc.next();

    		System.out.println("����");
    		String singer_ = sc.next();

    		System.out.println("����");
    		int price_ = sc.nextInt();
    		
    		Music_M m = new Music_M(title_,singer_,price_);
    		list.add(m);
    		System.out.println("��� �Ͻðڽ��ϱ�? y/n");
    		y =sc.next();
    		if(y.equals("n")) {
    			break;
    		}
			
		}
    	System.out.println(list.toString());
    	
    	boolean flag = false;
    	
    	while(true) {
    		flag = false;
    		System.out.println("ã�� ���� �Է�:");
			String Id_ = sc.next();
			
			
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).getTitle().equals(Id_)) {
					System.out.println(list.get(i).getTitle()+"�� ��������"+list.get(i).getSinger());
					
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println("�����ϴ�.");
			}
			
			System.out.println("��� �Ͻðڽ��ϱ�? y/n");	
    		y =sc.next();
    		if(y.equals("n")) {
    			break;
    		}
			
    	}
    	System.out.println("���α׷��� �����մϴ�.");
    }
}
