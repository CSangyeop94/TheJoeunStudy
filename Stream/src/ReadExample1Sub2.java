import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1Sub2 {

	public static void main(String[] args) { // throws Exception {
		
		// InputStream is= new FileInputStream("test.txt"); // Java 9
		// try (is) { // Java 9
		
		try (InputStream is= new FileInputStream("test.txt")) {
		
			int readByte;
			
			while ((readByte = is.read()) != -1) {
				System.out.println((char)readByte);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}