package com.javalec.base;

import java.util.Scanner;

public class IF_06 {

	public static void main(String[] args) {
//선언부
		Scanner scanner = new Scanner(System.in);
		int korean = 0, english = 0, math = 0;
		int total = (korean + english + math);
		String r1 = ("국어 점수는 평균");
		String r2 = ("영어 점수는 평균");
		String r3 = ("수학 점수는 평균");
		String r4 = ("보다 높습니다.");
		String r5 = ("점수입니다.");
		String r6 = ("보다 낮습니다.");
		
//입력내용 가져오기
		System.out.print("국어 점수를 입력하세요!");
		korean = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요!");
		english = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요!");
		math = scanner.nextInt();
		
//Average
		double average = (total / 3);
		
//Score Scope		
		if (korean <= 100 && korean >= 0 && english <= 100 && english >= 0 && math <= 100 && math >= 0) {
		System.out.println("평균점수 : " + average);
		
//Korean
		if (korean > average) {
			System.out.println(r1 + r4);
		} else if (korean == average) {
			System.out.println(r1 + r5);
		} else {
			System.out.println(r1 + r6);
		}
		
//English
		if (english > average) {
			System.out.println(r2 + r4);
		} else if (english == average) {
			System.out.println(r2 + r5);
		} else {
			System.out.println(r2 + r6);
		}
		
//Math
		if (math > average) {
			System.out.println(r3 + r4);
		} else if (math == average) {
			System.out.println(r3 + r5);
		} else {
			System.out.println(r3 + r6);
		}
		
//Score Error		
		} else {
			System.out.println("잘못된 점수입니다.");
		}
		
	} //main
	
} //IF_06

