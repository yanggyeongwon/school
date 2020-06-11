	class sba{
		String name;
		int inwon;
		
		public sba(String name,int inwon) {
			this.name = name;
			this.inwon = inwon;
		}
		public void display() {
			System.out.println("이름 : " +name);
			System.out.println("인원 : " +inwon);
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
			System.out.println("타율 : " +ta);
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
			System.out.println("골 : " +goal);
		}
	}
	
public class Ex06_01_상속_야구축구 {
	public static void main(String[] args) {
		
		Sports sp = new Sports("스포츠",1);
		sp.resultSports();
		
		System.out.println("+++++++++++++++++++++++++");
		
		Baseball ba = new Baseball("박찬호",1,1.2);
		ba.resultBaseball();
		
		System.out.println("+++++++++++++++++++++++++");
		
		Football fo = new Football("혼다 게이새끼",2,2);
		fo.resultFootball();
		
	}

}
