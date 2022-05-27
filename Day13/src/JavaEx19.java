
public class JavaEx19 {

	public static void main(String[] args) {
		String str = "java developer";
		String str1 = "자바 개발자";
		
		byte[] byteArr = str1.getBytes();
		
		for (byte b : byteArr) {
			System.out.println(b + " ");
			System.out.println((char)b + " ");
		}
		// String str1 = "자바 개발자"; 오류 나는이유
		// 한글은 한글자당 2byte라서
		// 2byte -> 1byte : 한글 손실
		// 영문 : 'a' = 97 => '\u0061' : 1byte로 치환되어 값 손실 없음
		
		
		// 문자열 => 문자의 배열 치환
		char []chArr = str.toCharArray();
		// 배열을 char배열로 바꾸는 메서드
		// chArr 배열에 String str = "java developer"; 값을넣음
		
		// String str = "java developer";
		for(char ch : chArr)System.out.print(ch + " ");
		// j a v a   d e v e l o p e r 출력 
		// 문자열에서 chArr 배열에서 값을 나열함
		System.out.println();
		
		// charAt (int index) = 특정 위치의 문자를 반환함
		// 문자열의 길이만큼 돌아가는데 문자열 특정위치의 문자를 순서대로 반환하니
		//  j a v a   d e v e l o p e r 출력할것임
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+ " ");
			// j a v a   d e v e l o p e r  출력
		}
		System.out.println();
		System.out.print(str.substring(0, 6) + " ");
		// .substring 문자열을 추출 공백도 문자열로 침
		// (0, 6) = 6번 문자열 까지 추출을 의미
		
		char []  chArr2
		= str.substring(0, 3).toCharArray();
		
		System.out.println();
	
		for (char ch : chArr2) {
			System.out.print((int)ch + " ");
		}
		// 문자를 정수로 형변환해서 출력 값은 아스키 코드 참조
		
	}
}
