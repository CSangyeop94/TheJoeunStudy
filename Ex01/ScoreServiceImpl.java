package com.javateam.score.util;

import java.awt.TextField;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
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
				
				result = Integer.parseInt(str.trim());
				break;
			} //
			
		} // while (인원수 입력)
		
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
	public SubjectDTO2 inputScore(TextField tf, String scoresStr) {
		
		String subjects[] = null; // 과목들 배열
		SubjectDTO2 subjectDTO = null;
		
		/** 학생 이름 */
		String name;
		/** 국어 */
		byte korean = -1; 
		/** 영어 */
		byte english = -1;
		/** 수학 */
		byte math = -1; 
		
		while (true) {
			
			if (scoresStr.trim().equalsIgnoreCase("exit")){
				
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
			
			if (Pattern.matches(regex, scoresStr.trim()) == false) {
				
				System.out.println("이름은 공백없이 한글로 입력하시고, 과목 점수들은 0~100사이의 정수값으로 입력하십시오.");
				tf.setText("");
				tf.requestFocusInWindow();
				
				break;
				
			} else {
				
				subjects = scoresStr.trim().split("\\s{1,}");
				
				// 이름 추가
				name = subjects[0];
				korean = Byte.parseByte(subjects[1]);
				english = Byte.parseByte(subjects[2]);
				math = Byte.parseByte(subjects[3]);
				
				// 점수 현황 => DTO 대입(SubjectDTO2.java)
				subjectDTO = new SubjectDTO2(name, korean, english, math);
				System.out.println();
				
				/* -------------- 개별 총점 연산(계산) --------------  */

				subjectDTO.setSum(subjectDTO.getSum());
				
				/* -------------- 개별 평균 연산(계산) --------------  */
				
				subjectDTO.getAvg(subjectDTO.getAvg(), 2);
				System.out.println(subjectDTO);
				break;
			} //
			
		} // while
		
		// 개별 인원 성적 현황 추가
		return subjectDTO;
	} //
	

	@Override
	public void printScores(ArrayList<SubjectDTO2> subjectList) {
		
		System.out.println("전체 인원 국어 평균 : " + getTotalAvg("국어", subjectList, 2));
		System.out.println("전체 인원 영어 평균 : " + getTotalAvg("영어", subjectList, 2));
		System.out.println("전체 인원 수학 평균 : " + getTotalAvg("수학", subjectList, 2));
	} //


	
	@Override
	public void sortScores(Scanner sc, ArrayList<SubjectDTO2> subjectList) {
			
		String str;
		
		while (true) {
			
			System.out.print("정렬할 대상(이름/과목/총점/평균) 및 정렬 방법을 입력하십시오 (ex. 국어 오름차순) : ");
			sc = new Scanner(System.in);
			str = sc.nextLine();
			
			if (str.trim().equalsIgnoreCase("exit")){
				System.out.println("입력을 종료합니다.");
				System.exit(0);
			} // 
			
			// ex) 국어 오름차순
			String regex = "(이름|국어|영어|수학|총점|평균)\\s{1,}(오름차순|내림차순)";
			
			if (Pattern.matches(regex, str.trim()) == false) {
				
				System.out.println("정렬할 대상(이름/과목/총점/평균) 및 정렬 방법을 입력하십시오. (ex. 국어 오름차순)");
				
			} else {
				
				break;
			} //
			
		} // while
		
		System.out.println("정렬 대상 : " + str.trim());
		
		String chosenWord = str.trim().split("\\s{1,}")[0]; 
		String sortOrder = str.trim().split("\\s{1,}")[1];
		
		subjectList.sort((o1, o2) -> {
			
			int result = 0;
			
			switch (chosenWord) {
						
			case "이름" : 
						result = sortOrder.equals("오름차순") ? 
								(o1.getName().compareTo(o2.getName())) : 
								(o2.getName().compareTo(o1.getName())); break;
								
			case "국어" :
						result = sortOrder.equals("오름차순") ? 
								(o1.getKorean() > o2.getKorean() ? 1 : -1) : 
								(o1.getKorean() < o2.getKorean() ? 1 : -1); break;
			
			case "영어" :
						result = sortOrder.equals("오름차순") ?
								(o1.getEnglish() > o2.getEnglish() ? 1 : -1) :
								(o1.getEnglish() < o2.getEnglish() ? 1 : -1); break;	 
				
			case "수학" :  
						result = sortOrder.equals("오름차순") ?
								(o1.getMath() > o2.getMath() ? 1 : -1) :
								(o1.getMath() < o2.getMath() ? 1 : -1); break;	 
								
			case "총점" :  
						result = sortOrder.equals("오름차순") ?
								(o1.getSum() > o2.getSum() ? 1 : -1) :
								(o1.getSum() < o2.getSum() ? 1 : -1); break;	
								
			case "평균" :  
						result = sortOrder.equals("오름차순") ?
								(o1.getAvg() > o2.getAvg() ? 1 : -1) :
								(o1.getAvg() < o2.getAvg() ? 1 : -1); break;						
			} 	
			
			return result;
		}); //
		
		subjectList.forEach(x->System.out.println(x));
	} //

	@Override
	public void storeScoresFile(ArrayList<SubjectDTO2> subjectList, String filename) {
		
		ArrayList<String> saveList = new ArrayList<>();
		for (SubjectDTO2 dto : subjectList) {
			saveList.add(dto.toString());
		}
		
		// ArrayList<String> => 
		// Iterable<? extends CharSequence> lines (O)
		
		// ArrayList => List => Collection => Iterable (O)
		// SubjectDTO2 => CharSeqeunce (X)
		// String => CharSeqeunce (O)
		// SubjectDTO2.toString() => CharSeqeunce (O)
		
		try {
			Files.write(Paths.get(filename), 
					   saveList,
					   Charset.forName("UTF-8"),
					   StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		} //
		
	} //
	
	@Override
	public void storeScoresFileByServer(List<String> subjectList, String filename) {
		
		try {
			Files.write(Paths.get(filename), 
					   subjectList,
					   Charset.forName("UTF-8"),
					   StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		} //
		
	} //
	
	@Override
	public void storeScoresFileByServer(List<String> subjectList, String filename, StandardOpenOption fileOption) {
		
		try {
			Files.write(Paths.get(filename), 
					   subjectList,
					   Charset.forName("UTF-8"),
					   fileOption);
		} catch (IOException e) {
			e.printStackTrace();
		} //
		
	} //
	
	@Override
	public void storeScoresFileByServer(List<String> subjectList, String filename, 
										String encoding, StandardOpenOption fileOption) {
		
		try {
			Files.write(Paths.get(filename), 
					   subjectList,
					   Charset.forName(encoding),
					   fileOption);
		} catch (IOException e) {
			e.printStackTrace();
		} //
		
	} //

	@Override
	public void sendScores(ArrayList<SubjectDTO2> subjectList) {
		
		int port = 8888;
		String address = "localhost";
		
		try (Socket sc = new Socket(address, port);
			 BufferedWriter	writer  
				= new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()))) {
			
			StringJoiner sj = new StringJoiner("\n");
			
			// 인원 성적 정보마다 "\n"을 구분자로 삽입하여 전송 
			for (SubjectDTO2 s : subjectList) {
				System.out.println("- : " + s);
				sj.add(s.toString());
			}
			
			// 전송
			writer.write(sj + "");
			
		} catch (UnknownHostException e) {
			System.out.println("해당되는 주소의 서버를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("서버에 연결이 되지 않습니다.");
			e.printStackTrace();
		} //
		
	} //

	@Override
	public void sendScores(SubjectDTO2 subjectDTO2) {

		int port = 8888;
		String address = "localhost";
		
		try (Socket sc = new Socket(address, port);
			 BufferedWriter	writer  
				= new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()))) {
			
			writer.write(subjectDTO2.toString());
			
		} catch (UnknownHostException e) {
			System.out.println("해당되는 주소의 서버를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("서버에 연결이 되지 않습니다.");
			e.printStackTrace();
		} //
		
	} //

}