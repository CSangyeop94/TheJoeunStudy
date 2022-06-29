
public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");

		String str = sb.toString();
		System.out.println(str);

		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		// sb2 에있는 변수를 저장하고
		// sb3 은 this가 저장
		if (sb2 == sb3) {
			System.out.println("sb2 == sb3");
		}

		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
	}

}
