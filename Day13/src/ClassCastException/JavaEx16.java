package ClassCastException;

public class JavaEx16 {
	public static void main(String[] args) {
		
		// System.getProperties()
	    // .forEach((k,v) -> System.out.println(k+"="+v) );
		// System.setProperty("java.version", "1.8");
		// �ý��� �Ӽ� : 
		
		System.out.println(System.getProperty("java.version"));
		
		System.setProperty("academy", "thejoeun");
		System.out.println(System.getProperty("academy"));
	}
}
