package Ex00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaEx40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		String [] arr = {"나연","다현","사나","채영",
				"지효","쯔위","모모","정연","미나"};
		list.addAll(Arrays.asList(arr));
		// 리스트화

		list.stream().filter(t -> t.contains("나")) // "나"가들어간 데이터
		.sorted(Comparator.reverseOrder()) // 리스트에서 역순으로 가져옴
		.limit(2) // 2개 들고오기
		//.forEach(x -> System.out.println(x + " "));
		.forEach(System.out::println);
		// 요청 순서에 따라 값이 달라질것임
		
	}

}
