package com.javateam.score;

// import java.util.*;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 국영수 총점/평균 프로그램
 * 
 * @author javateam 
 * @since 2022.6.14
 * @version 0.1
 */
public class Ex5 {

	public static void main(String[] args) {

		// 국/영/수 점수 : 0 ~ 100 분포
		
		/** 국어 */
		byte korean = -1; // 국어
		
		/** 영어 */
		byte english = -1; // 영어
		
		/** 수학 */
		byte math = -1; // 수학
		
		/* -------------- 국/영/수 (입력부) --------------  */
		
		// TODO
		// 국/영/수 점수 입력
		// 조건) 
		// 1) 각 과목을 별도로 입력
		// 2) 과목 입력 타이틀(표제) 출력
		// ex) 국어 점수 입력 : 
		// 3) 각 과목 입력값 => 각 과목 변수 대입
		
		// TODO
		// 데이터 입력 유효성 검사/재입력 유도
		// 예외처리(try ~ catch)
		// 0 ~ 100 사이의 정수 입력 되면 유효 판정
		// 
		// 무한 루프/분기
		Scanner sc = null;
		
		/*
		System.out.print("국어 점수 입력 : ");
		korean = sc.nextByte();
		
		System.out.print("영어 점수 입력 : ");
		english = sc.nextByte();
		
		System.out.print("수학 점수 입력 : ");
		math = sc.nextByte();
		*/
		
		// 국어 성적 입력
		while (true) {
			
			System.out.print("국어 점수 입력 : ");
			sc = new Scanner(System.in);
		
			try {
				
				korean = sc.nextByte();
				
			} catch (InputMismatchException e) {
				// 메시징
				System.out.println("국어 점수를 다시 입력하십시오.");
			}
			
			if (korean >= 0 && korean <= 100) {
				break;
			} else {
				System.out.println("국어 점수는 0~100 점 사이를 입력하십시오.");
			}
			
		} // while
		
		// 영어 성적 입력
		while (true) {
			
			System.out.print("영어 점수 입력 : ");
			sc = new Scanner(System.in);
		
			try {
				
				english = sc.nextByte();
				
			} catch (InputMismatchException e) {
				// 메시징
				System.out.println("영어 점수를 다시 입력하십시오.");
			}
			
			if (english >= 0 && english <= 100) {
				break;
			} else {
				System.out.println("영어 점수는 0~100 점 사이를 입력하십시오.");
			}
			
		} // while
		
		// 수학 성적 입력
		while (true) {
			
			System.out.print("수학 점수 입력 : ");
			sc = new Scanner(System.in);
		
			try {
				
				math = sc.nextByte();
				
			} catch (InputMismatchException e) {
				// 메시징
				System.out.println("수학 점수를 다시 입력하십시오.");
			}
			
			if (math >= 0 && math <= 100) {
				break;
			} else {
				System.out.println("수학 점수는 0~100 점 사이를 입력하십시오.");
			}
			
		} // while
		
		System.out.println("korean : " + korean);
		System.out.println("english : " + english);
		System.out.println("math : " + math);
		
		sc.close();
		
//		korean = 80;
//		english = 75;
//		math = 90;
		
		// 1-1) 
//		System.out.println("국어 점수 : " + korean + " 점");
//		System.out.println("영어 점수 : " + english + " 점");
//		System.out.println("수학 점수 : " + math + " 점");
		
		// 1-2)
		System.out.printf("국어 점수 : %d 점%n", korean);
		// System.out.printf("국어 점수 : %1$d 점%n", korean);
		// System.out.printf("국어 점수 : %d 점\n", korean);
		System.out.printf("영어 점수 : %d 점\n", english);
		System.out.printf("수학 점수 : %d 점\n", math);
		
		// 1-3)
		// java.util.Formatter format = new java.util.Formatter(); 
		// Formatter formatter = new Formatter();
		// formatter.format("국어 점수 : %d 점%n", korean);
		// formatter.format("영어 점수 : %d 점%n", english);
		// System.out.println(formatter.format("수학 점수 : %d 점%n", math));
		
		
		/* -------------- 총점 연산(계산) --------------  */

		// 2-1)
		// short sum = (short)(korean + english + math); // (O)
		
		// 2-2)
		int sum = korean + english + math; // (O)
		
		System.out.printf("총점 : %d 점%n", sum);
		
		/* -------------- 평균 연산(계산) --------------  */
		
		// 평균 : OO.XXXXX 점
		// 2-3)
		float avg = (float)sum / 3F; // 81.666664 (O)
		System.out.printf("평균 : %f 점%n", avg); // (O)
		
		// System.out.printf("평균 : %2.2f 점%n", avg); // 소수점 두자리 표시
		
	} //

}
