import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1Sub {

	public static void main(String[] args) { // throws Exception {
		
		// InputStream is = new FileInputStream("C:/Temp/test.txt");
		InputStream is = null;
		
		try {
			is = new FileInputStream("test.txt");
			int readByte;
			
			// 1)
			/*
			while(true) {
				readByte = is.read();
				if(readByte == -1) break;
				System.out.println((char)readByte);
			} */
			
			// 2)
			while ((readByte = is.read()) != -1) {
				System.out.println((char)readByte);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// is.close();
	}

}