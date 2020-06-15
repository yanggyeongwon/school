class Car_c{
	CarInfo info;
	String color;
	
	class CarInfo{
		String model;
		int year;
		CarInfo(String model,int year){
			this.model = model;
			this.year = year;
		}
		
		public void CarInfoPrint() {
			System.out.println(model +","+ year);
		}
	}
	Car_c(String model,int year, String color){
		info = new CarInfo(model,year);
		this.color = color;
		
	}
	public void CarPrint() {
		System.out.println(info.model+","+info.year+","+color);
	}
}

public class Ex07_01_inner {

	public static void main(String[] args) {
		

	}

}
