
	class Sport{
		String name;
		int inwon;
		
		public Sport(String name,int inwon){
			this.name = name;
			this.inwon = inwon;
		}
		public void resultSports(){
			System.out.println("�̸� : " +name);
			System.out.println("�ο� : " +inwon);
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
			System.out.println("Ÿ�� : " +ta);
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
			System.out.println("�� : " +goal);
		}
	}
	
public class Ex06_01_���_�߱��౸ {
	
//	static void result(Sport a) {
//		if(a instanceof Sport ) {
//			Sport sp = new Sport("������",1);
//			sp.resultSports();
//		}
//		else if(a instanceof Baseball){
//			Baseball ba = new Baseball("����ȣ",1,1.2);
//			ba.resultSports();
//		}
//		else if(a instanceof Football){
//			Football fo = new Football("ȥ�� ���̻���",2,2);
//		}
//	}
	public static void main(String[] args) {
		
//		Sport sp = new Sport("������",1);
//		sp.resultSports();
//		
//		System.out.println("+++++++++++++++++++++++++");
//		
//		Sport ba = new Baseball("����ȣ",1,1.2);
//		ba.resultSports();
//		
//		System.out.println("+++++++++++++++++++++++++");
//		
//		Sport fo = new Football("ȥ�� ���̻���",2,2);
//		fo.resultSports();
		
		Sport arr [] = {new Sport("������",1),new Baseball("����ȣ",1,1.2), new Football("ȥ�� ���̻���",2,2)};
		
		for(int i=0; i<arr.length; i++) {
			arr[i].resultSports();
		}
	}

	

}
