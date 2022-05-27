import java.util.Arrays;

public class JavaEx23 {
	
	public static void main(String[] args) {
		
		int a;
		// String str[] = new String[5];
		String strArr[] = {"java", "python", "자바", "파이썬",};
		float arr[] = new float[5];
		
		// String 의 초기값은 null
		
		// Arrays.fill(strArr, "jsp");
		// Arrays.fill 배열의 값을 초기화 해준다.
			
		Arrays.sort(strArr, 0, strArr.length-1);
		
		// 오름차순 정렬(ascending sort(order))
		for(String s : strArr) {
			System.out.println(s);
		}
		
		
	}
}
