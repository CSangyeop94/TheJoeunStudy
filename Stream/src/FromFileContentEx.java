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
		// 파일의 경로 정보를 가지고 있는 Path 객체 생성
		Stream<String> stream;
		
		// Files.lines() 메소드 이용
		stream = Files.lines(path, Charset.defaultCharset());
		// 운영체제의 기본 문자셋
		
		stream.forEach(System.out::println);
		// 메소드 참조(s -> System.out.println(s)와 같은방법)
		System.out.println(); 
		
		// BufferedReader의 lines() 메소드 이용
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out::println);
				

	}

}
