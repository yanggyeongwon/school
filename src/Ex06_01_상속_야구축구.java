	class sba{
		String name;
		int inwon;
		
		public sba(String name,int inwon) {
			this.name = name;
			this.inwon = inwon;
		}
		public void display() {
			System.out.println("�̸� : " +name);
			System.out.println("�ο� : " +inwon);
		}
	}
	class Sports extends sba{
		public Sports(String name,int inwon){
			super(name,inwon);
		}
		public void resultSports(){
			super.display();
		}
	}
	class Baseball extends sba{
		double ta;
		
		public Baseball(String name,int inwon,double ta){
			super(name,inwon);
			this.ta = ta;
		}
		public void resultBaseball() {
			super.display();
			System.out.println("Ÿ�� : " +ta);
		}
	}
	class Football extends sba{
		int goal;
	
		public Football(String name,int inwon,int goal){
			super(name,inwon);
			this.goal = goal;
		}
		public void resultFootball() {
			super.display();
			System.out.println("�� : " +goal);
		}
	}
	
public class Ex06_01_���_�߱��౸ {
	public static void main(String[] args) {
		
		Sports sp = new Sports("������",1);
		sp.resultSports();
		
		System.out.println("+++++++++++++++++++++++++");
		
		Baseball ba = new Baseball("����ȣ",1,1.2);
		ba.resultBaseball();
		
		System.out.println("+++++++++++++++++++++++++");
		
		Football fo = new Football("ȥ�� ���̻���",2,2);
		fo.resultFootball();
		
	}

}
