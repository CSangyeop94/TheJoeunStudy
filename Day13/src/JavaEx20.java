

public class JavaEx20 {
	
	public static void main(String[] args) {
		
		String str = "    j a v a    ";
		System.out.println("앞"+str+"뒤");
		System.out.println("앞"+str.trim()+"뒤");
		// .trim() 문자열 앞뒤의 공백을 제거한다.
		
		System.out.println("앞"+str.replace(" ", "")+"뒤");
		// .replace() target 부분을 
		// replacement 로 대치한 새로운 문자열을 리턴해준다.
		// replacement = 바꿔놓는다.
		// " " 공백을 ""으로 바꿔서 공백이 사라지는것
		
		int num1 = 1;
		
		// String str2 = String.valueOf(1);
		
		//String str2 = "" + 1;
		
		// 문자열 뒤에 숫자를 그냥 더해주면 문자열로 인식함
		// 문자열로 인식 시키지 않을려면 (소괄호) 를써서 먼저 연산해준후 붙여준다.
		String str2 = 1 + 2 + "3" + 4 + 5;
		// 결과 3 3 4 5 로 출력됨
		// 문자열앞은 계산이되서 3이 되었지만 3부터는 문자열로 인식되어 345가됨
		System.out.println(str2);
		
	}
}
