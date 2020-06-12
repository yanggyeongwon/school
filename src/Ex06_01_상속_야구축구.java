
	class Sport{
		String name;
		int inwon;
		
		public Sport(String name,int inwon){
			this.name = name;
			this.inwon = inwon;
		}
		public void resultSports(){
			System.out.println("이름 : " +name);
			System.out.println("인원 : " +inwon);
		}
	}
	class Baseball extends Sport{
		double ta;
		
		public Baseball(String name,int inwon,double ta){
			super(name,inwon);
			this.ta = ta;
		}
		public void resultSports() {
			super.resultSports();
			System.out.println("타율 : " +ta);
		}
	}
	class Football extends Sport{
		int goal;
	
		public Football(String name,int inwon,int goal){
			super(name,inwon);
			this.goal = goal;
		}
		public void resultSports() {
			super.resultSports();
			System.out.println("골 : " +goal);
		}
	}
	
public class Ex06_01_상속_야구축구 {
	
//	static void result(Sport a) {
//		if(a instanceof Sport ) {
//			Sport sp = new Sport("스포츠",1);
//			sp.resultSports();
//		}
//		else if(a instanceof Baseball){
//			Baseball ba = new Baseball("박찬호",1,1.2);
//			ba.resultSports();
//		}
//		else if(a instanceof Football){
//			Football fo = new Football("혼다 게이새끼",2,2);
//		}
//	}
	public static void main(String[] args) {
		
//		Sport sp = new Sport("스포츠",1);
//		sp.resultSports();
//		
//		System.out.println("+++++++++++++++++++++++++");
//		
//		Sport ba = new Baseball("박찬호",1,1.2);
//		ba.resultSports();
//		
//		System.out.println("+++++++++++++++++++++++++");
//		
//		Sport fo = new Football("혼다 게이새끼",2,2);
//		fo.resultSports();
		
		Sport arr [] = {new Sport("스포츠",1),new Baseball("박찬호",1,1.2), new Football("혼다 게이새끼",2,2)};
		
		for(int i=0; i<arr.length; i++) {
			arr[i].resultSports();
		}
	}

	

}
