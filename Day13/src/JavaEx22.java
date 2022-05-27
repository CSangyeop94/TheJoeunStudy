

public class JavaEx22 {
	
	public static void main(String[] args) {
		
		String str = "가나다라1234\\d";
		
		System.out.println(str.replaceAll("\\d", ""));
		System.out.println(str.replace("\\d", ""));
		// \\d = 숫자열 replaceAll 은 n을 m으로 바꾸라는말
		// 결과는 숫자가 사라져서 가나다라 출력
	
		
	}
}
