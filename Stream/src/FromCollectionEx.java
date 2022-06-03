import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionEx {

	public static void main(String[] args) {
		List<Student> stList = Arrays.asList(
				new Student("全辨悼", 10),
				new Student("全辨鉴", 20),
				new Student("全寸公", 30)
				); 
		Stream<Student> stream = stList.stream();
		stream.forEach(s -> System.out.println(s.getName()));
		
	}
	
 }
