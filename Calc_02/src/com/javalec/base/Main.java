package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		사용자의 입력값이 짝수인지 홀수인지 알려주기!
//		선언-로직-출력 3단계		
		Scanner scanner = new Scanner(System.in);
//		System 이라는 클래스에 in 이라는 메소드
		
		System.out.println("숫자를 입력해주세요 : ");
		
//		System.out.println(scanner.nextInt());
//		미리 생성한 변수 scanner만 사용
		int num1 = scanner.nextInt();
		String result = (num1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println("입력한 숫자는 " + result + "입니다.");
		
		
		
	}

}
