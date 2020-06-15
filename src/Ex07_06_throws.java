
public class Ex07_06_throws {
	private static void call() {
		
		try {
			int i= 1/0;
		} catch (Exception e) {
			System.out.println("call(): "+e.toString());
			throw e;//사용자의 에러발생을 main이나 원하는 곳으로 넘김
		}
		return;
	}
	
	private static void call2() throws Exception {
		int i = 1/0;
		
	}

	public static void main(String[] args) {//예외넘기기 throws
		try {
			//call();
			call2();
			System.out.println("정상 실행");
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("처리중 에러발생");
			
		}

	}


	


}
