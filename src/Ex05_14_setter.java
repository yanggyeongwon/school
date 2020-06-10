	class Tv2{
		
		private String color;
		private int channel;
		private boolean power;
		
		void setColor(String a){
			color = a;
		}
		String getColor() {
			return color;
		}
		void setchannel(int b){
			channel = b;
		}
		int getchannel() {
			return channel;
		}
		void setbool(boolean c){
			power = c;
		}
		boolean getbool() {
			return power;
		}
		
		
		void channelUp() {
			channel++;
		}
		void powerUp() {
			power = !power;
		}
	}

public class Ex05_14_setter {

	public static void main(String[] args) {
		
		Tv2 sc = new Tv2();
		sc.setColor("레드");
		sc.setchannel(5);
		sc.setbool(true);
		//sc.color = "레드";
		//sc.channel = 5;
		//sc.power = true;
		//System.out.println(sc.color);
		//System.out.println(sc.power);
		System.out.println(sc.getColor());
		System.out.println(sc.getchannel());
		System.out.println(sc.getbool());
		//System.out.println(sc.channel);
	}

}
