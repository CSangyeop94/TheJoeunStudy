package com.javateam.score.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("��ǻ��", "���콺", "Ű����"));

		/*
		 * list.sort(new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { 
		 * return o1.compareTo(o2);
		 * // ���� ���� } });
		 * 
		 * list.sort(Comparator.naturalOrder()); 
		 * list.sort(Comparator.reverseOrder());
		 */
		list.forEach(x -> System.out.println(x));

		// ���ٽ� ������ �ϴ°� ����
		list.sort((o1, o2) -> {
			return o1.compareTo(o2);
			// o2.compareTo(o1)
			// �߰�ȣ�� ���� return�������
		}

		);
		list.forEach(x -> System.out.println(x));
	}

}
