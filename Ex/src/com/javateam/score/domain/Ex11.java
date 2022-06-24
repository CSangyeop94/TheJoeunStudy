package com.javateam.score.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import com.javateam.score.domain.SubjectDTO2;
/**
 * ±¹¿µ¼ö ÃÑÁ¡/Æò±Õ ÇÁ·Î±×·¥
 * 
 * @author javateam 
 * @since 2022.6.14
 * @version 0.5
 */
public class Ex11 {
	
	// TODO
	// 1) ÁÖ¾îÁø URL Å¬·¡½º ´ÙÀÌ¾î±×·¥°ú °á°ú¹°À» ÂüÁ¶ÇÏ¿© SubjectDTO2 ÀÚ¹ÙºóÀ» ÀÛ¼ºÇÏ½Ê½Ã¿À.
	
	/**
	 * ¼Ò¼ıÁ¡ n¹øÂ° ÀÚ¸®¿¡¼­ ¹İ¿Ã¸²ÇÏ´Â Æò±Õ È¯»ê
	 *  
	 * @param avg Æò±Õ
	 * @param n ¹İ¿Ã¸²ÇÒ ¼Ò¼ıÁ¡ nÀÚ¸®
	 * @return ¹İ¿Ã¸²µÈ Æò±Õ
	 */
	static float getRoundAvg(float avg, int n) {
		
		float power = (float)Math.pow(10, n-1); 
		return (float)Math.round(avg * power) / power;
	}
	
	// TODO
	/**
	 * °ú¸ñ¸íÀ» ÀÔ·ÂÇÏ¸é Æ¯Á¤ °ú¸ñ¿¡ ´ëÇÑ Æò±Õ(¼Ò¼ıÁ¡ nÀÚ¸®¿¡¼­ ¹İ¿Ã¸²ÇÑ Æò±Õ)À» È¯»ê
	 *  
	 * @param subjectName °ú¸ñ¸í ex) ±¹¾î
	 * @param subjectArr ex) ÀüÃ¼ ÀÎ¿ø ¼ºÀû ÇöÈ² ¹è¿­ 
	 * @param n ¹İ¿Ã¸²ÇÒ ¼Ò¼ıÁ¡ nÀÚ¸®
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
			else if (subjectName.equals("¼öÇĞ"))
				totSum += subjectArr[i].getMath();
		} //
		
		return getRoundAvg((float)totSum/num, n);
	}
	
	// TODO
	/**
	 * °ú¸ñ¸íÀ» ÀÔ·ÂÇÏ¸é Æ¯Á¤ °ú¸ñ¿¡ ´ëÇÑ Æò±Õ(¼Ò¼ıÁ¡ nÀÚ¸®¿¡¼­ ¹İ¿Ã¸²ÇÑ Æò±Õ)À» È¯»ê
	 *  
	 * @param subjectName °ú¸ñ¸í ex) ±¹¾î
	 * @param subjectList ex) ÀüÃ¼ ÀÎ¿ø ¼ºÀû ÇöÈ² ¸®½ºÆ® 
	 * @param n ¹İ¿Ã¸²ÇÒ ¼Ò¼ıÁ¡ nÀÚ¸®
	 * @return °ú¸ñº° Æò±Õ
	 */
	static float getTotalAvg(String subjectName, List<SubjectDTO2> subjectList, int n) {
	
		// TODO
		// 2) À§¿¡¼­ ¸ÕÀú ¾ğ±ŞµÈ  getTotalAvg(String subjectName, SubjectDTO2[] subjectArr, int n)
		// ¸Ş¼­µå¸¦ ÂüÁ¶ÇÏ¿© µ¿ÀÏÇÑ ±â´ÉÀ» ÇÏ´Â º½ ¸Ş¼­µåÀÇ ±¸¹®À» ¿Ï¼ºÇÏ½Ê½Ã¿À.
		
	}

	public static void main(String[] args) {

		// ±¹/¿µ/¼ö Á¡¼ö : 0 ~ 100 ºĞÆ÷
		
		// TODO
		/** ÇĞ»ı ÀÌ¸§ : Ãß°¡ */
		String name = "";
		/** ±¹¾î */
		byte korean = -1; // ±¹¾î
		/** ¿µ¾î */
		byte english = -1; // ¿µ¾î
		/** ¼öÇĞ */
		byte math = -1; // ¼öÇĞ
		
		/* --------------- ´Ù¼ö ÀÎ¿ø ¼ö ÀÔ·Â ºÎ --------------- */
		
		Scanner sc = null;
		String str;
		
		while (true) {
			
			System.out.print("¼ºÀûÀ» ÀÔ·ÂÇÒ ÀÎ¿ø¼ö¸¦ ÀÔ·ÂÇÏ½Ê½Ã¿À : ");
			sc = new Scanner(System.in);
			str = sc.nextLine();
			
			if (str.trim().equalsIgnoreCase("exit")){
				
				System.out.println("ÀÔ·ÂÀ» Á¾·áÇÕ´Ï´Ù.");
				System.exit(0);
			} // 
			
			String regex = "([1-9]|10)";
			
			if (Pattern.matches(regex, str.trim()) == false) {
				
				System.out.println("1~10¸í »çÀÌ·Î ÀÎ¿ø¼ö¸¦ ÀÔ·ÂÇÏ½Ê½Ã¿À.");
				
			} else {
				
				break;
			} //
			
		} // while (ÀÎ¿ø¼ö ÀÔ·Â)
		
		int num = Integer.parseInt(str.trim());
		
		System.out.println("¼ºÀû ÀÔ·Â ÀÎ¿ø¼ö : " + num);
		
		/* -------------- ±¹/¿µ/¼ö (ÀÔ·ÂºÎ) ---------------- */
		
		String subjects[] = null; // °ú¸ñµé ¹è¿­
		
		// TODO
		// 3) ¾Æ·¡ÀÇ ±âÁ¸ÀÇ °ú¸ñ ¼ºÀû ÇöÈ² ¹è¿­(subjectArr)À» ¹è¿­°ú µ¿ÀÏÇÑ ¿ä¼Ò¸¦ °¡Áö¸é¼­ 
		// ArrayList ÄÃ·º¼ÇÀ» ÀÚ·áÇüÀ¸·Î °¡Áö´Â subjectList º¯¼ö·Î ´ëÃ¼ÇÏ½Ê½Ã¿À.
		// 
		SubjectDTO2[] subjectArr = new SubjectDTO2[num];
		
		for (int i = 0; i < num; i++) {

			System.out.println("\n----------------------------------------------------------\n");
		
			while (true) {
				
				System.out.print("ÇĞ»ıÀÌ¸§(ÇÑ±Û)/±¹/¿µ/¼ö °ú¸ñ Á¡¼ö¸¦ ÀÔ·ÂÇÏ½Ê½Ã¿À : ");
				sc = new Scanner(System.in);
				str = sc.nextLine();
				
				if (str.trim().equalsIgnoreCase("exit")){
					
					System.out.println("ÀÔ·ÂÀ» Á¾·áÇÕ´Ï´Ù.");
					System.exit(0);
				} // 
				
				
				// Á¤±Ô½Ä, ¸Ş½ÃÁö ¼öÁ¤
				// ¿À·ù ¸Ş½ÃÁö : ÀÌ¸§Àº °ø¹é¾øÀÌ ÇÑ±Û·Î ÀÔ·ÂÇÏ½Ã°í, °ú¸ñ Á¡¼öµéÀº 0~100»çÀÌÀÇ Á¤¼ö°ªÀ¸·Î ÀÔ·ÂÇÏ½Ê½Ã¿À.
				
				// 0~100 »çÀÌÀÇ Á¤¼ö ¹®ÀÚ¿­
				String intRange = "([0-9]|[1-9][0-9]|100)";
				
				// ÇĞ»ı ÀÌ¸§ Á¤±Ô½Ä Ãß°¡ : ÀÌ¸§Àº ºÙ¿©¼­ ¾²µµ·Ï À¯µµ
				String regexName = "([°¡-ÆR]{2,30})";

				// TODO
				// 4) ÇĞ»ı ÀÌ¸§À» °ú¸ñ Á¡¼ö¿Í °°ÀÌ ÀÔ·Â¹Ş°í Á¡°ËÇÒ ¼ö ÀÖµµ·Ï Á¤±Ô½ÄÀ» ¼öÁ¤ÇÏ½Ê½Ã¿À. 
				String regex = intRange + "\\s{1,}" + intRange + "\\s{1,}" + intRange;
				
				if (Pattern.matches(regex, str.trim()) == false) {
					
					System.out.println("ÀÌ¸§Àº °ø¹é¾øÀÌ ÇÑ±Û·Î ÀÔ·ÂÇÏ½Ã°í, °ú¸ñ Á¡¼öµéÀº 0~100»çÀÌÀÇ Á¤¼ö°ªÀ¸·Î ÀÔ·ÂÇÏ½Ê½Ã¿À.");
					
				} else {
					
					subjects = str.trim().split("\\s{1,}");
					
					// ÀÌ¸§ Ãß°¡
					name = subjects[0];
					
					// TODO
					// °ú¸ñ ÀÎµ¦½º(index) ±³Á¤
					korean = Byte.parseByte(subjects[1]);
					english = Byte.parseByte(subjects[2]);
					math = Byte.parseByte(subjects[3]);
					break;
				} //
				
			} // while
			
			// Á¡¼ö ÇöÈ² => DTO ´ëÀÔ(SubjectDTO2.java)
			SubjectDTO2 subjectDTO = new SubjectDTO2(name, korean, english, math);
			
//			System.out.println();
//			System.out.printf("±¹¾î Á¡¼ö : %d Á¡, ", subjectDTO.getKorean());
//			System.out.printf("¿µ¾î Á¡¼ö : %d Á¡, ", subjectDTO.getEnglish());
//			System.out.printf("¼öÇĞ Á¡¼ö : %d Á¡\n", subjectDTO.getMath());
			System.out.println();
			
			/* -------------- °³º° ÃÑÁ¡ ¿¬»ê(°è»ê) --------------  */

			subjectDTO.setSum(subjectDTO.getSum());
			
			/* -------------- °³º° Æò±Õ ¿¬»ê(°è»ê) --------------  */
			
			// ¼Ò¼öÁ¡ 2ÀÚ¸®¿¡¼­ ¹İ¿Ã¸²ÇÏ¿© Æò±Õ È¯»ê
			// System.out.print("Æò±Õ(¼Ò¼ıÁ¡ °¡°øÀü) : " + subjectDTO.getAvg() + ", ");
			float avg = subjectDTO.getAvg(subjectDTO.getAvg(), 2);
			
			// System.out.println("Æò±Õ(¼Ò¼ıÁ¡ °¡°øÈÄ) : " + avg);
			// System.out.println();
			
			System.out.println(subjectDTO);
		
            // °³º° ÀÎ¿ø ¼ºÀû ÇöÈ² Ãß°¡
			// TODO
			// 5) ±âÁ¸ÀÇ ¹è¿­¿¡ °³ÀÎ ¼ºÀû ÇöÈ²À» Ãß°¡ÇÏ´Â ºÎºĞÀ» 
			// ¼ºÀû ÇöÈ² ¸®½ºÆ®¿¡ °³º° ÀÎ¿ø ¼ºÀû ÇöÈ²À» Ãß°¡ÇÏ´Â ÄÚµå·Î ´ëÃ¼ÇÏ½Ê½Ã¿À.
			subjectArr[i] = subjectDTO;
			
		} // for	
		
		sc.close();
		
		/* -------------- ÀüÃ¼ ÀÎ¿øÀÇ ¼ºÀû °³º° ÇöÈ² ÀÎ¼â --------------  */
		
		System.out.println("\n--------------------- ÀüÃ¼ ÀÎ¿ø °³º° ¼ºÀû ÇöÈ² --------------------\n");
		
		// TODO
		// 6) °³º° ¼ºÀû ¸®½ºÆ®¸¦ ³ª¿­ÇÒ ¼ö ÀÖµµ·Ï ¼öÁ¤ÇÕ´Ï´Ù.
		for (SubjectDTO subjectDTO : subjectArr) {
			
			System.out.println(subjectDTO);
			
		} //
		
		/* -------------- ÀüÃ¼ ÀÎ¿øÀÇ ¼ºÀû ÃÑ°ı ÇöÈ² ÀÎ¼â --------------  */
		
		System.out.println("\n--------------------- ÀüÃ¼ ÀÎ¿ø ¼ºÀû ÃÑ°ı ÇöÈ² --------------------\n");
		
		// TODO
		// 7) À§¿¡¼­ ¾ò¾îÁø ¼ºÀû ÇöÈ² ¸®½ºÆ®¸¦ È°¿ëÇÏ¿© °¢ °ú¸ñÀÇ Á¡¼ö¸¦ Ãâ·ÂÇÒ ¼ö ÀÖµµ·Ï ÄÚµå¸¦ ¼öÁ¤ÇÕ´Ï´Ù.  
		float totKoreanAvg = getTotalAvg("±¹¾î", subjectArr, 2);
		float totEnglishAvg = getTotalAvg("¿µ¾î", subjectArr, 2);
		float totMathAvg = getTotalAvg("¼öÇĞ", subjectArr, 2);
		
		System.out.println("ÀüÃ¼ ÀÎ¿ø ±¹¾î Æò±Õ : " + totKoreanAvg);
		System.out.println("ÀüÃ¼ ÀÎ¿ø ¿µ¾î Æò±Õ : " + totEnglishAvg);
		System.out.println("ÀüÃ¼ ÀÎ¿ø ¼öÇĞ Æò±Õ : " + totMathAvg);
	} //

}