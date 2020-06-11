class Book {
	private String title;
	private int price;
	private int price2;
	
	public Book(String title,int price){
		this.title = title;
		this.price = price;
	}
	public void dis() {
		System.out.println(title);
		System.out.println(price);
	}
	Book(){
		
	}
	void setTitle(String title) {
		this.title = title;
	}
	
	void setPrice(int price){
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
}
	

public class Ex05_18_객체배열 {

	public static void main(String[] args) {
		
		int a=1,b=2,c=3;
		int arr [] = {a,b,c};
		int arr2 [] = new int[] {a,b,c};
		int arr3 [] = new int[3];
		arr3[0] = a;
		arr3[1] = b;
		arr3[2] = c;
		
		Book sc1 = new Book("a", 100);
		Book sc2 = new Book("b", 200);
		sc1.dis();
		sc2.dis();
			
//		Book bk[] = new Book[3];
//		bk[0] = new Book("a",100);
//		bk[1] = new Book("b",200);
//		bk[2] = new Book();
		Book bk[] = {new Book("자바",3000),new Book("html",2000),new Book("css",3000)};
		bk[2].setTitle("c");
		bk[2].setPrice(3000);

		
		bk[0].dis();
		bk[1].dis();
		bk[2].dis();
		System.out.println("***********");
		int i;
		for(i=0;i<bk.length;i++) {
			bk[i].dis();
		}
		
		System.out.println("게터"+bk[2].getPrice());
		
	}

}
