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
public class Ex09_05_AraayList{

    public static void main(String [] args){

    	Scanner sc = new Scanner(System.in);
    	ArrayList<Music_M> list = new ArrayList<Music_M>();
    	
    	String y;
    	
    	while (true) {
        	System.out.println("제목");
    		String title_ = sc.next();

    		System.out.println("가수");
    		String singer_ = sc.next();

    		System.out.println("가격");
    		int price_ = sc.nextInt();
    		
    		Music_M m = new Music_M(title_,singer_,price_);
    		list.add(m);
    		System.out.println("계속 하시겠습니까? y/n");
    		y =sc.next();
    		if(y.equals("n")) {
    			break;
    		}
			
		}
    	System.out.println(list.toString());
    	
    	boolean flag = false;
    	
    	while(true) {
    		flag = false;
    		System.out.println("찾는 제목 입력:");
			String Id_ = sc.next();
			
			
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).getTitle().equals(Id_)) {
					System.out.println(list.get(i).getTitle()+"의 가수명은"+list.get(i).getSinger());
					
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println("없습니다.");
			}
			
			System.out.println("계속 하시겠습니까? y/n");	
    		y =sc.next();
    		if(y.equals("n")) {
    			break;
    		}
			
    	}
    	System.out.println("프로그램을 종료합니다.");
    }
}
