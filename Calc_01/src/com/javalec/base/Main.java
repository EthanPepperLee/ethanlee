package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//-----------------------------------------
		// 연산자 종류별 출력
		int num1 = 10, num2 = 2, num3 = 5;

		System.out.println("<<<< 산술 연산자 >>>>");
		System.out.println("덧셈 : " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("뺄셈 : " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("곱셈 : " + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println("나눗셈 몫 : " + num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println("나눗셈 나머지 : " + num1 + " % " + num2 + " = " + (num1 % num3));

		// 자동 증감 연산자
		//++, -- 1만 가능
		System.out.println("");
		System.out.println("<<<< 자동증감 연산자 >>>>");
		
		num1 = num1 + 1;
//		num1 += 1;
//		num1 ++;
		System.out.println("증가 : " + num1);
//		num1 = num1 - 1;
//		num1 -= 1;
		num1 --;
		System.out.println("감소 : " + num1);
		
		System.out.println("");
		System.out.println("<<<< 동등비교 관계 연산자 >>>>");
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 < num2 : " + (num1 < num2));
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		
		System.out.println("");
		System.out.println("<<<< 논리 연산자 >>>>");
		System.out.println(num1 + " > " + num2 + " && " + num2 + " > "+ num3 + " : " + ((num1 > num2) && (num2 > num3)));
		System.out.println(num1 + " > " + num2 + " || " + num2 + " > "+ num3 + " : " + ((num1 > num2) || (num2 > num3)));
		
		System.out.println("");
		System.out.println("<<<< 삼항 연산자 >>>>");
//		num3가 5면 1출력 아니면 2출력
		String result = num3 == 5 ? "Yes":"No";
		System.out.println("삼항 연산 결과 (num3 == 5 ? 1:2) : " + (result));
		
		
		
		
		
		
		
		
		
	}

}