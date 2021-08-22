package com.kh.chap03;

import java.util.Scanner;

public class MyPractice {

	public void methodTest() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산기호(+,-,*,/,%)를 입력하시오: ");
		char ch = sc.nextLine().charAt(0);
		
		int result=0;
		if (ch == '+') {
			result = num1 + num2; 
		}else if (ch == '-') {
			result = num1 - num2; 
		}else if (ch == '*') {
			result = num1 * num2; 
		}else if (ch == '/') {
			result = num1 / num2; 
		}else if (ch == '%') {
			result = num1 % num2;
		}else {
			System.out.println("연산기호를 잘못 입력하였습니다.");
			return;
		}
		
		System.out.println("연산결과: " + result);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
