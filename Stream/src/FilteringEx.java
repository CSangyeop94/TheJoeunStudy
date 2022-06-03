import java.util.Arrays;
import java.util.List;

import jdk.internal.joptsimple.internal.Strings;

public class FilteringEx {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("È«±æµ¿ ","È«±æ¼ø ","±è»ó½Ä ","È«»ï ","±èÆÇÈ£ ","È«±æµ¿ ");
		System.out.println();
		
		name.stream().distinct() //Áßº¹À» Á¦°ÅÇÑ´Ù
		.forEach(x -> System.out.println(x));
		System.out.println();
		
		name.stream() // ÇÊÅÍ¸µ
		.filter(x -> x.startsWith("È«"))
		.forEach(x -> System.out.println(x));
		System.out.println();
		
		name.stream()
		.distinct() // Áßº¹À» Á¦°ÅÇÏ°í ÇÊÅÍ¸µ ÇØÁØ´Ù.
		.filter(x -> x.startsWith("È«"))
		.forEach(x -> System.out.println(x));
		
		
	

	}

}
