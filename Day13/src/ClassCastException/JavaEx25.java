package ClassCastException;

public class JavaEx25 {
	public static void main(String[] args) {

		// float result = 251 /3; // 83
		float result = (float) 251 / 3F; // 83.666664

		System.out.println("result : " + result);

		// 반올림(round) 소수점 한자리 = 10의 1승
		float roundResult = (float) Math.round(result * 10) / 10;
		// *10 /10 을 하는이유가 소숫점 에서 반올림하고싶어서.
		// 빼면 값이 84가 나오고 안빼면 83.7이나옴
		System.out.println("result : " + roundResult);

		// 반올림(round) 소수점 한자리 = 10의 2승
		float roundResult2 = (float) Math.round(result * 100) / 100;
		System.out.println("result : " + roundResult2);
		// result : 83.67

		// 반올림(round) 소수점 한자리 = 10의 3승
		float roundResult3 = (float) Math.round(result * 1000) / 1000;
		System.out.println("result : " + roundResult3);
		// result : 83.667
	}
}
