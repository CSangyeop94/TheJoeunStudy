import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentEx {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/linedata.txt");
		// ������ ��� ������ ������ �ִ� Path ��ü ����
		Stream<String> stream;
		
		// Files.lines() �޼ҵ� �̿�
		stream = Files.lines(path, Charset.defaultCharset());
		// �ü���� �⺻ ���ڼ�
		
		stream.forEach(System.out::println);
		// �޼ҵ� ����(s -> System.out.println(s)�� �������)
		System.out.println(); 
		
		// BufferedReader�� lines() �޼ҵ� �̿�
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out::println);
				

	}

}
