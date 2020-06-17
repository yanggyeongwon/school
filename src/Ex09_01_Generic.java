class Top<T>{
	private T data;
	public void setDate(T data){
		this.data = data;
	}
	public T getDate(){
		return data;
	}
}

public class Ex09_01_Generic {

	public static void main(String[] args) {
		Top<String> t1 = new Top<String>();
		t1.setDate("제네릭(String)  "+"Hello");
		System.out.println(t1.getDate());
		
		Top<Integer> t2 = new Top<Integer>();
		t2.setDate(123);
		System.out.println("제네릭(Integer)  "+t2.getDate());
		

	}

}
