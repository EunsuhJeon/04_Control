package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * * while 문
	 * 
	 * 초기식;
	 * while(조건식) {
	 * 		반복적으로 실행할 코드;
	 * 		[증감식;]
	 * }
	 * 
	 * 조건식이 true일 경우 해당 코드 실행
	 * 
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식검사 --> true일 경우 실행코드 실행
	 * 조건식검사 --> false일 경우 실행코드 실행x => 반복문 빠져나옴
	 * 
	 */
	public void method1() {
		
		// 안녕하세요 5번 출력
		
		int i = 1;
		while(i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		System.out.println(i); //6
	}
	
	public void method2() {
		
		// 1 2 3 4 5 
		
		int i = 1;
		while(i <= 5) {
			/*
			System.out.print(i + " ");
			i++;
			*/
			System.out.print(i++ + " ");// 위 두 줄을 이렇게 줄일 수 있음.
		}
	}
	
	public void method3() {
		// 1에서부터 10 사이의 홀수만을 출력
		// 1 3 5 7 9
		
		/*
		int i=1;
		while(i<10) {
		
			System.out.print(i + " ");
			i+=2;
			*/
		// System.out.print((i+=2) + " "); <-- 복합대입 연산자는 증가시키는 것을 먼저 처리하기 때문에' 3 5 7 9 11' 과 같은 결과가 출력된다.
		
		int i = 1;
		while (i<10) {
			
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		
			i++;
			
		}
	}
	
	public void method4() {
		
		// 1부터 랜덤값 (1~100 사이) 까지의 합계
		int random = (int) (Math.random() * 100 + 1);
		
		int sum = 0;
		
		int i = 1;
		while(i<=random) {
			/*
			sum += i;
			i++;
			*/
			sum += i++;
		}
		System.out.println("1에서부터 " + random + "까지의 총 합계: " + sum);
	}
	
	public void method5() {
		// A_For 클래스의 method10을 while문으로 변경해서 실행
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력:");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이: "+ str.length());
		
		int i = 0;
		while(i<str.length()) {
			System.out.println(str.charAt(i++));
		}

	}
	
	
	
	
	
	
	
	
	
	
}
