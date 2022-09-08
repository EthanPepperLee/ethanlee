package com.javalec.base;

import java.util.Scanner;

public class IF_08 {

	public static void main(String[] args) {
		
//		선언문
		Scanner scanner = new Scanner (System.in);
		double height = 0, weight = 0;
		String result = null;
		
//		신장 입력내용 가져오기
		System.out.print("키를 입력하세요 (cm): ");
		height = scanner.nextDouble();
		
//		m > cm 변환
		height = (height / 100); 
		
//		체중 입력내용 가져오기
		System.out.print("체중을 입력하세요 (kg): ");
		weight = scanner.nextDouble();
		double bmi = (weight / (height * height));
		
//		BMI지수 분류
		if (bmi >= 30) {
			result = ("고도비만");
		} else if (bmi >= 25) {
			result = ("비만");
		} else if (bmi >= 23) {
			result = ("과체중");
		} else if (bmi >= 18.5) {
			result = ("정상체중");
		} else if (bmi >= 0) {
			result = ("저체중");
		} else {
			System.out.println("0이상의 수를 입력하세요.");
		}
		System.out.println("\n체질량지수는 " + bmi + "이므로 " + result + "입니다.");
			
	} //main

} //IF_08