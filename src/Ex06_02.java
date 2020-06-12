	class Sports2{
		String name;
		int inwon;
		
		Sports2(String name,int inwon){
			this.name = name;
			this.inwon = inwon;
		}
		public void show() {
			System.out.println("이름"+name);
			System.out.println("인원"+inwon);
		}
	}
	
	class Baseball2 extends Sports2{
		double ta;
		
		public Baseball2(String name,int inwon,double ta){
			super(name,inwon);
			this.ta = ta;
		}
		public void resultBaseball2() {
			super.show();
			System.out.println("타 : " +ta);
		}
	}
	class Football2 extends Sports2{
		int goal;
		
		public Football2(String name,int inwon,int goal){
			super(name,inwon);
			this.goal = goal;
		}
		public void resultFootball2() {
			super.show();
			System.out.println("골 : " +goal);
		}
		
	}
public class Ex06_02 {

	public static void main(String[] args) {
		
		Sports2 sp = new Sports2("a",1);
		sp.show();
		System.out.println("---------");
		
		Baseball2 ba = new Baseball2("b",2,2.1);
		ba.resultBaseball2();
		
		System.out.println("---------");
		
		Football2 fo = new Football2("c",3, 2);
		fo.resultFootball2();

	}

}
