import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayEx {

	public static void main(String[] args) {
		
		String[] strArray = {"全辨悼","全辨鉴","全寸公"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.println(a + ","));
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.print(a + "."));
		System.out.println();
	}
	
 }
