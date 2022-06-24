package com.javateam.score.util;

import java.util.ArrayList;
import java.util.Scanner;

import com.javateam.score.domain.SubjectDTO2;

public interface ScoreService {
	
	/**
	 * �л� �ο��� �Է�
	 * 
	 * @param sc Scanner ��ü
	 * @return �л� �ο���
	 */
	public int inputNum(Scanner sc);
	
	/**
	 * �л� ���� ��Ȳ �Է�/���
	 * 
	 * @param sc Scanner ��ü
	 * @param subjectList ���� ��Ȳ ����Ʈ
	 * @param num �л� �ο���
	 * @return (��� ó����) ���� ��Ȳ ����Ʈ
	 */
	public ArrayList<SubjectDTO2> inputScores(Scanner sc, ArrayList<SubjectDTO2> subjectList, int num);	
	
	/**
	 * 
	 * @param subjectList
	 */
	public void printScores(ArrayList<SubjectDTO2> subjectList);
	
	
	/**
	 * �л� ���� ��Ȳ ����
	 * 
	 * @param sc Scanner ��ü
	 * @param subjectList ���� ��Ȳ ����Ʈ
	 */
	public void sortScores(Scanner sc, ArrayList<SubjectDTO2> subjectList);
}