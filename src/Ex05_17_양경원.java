class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		setTitle("��"); setSinger("��Ź"); genre = "Ʈ��Ʈ"; setPrice(3000);
	}
	Music(String title,String singer,String genre,int price){
		this.setTitle(title); this.setSinger(singer); this.genre = genre; this.setPrice(price);
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
		System.out.println("��       title : " + getTitle()+"      ��");
		System.out.println("��     singer : " + getSinger()+"    ��");
		System.out.println("��     genre : " + genre+"   ��");
		System.out.println("��     price : " + getPrice()+"  ��");
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
		return "��  " +getTitle() +" "+ getSinger() +" "+ genre + " "+ getPrice() +"  ��";
	}
	
}

public class Ex05_17_���� {

	public static void main(String[] args) {
		
		Music mu1 = new Music();//������ ���� �ʱ�ȭ
		Music mu2 = new Music("��","��Ź","Ʈ��Ʈ",3000);
		Music mu3 = new Music();//setter ���� �ʱ�ȭ
		
		
		Music bk[] = new Music[3];
		
		bk[0] = new Music();
		bk[1] = new Music("��1","��Ź1","Ʈ��Ʈ1",4000);
		bk[2] = new Music();
		bk[2].setTitle("asd");
		bk[2].setSinger("dfg");
		bk[2].setGenre("asd");
		bk[2].setPrice(50000);
		
		int i;
		for(i=0;i<bk.length;i++) {
			System.out.println(bk[i].show());
		}
		
		
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
