package com.javalec.base;

import java.util.Scanner;
import java.util.stream.IntStream;

public class IF_07 {

	public static void main(String[] args) {
//		선언문
		Scanner scanner = new Scanner (System.in);
		double score = 0;
		String result = null;
		
//		입력내용 가져오기
		System.out.println("** 학점 관리 **");
		System.out.println("");
		System.out.print(">점수를 입력하세요 : ");
		score = scanner.nextDouble();
		
//		Score Range
		if (score > 100 || score < 0) {
			System.out.println("0에서 100 사이의 점수를 입력하세요.");
		} else {
		if (score >= 90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";			
		} else if (score >= 70) {
			result = "C";
		} else if (score >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		System.out.println(">귀하는 " + result + "학점입니다.");
		
		}
	}
}