package com.javalec.base;

import java.util.Scanner;

public class IF_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double korean, english, math;
		String result1 = ("국어 점수는 평균");
		String result2 = ("영어 점수는 평균");
		String result3 = ("수학 점수는 평균");
		String result4 = ("보다 높습니다.");
		String result5 = ("점수입니다.");
		String result6 = ("보다 낮습니다.");

		System.out.print("국어 점수를 입력하세요!");
		korean = scanner.nextDouble();
		System.out.print("영어 점수를 입력하세요!");
		english = scanner.nextDouble();
		System.out.print("수학 점수를 입력하세요!");
		math = scanner.nextDouble();

		double average = ((korean + english + math) / 3);
		if (korean <= 100 && korean >= 0 && english <= 100 && english >= 0 && math <= 100 && math >= 0) {
		System.out.println("평균점수 : " + average);
		
		} else {
			System.out.println("");
		}
		
		if (korean > 100 || korean < 0 || english > 100 || english < 0 || math > 100 || math < 0) {
			System.out.println("잘못된 점수입니다.");
		} else {
		if (korean > average) {
			System.out.println(result1 + result4);
		} else if (korean == average) {
			System.out.println(result1 + result5);
		} else {
			System.out.println(result1 + result6);
		}

		if (english > average) {
			System.out.println(result2 + result4);
		} else if (english == average) {
			System.out.println(result2 + result5);
		} else {
			System.out.println(result2 + result6);
		}

		if (math > average) {
			System.out.println(result3 + result4);
		} else if (math == average) {
			System.out.println(result3 + result5);
		} else {
			System.out.println(result3 + result6);
		}
		}
	}
		
}

