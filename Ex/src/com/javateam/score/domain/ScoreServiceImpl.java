package com.javateam.score.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.javateam.score.domain.SubjectDTO2;

@SuppressWarnings("resource")
public class ScoreServiceImpl implements ScoreService {
	
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
	
	/**
	 * ������� �Է��ϸ� Ư�� ���� ���� ���(�Ҽ��� n�ڸ����� �ݿø��� ���)�� ȯ��
	 *  
	 * @param subjectName ����� ex) ����
	 * @param subjectList ex) ��ü �ο� ���� ��Ȳ ����Ʈ 
	 * @param n �ݿø��� �Ҽ��� n�ڸ�
	 * @return ���� ���
	 */
	static float getTotalAvg(String subjectName, List<SubjectDTO2> subjectList, int n) {
	
		int totSum = 0;
		int num = subjectList.size();
		
		for (int i = 0; i < num; i++) {
			
			if (subjectName.equals("����"))
				totSum += subjectList.get(i).getKorean();
			else if (subjectName.equals("����"))
				totSum += subjectList.get(i).getEnglish();
			else if (subjectName.equals("����"))
				totSum += subjectList.get(i).getMath();
		} //
		
		return getRoundAvg((float)totSum/num, n);
	}

	@Override
	public int inputNum(Scanner sc) {

		String str;
		int result = 0; // ���ϰ�
		
		// TODO
		// 1) ������ �ڵ带 �����Ͽ� �Ʒ��� �ڵ� �κи� �ϼ��Ͻʽÿ�.
		
		
		
		return result;
	} //
    @Override
	public ArrayList<SubjectDTO2> inputScores(Scanner sc, ArrayList<SubjectDTO2> subjectList, int num) {
		
		String str;
		String subjects[] = null; // ����� �迭
		
		/** �л� �̸� */
		String name;
		/** ���� */
		byte korean = -1; 
		/** ���� */
		byte english = -1;
		/** ���� */
		byte math = -1; 
		
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
				
				// 0~100 ������ ���� ���ڿ�
				String intRange = "([0-9]|[1-9][0-9]|100)";
				
				// �л� �̸� ���Խ� �߰� : �̸��� �ٿ��� ������ ����
				String regexName = "([��-�R]{2,30})";
				
				String regex = regexName + "\\s{1,}" 
							 + intRange + "\\s{1,}" 
							 + intRange + "\\s{1,}" 
							 + intRange;
				
				if (Pattern.matches(regex, str.trim()) == false) {
					
					System.out.println("�̸��� ������� �ѱ۷� �Է��Ͻð�, ���� �������� 0~100������ ���������� �Է��Ͻʽÿ�.");
					
				} else {
					
					subjects = str.trim().split("\\s{1,}");
					
					// �̸� �߰�
					name = subjects[0];
					korean = Byte.parseByte(subjects[1]);
					english = Byte.parseByte(subjects[2]);
					math = Byte.parseByte(subjects[3]);
					break;
				} //
				
			} // while
			
			// ���� ��Ȳ => DTO ����(SubjectDTO2.java)
			SubjectDTO2 subjectDTO = new SubjectDTO2(name, korean, english, math);
			System.out.println();
			
			/* -------------- ���� ���� ����(���) --------------  */
	
			subjectDTO.setSum(subjectDTO.getSum());
			
			/* -------------- ���� ��� ����(���) --------------  */
			
			// �Ҽ��� 2�ڸ����� �ݿø��Ͽ� ��� ȯ��
			//float avg = subjectDTO.getAvg(subjectDTO.getAvg(), 2);
			
			subjectDTO.getAvg(subjectDTO.getAvg(), 2);
			System.out.println(subjectDTO);
			
			// ���� �ο� ���� ��Ȳ �߰�
			subjectList.add(subjectDTO);
			
		} // for
		
		return subjectList;
	} //
	

	@Override
	public void printScores(ArrayList<SubjectDTO2> subjectList) {
		
		// TODO
		// 2) ������ �ڵ带 �����Ͽ� �Ʒ��� �ڵ� �κи� �ϼ��Ͻʽÿ�.

		
	} //

    @Override
	public void sortScores(Scanner sc, ArrayList<SubjectDTO2> subjectList) {
			
		String str;
		
		// TODO
		// 3) ������ �ڵ带 �����Ͽ� �Ʒ��� �ڵ� �κи� �ϼ��Ͻʽÿ�.
		
		
	} //

}