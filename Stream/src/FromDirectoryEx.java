import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryEx {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\TJ\\eclipse-workspace\\JAVAST\\Stream\\src");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()));
		// p - ���� ���丮 �Ǵ� ���Ͽ� �ش��ϴ� Path ��ü
		// p.getFileName() - ���� ���丮 �̸� or �����̸� ����
	}

}
