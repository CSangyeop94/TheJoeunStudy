package com.javateam.score.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("컴퓨터", "마우스", "키보드"));

		/*
		 * list.sort(new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { 
		 * return o1.compareTo(o2);
		 * // 문자 정렬 } });
		 * 
		 * list.sort(Comparator.naturalOrder()); 
		 * list.sort(Comparator.reverseOrder());
		 */
		list.forEach(x -> System.out.println(x));

		// 람다식 위에랑 하는건 같음
		list.sort((o1, o2) -> {
			return o1.compareTo(o2);
			// o2.compareTo(o1)
			// 중괄호가 들어가면 return해줘야함
		}

		);
		list.forEach(x -> System.out.println(x));
	}

}
