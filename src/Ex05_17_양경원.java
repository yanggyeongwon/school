class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "��"; singer = "��Ź"; genre = "Ʈ��Ʈ"; price = 3000;
	}
	Music(String title,String singer,String genre,int price){
		this.title = title; this.singer = singer; this.genre = genre; this.price = price;
	}
	
	void setTitle(String a) {
		title = a;
	}
	void setSinger(String a) {
		singer = a;
	}
	void setGenre(String a) {
		genre = a;
	}
	void setPrice(int a) {
		price = a;
	}
	
	
	String getTitle() {
		return title;
	}
	String getSinger() {
		return singer;
	}
	String getGenre() {
		return genre;
	}
	int getPrice() {
		return price;
	}
	
	void display() {
		System.out.println("--------------------");
		System.out.println("��       title : " + title+"      ��");
		System.out.println("��     singer : " + singer+"    ��");
		System.out.println("��     genre : " + genre+"   ��");
		System.out.println("��     price : " + price+"  ��");
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
		return "��  " +title +" "+ singer +" "+ genre + " "+ price +"  ��";
	}
	
}

public class Ex05_17_���� {

	public static void main(String[] args) {
		
		Music mu1 = new Music();//������ ���� �ʱ�ȭ
		Music mu2 = new Music("��","��Ź","Ʈ��Ʈ",3000);
		Music mu3 = new Music();//setter ���� �ʱ�ȭ
		Music mu4 = new Music();//setter ���� �ʱ�ȭ
		mu4.display(1);
		
		//m1 : getter ���� ���
		System.out.println("��             "+mu1.getTitle()+"              ��");
		System.out.println("��           "+mu1.getSinger()+"             ��");
		System.out.println("��          "+mu1.getGenre()+"            ��");
		System.out.println("��          "+mu1.getPrice()+"       ��");
		
		//m2 : �޼��� �Ȥ����� ���
		mu2.display();
		
		//mu3 : �޼��忡�� ������� 4�� �ϳͿ� ���Ϲ޾� ���
		System.out.println(mu3.show());
		System.out.println("--------------------");

	}

}
