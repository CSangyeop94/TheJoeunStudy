package com.javateam.score.domain;

public class Ex10 {

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
	static float getTotalAvg(String subjectName, SubjectDTO[] subjectArr, int n) {
	
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

	public static void main(String[] args) {

		// 국/영/수 점수 : 0 ~ 100 분포
		
		/** 국어 */
		byte korean = -1; // 국어
		/** 영어 */
		byte english = -1; // 영어
		/** 수학 */
		byte math = -1; // 수학
		
		/* --------------- 다수 인원 수 입력 부 --------------- */
		
		// TODO
		// 1~10명까지 입력할 수 있도록 제한 조치
		// 예외 처리 메시지 : 1~10명 사이로 인원수를 입력하십시오. 
		// "exit"(대소문자 구분 없이 비교) 입력하면 분기/시스템 종료하도록 조치.
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
			
			// TODO
			// 1) 1~10 사이의 정수 문자열을 검증할 수 있는 정규표현식(regex)을 완성하십시오.
			// 정규식의 조건에 맞으면 반복문에서 분기하고(빠져 나가고)
			// 그렇지 않으면 "1~10명 사이로 인원수를 입력하십시오." 라는 
			// 메시지를 출력하도록 작성합니다.
			
		} // while (인원수 입력)
		
		int num = Integer.parseInt(str.trim());
		
		System.out.println("성적 입력 인원수 : " + num);
		
		/* -------------- 국/영/수 (입력부) ---------------- */
		
		// 국/영/수 과목에 대한 점수를 아래와 같이 한 줄로 입력할 수 있도록 조건과 같이 작성합니다.
		String subjects[] = null; // 과목들 배열
		
		// TODO
		// 2) 이미 작성된 성적 처리 자바빈(SubjectDTO)객체를 개별 요소로 하고 
		// 입력된 인원수를 크기로 하는 배열 변수 subjectArr을 작성하십시오.
		// : 다수 인원 성적을 담을 수 있는 배열 변수
		SubjectDTO[] subjectArr = new SubjectDTO[num];
		
		// TODO
		// 3) 인원수 만큼 반복 입력할 수 있도록 조치
		// hint) 인원수 관련 변수 및 for loop 활용
		
			System.out.println("\n----------------------------------------------------------\n");
		
			while (true) {
				
				System.out.print("국/영/수 과목 점수를 입력하십시오 : ");
				sc = new Scanner(System.in);
				str = sc.nextLine();
				
				if (str.trim().equalsIgnoreCase("exit")){
					
					System.out.println("입력을 종료합니다.");
					System.exit(0);
				} // 
				
				// 0~100 사이의 정수 문자열
				String intRange = "([0-9]|[1-9][0-9]|100)";
				String regex = intRange + "\\s{1,}" + intRange + "\\s{1,}" + intRange;
				
				if (Pattern.matches(regex, str.trim()) == false) {
					
					System.out.println("0~100사이의 정수값으로 3과목 점수들을 입력하십시오.");
					
				} else {
					
					subjects = str.trim().split("\\s{1,}");
					korean = Byte.parseByte(subjects[0]);
					english = Byte.parseByte(subjects[1]);
					math = Byte.parseByte(subjects[2]);
					break;
				} //
				
			} // while
			
			// 점수 현황 => DTO 대입(SubjectDTO.java)
			SubjectDTO subjectDTO = new SubjectDTO(korean, english, math);
			
			System.out.println();
			System.out.printf("국어 점수 : %d 점, ", subjectDTO.getKorean());
			System.out.printf("영어 점수 : %d 점, ", subjectDTO.getEnglish());
			System.out.printf("수학 점수 : %d 점\n", subjectDTO.getMath());
			System.out.println();
			
			/* -------------- 개별 총점 연산(계산) --------------  */

			subjectDTO.setSum(subjectDTO.getSum());
			
			/* -------------- 개별 평균 연산(계산) --------------  */
			
			// 소수점 2자리에서 반올림하여 평균 환산
			System.out.print("평균(소숫점 가공전) : " + subjectDTO.getAvg() + ", ");
			float avg = subjectDTO.getAvg(subjectDTO.getAvg(), 2);
			
			System.out.println("평균(소숫점 가공후) : " + avg);
			System.out.println();
			
			System.out.println(subjectDTO);
			
			// 개별 인원 성적 현황 추가
			subjectArr[i] = subjectDTO;
		
		sc.close();
		
		/* -------------- 전체 인원의 성적 개별 현황 인쇄 --------------  */
		
		System.out.println("\n--------------------- 전체 인원 개별 성적 현황 --------------------\n");
		
		// TODO
		// 4) 아래와 같은 형식으로 출력될 수 있도록 코드를 작성하십시오.
		// 출력 예시) 
		// 학생 개인 성적 현황 : 국어=70, 영어=80, 수학=100, 총점=250, 평균=83.3
		//
		// 					...(중략)...
		//
		// 학생 개인 성적 현황 : 국어=77, 영어=65, 수학=89, 총점=231, 평균=77.0
		
		
		/* -------------- 전체 인원의 성적 총괄 현황 인쇄 --------------  */
		
		System.out.println("\n--------------------- 전체 인원 성적 총괄 현황 --------------------\n");		
		
          		
		// TODO
		// 5) 클래스 내부에 제시된 getTotalAvg 메서드를 활용하여 각 과목의 평균을 아래와 같이 인쇄할 수 있도록
		// 코드를 작성하십시오.
		// 
		//--------------------- 전체 인원 성적 총괄 현황 --------------------
		//	
		//	전체 인원 국어 평균 : 78.3
		//	전체 인원 영어 평균 : 70.0
		//	전체 인원 수학 평균 : 94.7
		
		
	} //
}
