package com.kh.chap03;

import java.util.Scanner;

public class MyPractice {

	public void methodTest() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1: ");
		int num1 = sc.nextInt();
		System.out.print("����2: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("�����ȣ(+,-,*,/,%)�� �Է��Ͻÿ�: ");
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
			System.out.println("�����ȣ�� �߸� �Է��Ͽ����ϴ�.");
			return;
		}
		
		System.out.println("������: " + result);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
