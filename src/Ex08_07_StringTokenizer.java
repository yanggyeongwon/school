import java.util.StringTokenizer;

public class Ex08_07_StringTokenizer {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("2020/6|16,15:45",",/:");
		int cont;
		cont = st.countTokens();
		System.out.println("cont : "+cont);
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println("s :"+s);
		}
	}

}
