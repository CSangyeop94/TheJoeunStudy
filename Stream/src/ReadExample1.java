import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		
		 InputStream is = new FileInputStream("C:/Temp/test.txt");
		//InputStream is = new FileInputStream("test.txt");
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
		
		is.close();
	}

}
