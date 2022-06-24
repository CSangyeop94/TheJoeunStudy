package com.javateam.score.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import com.javateam.score.domain.SubjectDTO2;
/**
 * ������ ����/��� ���α׷�
 * 
 * @author javateam 
 * @since 2022.6.14
 * @version 0.5
 */
public class Ex11 {
	
	// TODO
	// 1) �־��� URL Ŭ���� ���̾�׷��� ������� �����Ͽ� SubjectDTO2 �ڹٺ��� �ۼ��Ͻʽÿ�.
	
	/**
	 * �Ҽ��� n��° �ڸ����� �ݿø��ϴ� ��� ȯ��
	 *  
	 * @param avg ���
	 * @param n �ݿø��� �Ҽ��� n�ڸ�
	 * @return �ݿø��� ���
	 */
	static float getRoundAvg(float avg, int n) {
		
		float power = (float)Math.pow(10, n-1); 
		return (float)Math.round(avg * power) / power;
	}
	
	// TODO
	/**
	 * ������� �Է��ϸ� Ư�� ���� ���� ���(�Ҽ��� n�ڸ����� �ݿø��� ���)�� ȯ��
	 *  
	 * @param subjectName ����� ex) ����
	 * @param subjectArr ex) ��ü �ο� ���� ��Ȳ �迭 
	 * @param n �ݿø��� �Ҽ��� n�ڸ�
	 * @return ���� ���
	 */
	static float getTotalAvg(String subjectName, SubjectDTO2[] subjectArr, int n) {
	
		int totSum = 0;
		int num = subjectArr.length;
		
		for (int i = 0; i < num; i++) {
			
			if (subjectName.equals("����"))
				totSum += subjectArr[i].getKorean();
			else if (subjectName.equals("����"))
				totSum += subjectArr[i].getEnglish();
			else if (subjectName.equals("����"))
				totSum += subjectArr[i].getMath();
		} //
		
		return getRoundAvg((float)totSum/num, n);
	}
	
	// TODO
	/**
	 * ������� �Է��ϸ� Ư�� ���� ���� ���(�Ҽ��� n�ڸ����� �ݿø��� ���)�� ȯ��
	 *  
	 * @param subjectName ����� ex) ����
	 * @param subjectList ex) ��ü �ο� ���� ��Ȳ ����Ʈ 
	 * @param n �ݿø��� �Ҽ��� n�ڸ�
	 * @return ���� ���
	 */
	static float getTotalAvg(String subjectName, List<SubjectDTO2> subjectList, int n) {
	
		// TODO
		// 2) ������ ���� ��޵�  getTotalAvg(String subjectName, SubjectDTO2[] subjectArr, int n)
		// �޼��带 �����Ͽ� ������ ����� �ϴ� �� �޼����� ������ �ϼ��Ͻʽÿ�.
		
	}

	public static void main(String[] args) {

		// ��/��/�� ���� : 0 ~ 100 ����
		
		// TODO
		/** �л� �̸� : �߰� */
		String name = "";
		/** ���� */
		byte korean = -1; // ����
		/** ���� */
		byte english = -1; // ����
		/** ���� */
		byte math = -1; // ����
		
		/* --------------- �ټ� �ο� �� �Է� �� --------------- */
		
		Scanner sc = null;
		String str;
		
		while (true) {
			
			System.out.print("������ �Է��� �ο����� �Է��Ͻʽÿ� : ");
			sc = new Scanner(System.in);
			str = sc.nextLine();
			
			if (str.trim().equalsIgnoreCase("exit")){
				
				System.out.println("�Է��� �����մϴ�.");
				System.exit(0);
			} // 
			
			String regex = "([1-9]|10)";
			
			if (Pattern.matches(regex, str.trim()) == false) {
				
				System.out.println("1~10�� ���̷� �ο����� �Է��Ͻʽÿ�.");
				
			} else {
				
				break;
			} //
			
		} // while (�ο��� �Է�)
		
		int num = Integer.parseInt(str.trim());
		
		System.out.println("���� �Է� �ο��� : " + num);
		
		/* -------------- ��/��/�� (�Էº�) ---------------- */
		
		String subjects[] = null; // ����� �迭
		
		// TODO
		// 3) �Ʒ��� ������ ���� ���� ��Ȳ �迭(subjectArr)�� �迭�� ������ ��Ҹ� �����鼭 
		// ArrayList �÷����� �ڷ������� ������ subjectList ������ ��ü�Ͻʽÿ�.
		// 
		SubjectDTO2[] subjectArr = new SubjectDTO2[num];
		
		for (int i = 0; i < num; i++) {

			System.out.println("\n----------------------------------------------------------\n");
		
			while (true) {
				
				System.out.print("�л��̸�(�ѱ�)/��/��/�� ���� ������ �Է��Ͻʽÿ� : ");
				sc = new Scanner(System.in);
				str = sc.nextLine();
				
				if (str.trim().equalsIgnoreCase("exit")){
					
					System.out.println("�Է��� �����մϴ�.");
					System.exit(0);
				} // 
				
				
				// ���Խ�, �޽��� ����
				// ���� �޽��� : �̸��� ������� �ѱ۷� �Է��Ͻð�, ���� �������� 0~100������ ���������� �Է��Ͻʽÿ�.
				
				// 0~100 ������ ���� ���ڿ�
				String intRange = "([0-9]|[1-9][0-9]|100)";
				
				// �л� �̸� ���Խ� �߰� : �̸��� �ٿ��� ������ ����
				String regexName = "([��-�R]{2,30})";

				// TODO
				// 4) �л� �̸��� ���� ������ ���� �Է¹ް� ������ �� �ֵ��� ���Խ��� �����Ͻʽÿ�. 
				String regex = intRange + "\\s{1,}" + intRange + "\\s{1,}" + intRange;
				
				if (Pattern.matches(regex, str.trim()) == false) {
					
					System.out.println("�̸��� ������� �ѱ۷� �Է��Ͻð�, ���� �������� 0~100������ ���������� �Է��Ͻʽÿ�.");
					
				} else {
					
					subjects = str.trim().split("\\s{1,}");
					
					// �̸� �߰�
					name = subjects[0];
					
					// TODO
					// ���� �ε���(index) ����
					korean = Byte.parseByte(subjects[1]);
					english = Byte.parseByte(subjects[2]);
					math = Byte.parseByte(subjects[3]);
					break;
				} //
				
			} // while
			
			// ���� ��Ȳ => DTO ����(SubjectDTO2.java)
			SubjectDTO2 subjectDTO = new SubjectDTO2(name, korean, english, math);
			
//			System.out.println();
//			System.out.printf("���� ���� : %d ��, ", subjectDTO.getKorean());
//			System.out.printf("���� ���� : %d ��, ", subjectDTO.getEnglish());
//			System.out.printf("���� ���� : %d ��\n", subjectDTO.getMath());
			System.out.println();
			
			/* -------------- ���� ���� ����(���) --------------  */

			subjectDTO.setSum(subjectDTO.getSum());
			
			/* -------------- ���� ��� ����(���) --------------  */
			
			// �Ҽ��� 2�ڸ����� �ݿø��Ͽ� ��� ȯ��
			// System.out.print("���(�Ҽ��� ������) : " + subjectDTO.getAvg() + ", ");
			float avg = subjectDTO.getAvg(subjectDTO.getAvg(), 2);
			
			// System.out.println("���(�Ҽ��� ������) : " + avg);
			// System.out.println();
			
			System.out.println(subjectDTO);
		
            // ���� �ο� ���� ��Ȳ �߰�
			// TODO
			// 5) ������ �迭�� ���� ���� ��Ȳ�� �߰��ϴ� �κ��� 
			// ���� ��Ȳ ����Ʈ�� ���� �ο� ���� ��Ȳ�� �߰��ϴ� �ڵ�� ��ü�Ͻʽÿ�.
			subjectArr[i] = subjectDTO;
			
		} // for	
		
		sc.close();
		
		/* -------------- ��ü �ο��� ���� ���� ��Ȳ �μ� --------------  */
		
		System.out.println("\n--------------------- ��ü �ο� ���� ���� ��Ȳ --------------------\n");
		
		// TODO
		// 6) ���� ���� ����Ʈ�� ������ �� �ֵ��� �����մϴ�.
		for (SubjectDTO subjectDTO : subjectArr) {
			
			System.out.println(subjectDTO);
			
		} //
		
		/* -------------- ��ü �ο��� ���� �Ѱ� ��Ȳ �μ� --------------  */
		
		System.out.println("\n--------------------- ��ü �ο� ���� �Ѱ� ��Ȳ --------------------\n");
		
		// TODO
		// 7) ������ ����� ���� ��Ȳ ����Ʈ�� Ȱ���Ͽ� �� ������ ������ ����� �� �ֵ��� �ڵ带 �����մϴ�.  
		float totKoreanAvg = getTotalAvg("����", subjectArr, 2);
		float totEnglishAvg = getTotalAvg("����", subjectArr, 2);
		float totMathAvg = getTotalAvg("����", subjectArr, 2);
		
		System.out.println("��ü �ο� ���� ��� : " + totKoreanAvg);
		System.out.println("��ü �ο� ���� ��� : " + totEnglishAvg);
		System.out.println("��ü �ο� ���� ��� : " + totMathAvg);
	} //

}