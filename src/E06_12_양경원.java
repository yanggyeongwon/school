	interface Camera{
		public void takePhoto();
	}
	interface MP3{
		public void playMp3();
	}
	interface DMB{
		public void viewTv();
	}	
	class Phone{
		private int size;
		private String color;
		
		public void Phone(final int size, final String color){
			this.size = size;
			this.color = color;
		}
		public void show(){
			System.out.println(size+","+color);
		}
	}
	
	class Phone_a extends Phone implements Camera,MP3,DMB{

		public Phone_a(int size, String color) {
			super.Phone(size, color);
		}
		public void show(int size,String color) {
			super.show();
		}

		@Override
		public void viewTv() {		
			System.out.println("tv��û");
		}

		@Override
		public void playMp3() {		
			System.out.println("���ǰ���");
		}

		@Override
		public void takePhoto() {
			System.out.println("�������");
		}

		
	}
public class E06_12_���� {

	public static void main(String[] args) {
		Phone_a ph = new Phone_a(7,"blue");
		ph.viewTv();
		ph.playMp3();
		ph.takePhoto();
		ph.show();
	}

}
