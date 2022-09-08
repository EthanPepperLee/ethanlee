package com.javalec.base;

import java.util.Scanner;

public class IF_04 {

	public static void main(String[] args) {
		
//				선언부
		Scanner scanner = new Scanner(System.in);
		int price = 0;

//				사용자 입력내용 가져오기
		System.out.print("금액을 입력하세요 : ");
		price = scanner.nextInt();

//				가격 비교해서 출력
		if (price > 8000) {
			System.out.println("너무 비쌉니다.");
		} else if (price > 5000) {
			System.out.println("조금 비쌉니다.");
		} else if (price > 3000) {
			System.out.println("적당한 금액입니다.");
		} else {
			System.out.println("싼 편입니다.");
		}
		
	}// main

}// IF_04