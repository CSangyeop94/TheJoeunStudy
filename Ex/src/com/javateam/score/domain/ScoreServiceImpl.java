package com.javateam.score.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.javateam.score.domain.SubjectDTO2;

@SuppressWarnings("resource")
public class ScoreServiceImpl implements ScoreService {
	
	/**
	 * ¼Ò¼ýÁ¡ n¹øÂ° ÀÚ¸®¿¡¼­ ¹Ý¿Ã¸²ÇÏ´Â Æò±Õ È¯»ê
	 *  
	 * @param avg Æò±Õ
	 * @param n ¹Ý¿Ã¸²ÇÒ ¼Ò¼ýÁ¡ nÀÚ¸®
	 * @return ¹Ý¿Ã¸²µÈ Æò±Õ
	 */
	static float getRoundAvg(float avg, int n) {
		
		float power = (float)Math.pow(10, n-1); 
		return (float)Math.round(avg * power) / power;
	}
	
	/**
	 * °ú¸ñ¸íÀ» ÀÔ·ÂÇÏ¸é Æ¯Á¤ °ú¸ñ¿¡ ´ëÇÑ Æò±Õ(¼Ò¼ýÁ¡ nÀÚ¸®¿¡¼­ ¹Ý¿Ã¸²ÇÑ Æò±Õ)À» È¯»ê
	 *  
	 * @param subjectName °ú¸ñ¸í ex) ±¹¾î
	 * @param subjectArr ex) ÀüÃ¼ ÀÎ¿ø ¼ºÀû ÇöÈ² ¹è¿­ 
	 * @param n ¹Ý¿Ã¸²ÇÒ ¼Ò¼ýÁ¡ nÀÚ¸®
	 * @return °ú¸ñº° Æò±Õ
	 */
	static float getTotalAvg(String subjectName, SubjectDTO2[] subjectArr, int n) {
	
		int totSum = 0;
		int num = subjectArr.length;
		
		for (int i = 0; i < num; i++) {
			
			if (subjectName.equals("±¹¾î"))
				totSum += subjectArr[i].getKorean();
			else if (subjectName.equals("¿µ¾î"))
				totSum += subjectArr[i].getEnglish();
			else if (subjectName.equals("¼öÇÐ"))
				totSum += subjectArr[i].getMath();
		} //
		
		return getRoundAvg((float)totSum/num, n);
	}
	
	/**
	 * °ú¸ñ¸íÀ» ÀÔ·ÂÇÏ¸é Æ¯Á¤ °ú¸ñ¿¡ ´ëÇÑ Æò±Õ(¼Ò¼ýÁ¡ nÀÚ¸®¿¡¼­ ¹Ý¿Ã¸²ÇÑ Æò±Õ)À» È¯»ê
	 *  
	 * @param subjectName °ú¸ñ¸í ex) ±¹¾î
	 * @param subjectList ex) ÀüÃ¼ ÀÎ¿ø ¼ºÀû ÇöÈ² ¸®½ºÆ® 
	 * @param n ¹Ý¿Ã¸²ÇÒ ¼Ò¼ýÁ¡ nÀÚ¸®
	 * @return °ú¸ñº° Æò±Õ
	 */
	static float getTotalAvg(String subjectName, List<SubjectDTO2> subjectList, int n) {
	
		int totSum = 0;
		int num = subjectList.size();
		
		for (int i = 0; i < num; i++) {
			
			if (subjectName.equals("±¹¾î"))
				totSum += subjectList.get(i).getKorean();
			else if (subjectName.equals("¿µ¾î"))
				totSum += subjectList.get(i).getEnglish();
			else if (subjectName.equals("¼öÇÐ"))
				totSum += subjectList.get(i).getMath();
		} //
		
		return getRoundAvg((float)totSum/num, n);
	}

	@Override
	public int inputNum(Scanner sc) {

		String str;
		int result = 0; // ¸®ÅÏ°ª
		
		// TODO
		// 1) ±âÁ¸ÀÇ ÄÚµå¸¦ Âü°íÇÏ¿© ¾Æ·¡ÀÇ ÄÚµå ºÎºÐ¸¦ ¿Ï¼ºÇÏ½Ê½Ã¿À.
		
		
		
		return result;
	} //
    @Override
	public ArrayList<SubjectDTO2> inputScores(Scanner sc, ArrayList<SubjectDTO2> subjectList, int num) {
		
		String str;
		String subjects[] = null; // °ú¸ñµé ¹è¿­
		
		/** ÇÐ»ý ÀÌ¸§ */
		String name;
		/** ±¹¾î */
		byte korean = -1; 
		/** ¿µ¾î */
		byte english = -1;
		/** ¼öÇÐ */
		byte math = -1; 
		
		for (int i = 0; i < num; i++) {

			System.out.println("\n----------------------------------------------------------\n");
		
			while (true) {
				
				System.out.print("ÇÐ»ýÀÌ¸§(ÇÑ±Û)/±¹/¿µ/¼ö °ú¸ñ Á¡¼ö¸¦ ÀÔ·ÂÇÏ½Ê½Ã¿À : ");
				sc = new Scanner(System.in);
				str = sc.nextLine();
				
				if (str.trim().equalsIgnoreCase("exit")){
					
					System.out.println("ÀÔ·ÂÀ» Á¾·áÇÕ´Ï´Ù.");
					System.exit(0);
				} // 
				
				// 0~100 »çÀÌÀÇ Á¤¼ö ¹®ÀÚ¿­
				String intRange = "([0-9]|[1-9][0-9]|100)";
				
				// ÇÐ»ý ÀÌ¸§ Á¤±Ô½Ä Ãß°¡ : ÀÌ¸§Àº ºÙ¿©¼­ ¾²µµ·Ï À¯µµ
				String regexName = "([°¡-ÆR]{2,30})";
				
				String regex = regexName + "\\s{1,}" 
							 + intRange + "\\s{1,}" 
							 + intRange + "\\s{1,}" 
							 + intRange;
				
				if (Pattern.matches(regex, str.trim()) == false) {
					
					System.out.println("ÀÌ¸§Àº °ø¹é¾øÀÌ ÇÑ±Û·Î ÀÔ·ÂÇÏ½Ã°í, °ú¸ñ Á¡¼öµéÀº 0~100»çÀÌÀÇ Á¤¼ö°ªÀ¸·Î ÀÔ·ÂÇÏ½Ê½Ã¿À.");
					
				} else {
					
					subjects = str.trim().split("\\s{1,}");
					
					// ÀÌ¸§ Ãß°¡
					name = subjects[0];
					korean = Byte.parseByte(subjects[1]);
					english = Byte.parseByte(subjects[2]);
					math = Byte.parseByte(subjects[3]);
					break;
				} //
				
			} // while
			
			// Á¡¼ö ÇöÈ² => DTO ´ëÀÔ(SubjectDTO2.java)
			SubjectDTO2 subjectDTO = new SubjectDTO2(name, korean, english, math);
			System.out.println();
			
			/* -------------- °³º° ÃÑÁ¡ ¿¬»ê(°è»ê) --------------  */
	
			subjectDTO.setSum(subjectDTO.getSum());
			
			/* -------------- °³º° Æò±Õ ¿¬»ê(°è»ê) --------------  */
			
			// ¼Ò¼öÁ¡ 2ÀÚ¸®¿¡¼­ ¹Ý¿Ã¸²ÇÏ¿© Æò±Õ È¯»ê
			//float avg = subjectDTO.getAvg(subjectDTO.getAvg(), 2);
			
			subjectDTO.getAvg(subjectDTO.getAvg(), 2);
			System.out.println(subjectDTO);
			
			// °³º° ÀÎ¿ø ¼ºÀû ÇöÈ² Ãß°¡
			subjectList.add(subjectDTO);
			
		} // for
		
		return subjectList;
	} //
	

	@Override
	public void printScores(ArrayList<SubjectDTO2> subjectList) {
		
		// TODO
		// 2) ±âÁ¸ÀÇ ÄÚµå¸¦ Âü°íÇÏ¿© ¾Æ·¡ÀÇ ÄÚµå ºÎºÐ¸¦ ¿Ï¼ºÇÏ½Ê½Ã¿À.

		
	} //

    @Override
	public void sortScores(Scanner sc, ArrayList<SubjectDTO2> subjectList) {
			
		String str;
		
		// TODO
		// 3) ±âÁ¸ÀÇ ÄÚµå¸¦ Âü°íÇÏ¿© ¾Æ·¡ÀÇ ÄÚµå ºÎºÐ¸¦ ¿Ï¼ºÇÏ½Ê½Ã¿À.
		
		
	} //

}