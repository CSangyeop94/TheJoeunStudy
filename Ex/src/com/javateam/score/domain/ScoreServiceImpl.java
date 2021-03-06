package com.javateam.score.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.javateam.score.domain.SubjectDTO2;

@SuppressWarnings("resource")
public class ScoreServiceImpl implements ScoreService {
	
	/**
	 * 소숫점 n번째 자리에서 반올림하는 평균 환산
	 *  
	 * @param avg 평균
	 * @param n 반올림할 소숫점 n자리
	 * @return 반올림된 평균
	 */
	static float getRoundAvg(float avg, int n) {
		
		float power = (float)Math.pow(10, n-1); 
		return (float)Math.round(avg * power) / power;
	}
	
	/**
	 * 과목명을 입력하면 특정 과목에 대한 평균(소숫점 n자리에서 반올림한 평균)을 환산
	 *  
	 * @param subjectName 과목명 ex) 국어
	 * @param subjectArr ex) 전체 인원 성적 현황 배열 
	 * @param n 반올림할 소숫점 n자리
	 * @return 과목별 평균
	 */
	static float getTotalAvg(String subjectName, SubjectDTO2[] subjectArr, int n) {
	
		int totSum = 0;
		int num = subjectArr.length;
		
		for (int i = 0; i < num; i++) {
			
			if (subjectName.equals("국어"))
				totSum += subjectArr[i].getKorean();
			else if (subjectName.equals("영어"))
				totSum += subjectArr[i].getEnglish();
			else if (subjectName.equals("수학"))
				totSum += subjectArr[i].getMath();
		} //
		
		return getRoundAvg((float)totSum/num, n);
	}
	
	/**
	 * 과목명을 입력하면 특정 과목에 대한 평균(소숫점 n자리에서 반올림한 평균)을 환산
	 *  
	 * @param subjectName 과목명 ex) 국어
	 * @param subjectList ex) 전체 인원 성적 현황 리스트 
	 * @param n 반올림할 소숫점 n자리
	 * @return 과목별 평균
	 */
	static float getTotalAvg(String subjectName, List<SubjectDTO2> subjectList, int n) {
	
		int totSum = 0;
		int num = subjectList.size();
		
		for (int i = 0; i < num; i++) {
			
			if (subjectName.equals("국어"))
				totSum += subjectList.get(i).getKorean();
			else if (subjectName.equals("영어"))
				totSum += subjectList.get(i).getEnglish();
			else if (subjectName.equals("수학"))
				totSum += subjectList.get(i).getMath();
		} //
		
		return getRoundAvg((float)totSum/num, n);
	}

	@Override
	public int inputNum(Scanner sc) {

		String str;
		int result = 0; // 리턴값
		
		// TODO
		// 1) 기존의 코드를 참고하여 아래의 코드 부분를 완성하십시오.
		
		
		
		return result;
	} //
    @Override
	public ArrayList<SubjectDTO2> inputScores(Scanner sc, ArrayList<SubjectDTO2> subjectList, int num) {
		
		String str;
		String subjects[] = null; // 과목들 배열
		
		/** 학생 이름 */
		String name;
		/** 국어 */
		byte korean = -1; 
		/** 영어 */
		byte english = -1;
		/** 수학 */
		byte math = -1; 
		
		for (int i = 0; i < num; i++) {

			System.out.println("\n----------------------------------------------------------\n");
		
			while (true) {
				
				System.out.print("학생이름(한글)/국/영/수 과목 점수를 입력하십시오 : ");
				sc = new Scanner(System.in);
				str = sc.nextLine();
				
				if (str.trim().equalsIgnoreCase("exit")){
					
					System.out.println("입력을 종료합니다.");
					System.exit(0);
				} // 
				
				// 0~100 사이의 정수 문자열
				String intRange = "([0-9]|[1-9][0-9]|100)";
				
				// 학생 이름 정규식 추가 : 이름은 붙여서 쓰도록 유도
				String regexName = "([가-힣]{2,30})";
				
				String regex = regexName + "\\s{1,}" 
							 + intRange + "\\s{1,}" 
							 + intRange + "\\s{1,}" 
							 + intRange;
				
				if (Pattern.matches(regex, str.trim()) == false) {
					
					System.out.println("이름은 공백없이 한글로 입력하시고, 과목 점수들은 0~100사이의 정수값으로 입력하십시오.");
					
				} else {
					
					subjects = str.trim().split("\\s{1,}");
					
					// 이름 추가
					name = subjects[0];
					korean = Byte.parseByte(subjects[1]);
					english = Byte.parseByte(subjects[2]);
					math = Byte.parseByte(subjects[3]);
					break;
				} //
				
			} // while
			
			// 점수 현황 => DTO 대입(SubjectDTO2.java)
			SubjectDTO2 subjectDTO = new SubjectDTO2(name, korean, english, math);
			System.out.println();
			
			/* -------------- 개별 총점 연산(계산) --------------  */
	
			subjectDTO.setSum(subjectDTO.getSum());
			
			/* -------------- 개별 평균 연산(계산) --------------  */
			
			// 소수점 2자리에서 반올림하여 평균 환산
			//float avg = subjectDTO.getAvg(subjectDTO.getAvg(), 2);
			
			subjectDTO.getAvg(subjectDTO.getAvg(), 2);
			System.out.println(subjectDTO);
			
			// 개별 인원 성적 현황 추가
			subjectList.add(subjectDTO);
			
		} // for
		
		return subjectList;
	} //
	

	@Override
	public void printScores(ArrayList<SubjectDTO2> subjectList) {
		
		// TODO
		// 2) 기존의 코드를 참고하여 아래의 코드 부분를 완성하십시오.

		
	} //

    @Override
	public void sortScores(Scanner sc, ArrayList<SubjectDTO2> subjectList) {
			
		String str;
		
		// TODO
		// 3) 기존의 코드를 참고하여 아래의 코드 부분를 완성하십시오.
		
		
	} //

}