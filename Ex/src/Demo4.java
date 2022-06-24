package com.javateam.score;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
		/** 국어 */
		byte korean = -1; // 국어
		
		/** 영어 */
		byte english = -1; // 영어
		
		/** 수학 */
		byte math = -1; // 수학
		
		Scanner sc = null;
		
		// Q) 아래와 같이 각각 과목명과 과목별 점수의 배열이 주어져 있을 경우 
		// 주어진 조건과 같이 코드를 작성하십시오.
		String [] subjects = {"국어", "영어", "수학"};
		byte [] scores = new byte[subjects.length];
		
		// TODO
		// 1) 각 과목에 대한 점수 입력을 과목 수만큼 반복적으로 받을 수 있도록 for loop을 활용하여
		// 아래의 구문을 재구성 하십시오.
		
		

			while (true) {
				
				System.out.print(subjects[i] + " 점수 입력 : ");
				sc = new Scanner(System.in);
			
				try {
					
					// TODO
					// 2) 표준 입력을 받아서 각 과목 점수 배열 변수에 저장합니다.
					
					
				} catch (InputMismatchException e) {
					System.out.println(subjects[i] + " 점수를 다시 입력하십시오.");
					continue;
				}
				
				// TODO
				// 3) 각 과목들의 점수 값이 0 ~ 100 사이면 분기하도록 조치하고
				// 그렇지 않으면 "국어 점수는 0~100 사이의 점수로 입력하십시오." 과 같이
				// 각 과목별로 메시징될 수 있도록 조치합니다.
				
				
			} // while
		
		
		
		// TODO
		// 4) 각 과목에 해당되는 점수 배열의 요소를 각 과목에 대입합니다. 

			
		System.out.println("korean : " + korean);
		System.out.println("english : " + english);
		System.out.println("math : " + math);
		
		sc.close();
	}

}
