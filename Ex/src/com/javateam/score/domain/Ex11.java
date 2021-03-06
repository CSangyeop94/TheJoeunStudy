package com.javateam.score.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import com.javateam.score.domain.SubjectDTO2;
/**
 * 국영수 총점/평균 프로그램
 * 
 * @author javateam 
 * @since 2022.6.14
 * @version 0.5
 */
public class Ex11 {
	
	// TODO
	// 1) 주어진 URL 클래스 다이어그램과 결과물을 참조하여 SubjectDTO2 자바빈을 작성하십시오.
	
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
	
	// TODO
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
	
	// TODO
	/**
	 * 과목명을 입력하면 특정 과목에 대한 평균(소숫점 n자리에서 반올림한 평균)을 환산
	 *  
	 * @param subjectName 과목명 ex) 국어
	 * @param subjectList ex) 전체 인원 성적 현황 리스트 
	 * @param n 반올림할 소숫점 n자리
	 * @return 과목별 평균
	 */
	static float getTotalAvg(String subjectName, List<SubjectDTO2> subjectList, int n) {
	
		// TODO
		// 2) 위에서 먼저 언급된  getTotalAvg(String subjectName, SubjectDTO2[] subjectArr, int n)
		// 메서드를 참조하여 동일한 기능을 하는 봄 메서드의 구문을 완성하십시오.
		
	}

	public static void main(String[] args) {

		// 국/영/수 점수 : 0 ~ 100 분포
		
		// TODO
		/** 학생 이름 : 추가 */
		String name = "";
		/** 국어 */
		byte korean = -1; // 국어
		/** 영어 */
		byte english = -1; // 영어
		/** 수학 */
		byte math = -1; // 수학
		
		/* --------------- 다수 인원 수 입력 부 --------------- */
		
		Scanner sc = null;
		String str;
		
		while (true) {
			
			System.out.print("성적을 입력할 인원수를 입력하십시오 : ");
			sc = new Scanner(System.in);
			str = sc.nextLine();
			
			if (str.trim().equalsIgnoreCase("exit")){
				
				System.out.println("입력을 종료합니다.");
				System.exit(0);
			} // 
			
			String regex = "([1-9]|10)";
			
			if (Pattern.matches(regex, str.trim()) == false) {
				
				System.out.println("1~10명 사이로 인원수를 입력하십시오.");
				
			} else {
				
				break;
			} //
			
		} // while (인원수 입력)
		
		int num = Integer.parseInt(str.trim());
		
		System.out.println("성적 입력 인원수 : " + num);
		
		/* -------------- 국/영/수 (입력부) ---------------- */
		
		String subjects[] = null; // 과목들 배열
		
		// TODO
		// 3) 아래의 기존의 과목 성적 현황 배열(subjectArr)을 배열과 동일한 요소를 가지면서 
		// ArrayList 컬렉션을 자료형으로 가지는 subjectList 변수로 대체하십시오.
		// 
		SubjectDTO2[] subjectArr = new SubjectDTO2[num];
		
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
				
				
				// 정규식, 메시지 수정
				// 오류 메시지 : 이름은 공백없이 한글로 입력하시고, 과목 점수들은 0~100사이의 정수값으로 입력하십시오.
				
				// 0~100 사이의 정수 문자열
				String intRange = "([0-9]|[1-9][0-9]|100)";
				
				// 학생 이름 정규식 추가 : 이름은 붙여서 쓰도록 유도
				String regexName = "([가-힣]{2,30})";

				// TODO
				// 4) 학생 이름을 과목 점수와 같이 입력받고 점검할 수 있도록 정규식을 수정하십시오. 
				String regex = intRange + "\\s{1,}" + intRange + "\\s{1,}" + intRange;
				
				if (Pattern.matches(regex, str.trim()) == false) {
					
					System.out.println("이름은 공백없이 한글로 입력하시고, 과목 점수들은 0~100사이의 정수값으로 입력하십시오.");
					
				} else {
					
					subjects = str.trim().split("\\s{1,}");
					
					// 이름 추가
					name = subjects[0];
					
					// TODO
					// 과목 인덱스(index) 교정
					korean = Byte.parseByte(subjects[1]);
					english = Byte.parseByte(subjects[2]);
					math = Byte.parseByte(subjects[3]);
					break;
				} //
				
			} // while
			
			// 점수 현황 => DTO 대입(SubjectDTO2.java)
			SubjectDTO2 subjectDTO = new SubjectDTO2(name, korean, english, math);
			
//			System.out.println();
//			System.out.printf("국어 점수 : %d 점, ", subjectDTO.getKorean());
//			System.out.printf("영어 점수 : %d 점, ", subjectDTO.getEnglish());
//			System.out.printf("수학 점수 : %d 점\n", subjectDTO.getMath());
			System.out.println();
			
			/* -------------- 개별 총점 연산(계산) --------------  */

			subjectDTO.setSum(subjectDTO.getSum());
			
			/* -------------- 개별 평균 연산(계산) --------------  */
			
			// 소수점 2자리에서 반올림하여 평균 환산
			// System.out.print("평균(소숫점 가공전) : " + subjectDTO.getAvg() + ", ");
			float avg = subjectDTO.getAvg(subjectDTO.getAvg(), 2);
			
			// System.out.println("평균(소숫점 가공후) : " + avg);
			// System.out.println();
			
			System.out.println(subjectDTO);
		
            // 개별 인원 성적 현황 추가
			// TODO
			// 5) 기존의 배열에 개인 성적 현황을 추가하는 부분을 
			// 성적 현황 리스트에 개별 인원 성적 현황을 추가하는 코드로 대체하십시오.
			subjectArr[i] = subjectDTO;
			
		} // for	
		
		sc.close();
		
		/* -------------- 전체 인원의 성적 개별 현황 인쇄 --------------  */
		
		System.out.println("\n--------------------- 전체 인원 개별 성적 현황 --------------------\n");
		
		// TODO
		// 6) 개별 성적 리스트를 나열할 수 있도록 수정합니다.
		for (SubjectDTO subjectDTO : subjectArr) {
			
			System.out.println(subjectDTO);
			
		} //
		
		/* -------------- 전체 인원의 성적 총괄 현황 인쇄 --------------  */
		
		System.out.println("\n--------------------- 전체 인원 성적 총괄 현황 --------------------\n");
		
		// TODO
		// 7) 위에서 얻어진 성적 현황 리스트를 활용하여 각 과목의 점수를 출력할 수 있도록 코드를 수정합니다.  
		float totKoreanAvg = getTotalAvg("국어", subjectArr, 2);
		float totEnglishAvg = getTotalAvg("영어", subjectArr, 2);
		float totMathAvg = getTotalAvg("수학", subjectArr, 2);
		
		System.out.println("전체 인원 국어 평균 : " + totKoreanAvg);
		System.out.println("전체 인원 영어 평균 : " + totEnglishAvg);
		System.out.println("전체 인원 수학 평균 : " + totMathAvg);
	} //

}