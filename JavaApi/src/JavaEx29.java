import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaEx29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArr = { "±è¹ä", "ÄÅ¶ó¸é", "µµ½Ã¶ô", "ÇÖµµ±×", "Ä¡Å²Á¶°¢", "¿ìÀ¯", "ÄÅ¹ä", "À½·á¼ö" };
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(strArr));
		
		// ¹è¿­·Î Ä¡È¯
		String[] strArr2 = new String[list.size()];
		
		// strArr2 = (String[])list.toArray(); (x)
		strArr2 = list.toArray(strArr); // (o)
		
		System.out.println(strArr2[0]);
		
		for(String s : strArr2) {
			System.out.print(s + " ");
		}
	}

}
