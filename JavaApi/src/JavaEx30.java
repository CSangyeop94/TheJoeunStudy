import java.util.ArrayList;
import java.util.Arrays;

public class JavaEx30 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		long before = System.currentTimeMillis();
		System.out.println("before : " + before);
		
		list.addAll(Arrays.asList("JAVA","JavaScript","Phyton","C#"));
		
		for(int i=0; i<10000; i++) {
			list.add(1, "C++");
			}
		long after = System.currentTimeMillis();
		System.out.println("after : " + after);
		
		System.out.println("processing time : " + (after-before));
	}
	
}
