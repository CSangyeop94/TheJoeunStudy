import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionEx {

	public static void main(String[] args) {
		List<Student> stList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("ȫ���", 20),
				new Student("ȫ�繫", 30)
				); 
		Stream<Student> stream = stList.stream();
		stream.forEach(s -> System.out.println(s.getName()));
		
	}
	
 }
