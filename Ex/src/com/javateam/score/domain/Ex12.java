package com.javateam.score.domain;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * ������ ����/��� ���α׷�
 * 
 * @author javateam 
 * @since 2022.6.14
 * @version 1.0
 */
public class Ex12 {
	
	public static void main(String[] args) { 

		/* --------------- �л� �ο��� �Էº� --------------- */
		
		Scanner sc = new Scanner(System.in); // null ���� ��ġ
		ScoreService scoreSvc = new ScoreServiceImpl();
		
		int num = scoreSvc.inputNum(sc);
		System.out.println("���� �Է� �ο��� : " + num);
		
		/* -------------- ��/��/�� ���� �Էº� ---------------- */
		
		ArrayList<SubjectDTO2> subjectList = new ArrayList<>();
		subjectList = scoreSvc.inputScores(sc, subjectList, num);
			
		/* -------------- ��ü �ο��� ���� ���� ��Ȳ �μ� --------------  */
		
		System.out.println("\n--------------------- ��ü �ο� ���� ���� ��Ȳ --------------------\n");
		
		subjectList.forEach(x->System.out.println(x));
		
		/* -------------- ��ü �ο��� ���� �Ѱ� ��Ȳ �μ� --------------  */
		
		System.out.println("\n--------------------- ��ü �ο� ���� �Ѱ� ��Ȳ --------------------\n");
		
		scoreSvc.printScores(subjectList);
		
		System.out.println("\n-------------- ��ü �ο� ���� ��Ȳ ���� ������ ���� -----------------\n");
		
		scoreSvc.sortScores(sc, subjectList);
		
		sc.close();
	} //

}
