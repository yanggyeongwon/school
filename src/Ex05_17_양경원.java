class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "찐"; singer = "영탁"; genre = "트로트"; price = 3000;
	}
	Music(String title,String singer,String genre,int price){
		this.title = title; this.singer = singer; this.genre = genre; this.price = price;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	void display() {
		System.out.println("--------------------");
		System.out.println("ㅣ       title : " + title+"      ㅣ");
		System.out.println("ㅣ     singer : " + singer+"    ㅣ");
		System.out.println("ㅣ     genre : " + genre+"   ㅣ");
		System.out.println("ㅣ     price : " + price+"  ㅣ");
		System.out.println("--------------------");
	}
	void display(int a) {
		System.out.println("     ________");
		System.out.println("     /" + "      \\");
		System.out.println("    /" + "        \\");
		System.out.println("   /" + "          \\");
		System.out.println("  /" + "            \\");
		System.out.println(" /" + "              \\");
		System.out.println("/" + "                \\");
		System.out.println("-------------------");
	}
	
	String show(){
		return "ㅣ  " +title +" "+ singer +" "+ genre + " "+ price +"  ㅣ";
	}
	
}

public class Ex05_17_양경원 {

	public static void main(String[] args) {
		
		Music mu1 = new Music();//생성자 통한 초기화
		Music mu2 = new Music("찐","영탁","트로트",3000);
		Music mu3 = new Music();//setter 통한 초기화
		
		
		Music bk[] = new Music[3];
		
		bk[0] = new Music();
		bk[1] = new Music("찐1","영탁1","트로트1",4000);
		bk[2] = new Music();
		bk[2].setTitle("asd");
		bk[2].setSinger("dfg");
		bk[2].setGenre("asd");
		bk[2].setPrice(50000);
		
		int i;
		for(i=0;i<bk.length;i++) {
			System.out.println(bk[i].show());
		}
		
		
		Music mu4 = new Music();//setter 통한 초기화
		mu4.display(1);
		
		//m1 : getter 통한 출력
		System.out.println("ㅣ             "+mu1.getTitle()+"              ㅣ");
		System.out.println("ㅣ           "+mu1.getSinger()+"             ㅣ");
		System.out.println("ㅣ          "+mu1.getGenre()+"            ㅣ");
		System.out.println("ㅣ          "+mu1.getPrice()+"       ㅣ");
		
		//m2 : 메서드 안ㅇ세서 출력
		mu2.display();
		
		//mu3 : 메서드에서 멤버변수 4개 하넌에 리턴받아 출력
		System.out.println(mu3.show());
		System.out.println("--------------------");

	}

}
