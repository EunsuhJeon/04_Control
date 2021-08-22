package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/*
	 *  기본적으로 프로그램의 진행은 순차적으로 진행
	 *  단, 이 순차적인 흐름을 바꾸고자 할 때 제어문이란느 것을 이용해서 직접 제어 가능
	 *  
	 *  선택적으로 실행시키고자 할 때 -> 조건문
	 *  반복적으로 실행시키고자 할 때 -> 반복문
	 *  그 외의 흐름 제어 -> 분기문
	 *  
	 *  * 조건문
	 *    '조건식'을 통해 참이냐 거짓이냐를 판단해서 참일 경우 그에 해당하는 코드 실행
	 *    
	 *    조건식의 결과는 true/false로 나와야함!
	 *    보통 조건식에서는 비교연산자(대소, 동등), 논리연산자(&&,||)를 주로 사용
	 *    
	 *    * 조건문은 크게 if문과 switch문으로 나뉨
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		/* 
		 * * 단독 if문
		 *
		 *	if (조건식) {
		 *		.. 실행시키고자 하는 코드..
		 *	} 
		 *
		 * ==> 조건식이 true일 경우 -> 중괄호 블럭 안의 코드가 실행됨.
		 * ==> 조건식이false일 경우 -> 중괄호 블럭 안의 코드 무시하고 넘어감.
		 */
		
		if(num > 0) {
			System.out.println("양수다. ");
		}
		
		if(num <= 0) {
			System.out.println("양수가 아니다. ");
		}
			
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수: ");
		int num = sc.nextInt();
		
		/*
		 * * if-esle문
		 *  if(조건식){
		 *  	..실행코드1..
		 *  } else {
		 *  	..실행코드2..
		 *  }
		 *  
		 *  조건식의 결과가 true일 경우 실행코드 1 수행 후 if-else문 빠져나감
		 *  단, 결과가 false일 경우 무조건 실행코드2 수행
		 *  
		 */
		
		if(num > 0) {
			System.out.println("양수다.");
		}else {
			System.out.println("양수가 아니다.");
		}

	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		/* 
		 * * if-else if문
		 * 
		 * 	같은 비교대상으로 여러개의 조건을 제시해야할 경우
		 * 
		 * 	if(조건식1) {
		 * 		실행코드1;
		 * 	}else if (조건식2) {
		 * 		실행코드2;
		 * 	}else if (조건식3) {
		 * 		실행코드3;
		 * 	}[else {
		 * 		위의 조건들이 다 false일 경우 실행할 코드 *생략 가능
		 * 	}]
		 * 
		 */
		
		if(num > 0) {
			System.out.println("양수다.");
		} else if(num == 0) {
			System.out.println("0이다");
		} else /*if (num < 0)*/ {
			System.out.println("음수다.");
		}
		
	}
	
	public void method4() {
		
		// 13세 이하: 어린이
		// 13세 초과 19세 이하: 청소년
		// 19세 초과: 성인
		
		Scanner sc = new Scanner(System.in);
		
		//방법1.
		System.out.print("나이(정수만): ");
		
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
		}else if (/*age >13 &&*/ age <=19) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}

		//방법2.
		String result;
		
		if(age <=13) {
			result = "어린이";
		}else if (age <= 19) {
			result = "청소년";
		}else {
			result = "성인";
		}
	
		System.out.println(result);
	
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F): ");
		char gender = sc.nextLine().charAt(0);
		
		// xxx님은 xxx이다.
		
		//방법1.
		/*
		if(gender == 'M' || gender == 'm') {
			System.out.println(name + "님은 남학생이다.");
		}else if(gender == 'F' || gender == 'f') {
			System.out.println(name + "님은 여학생이다.");
		}
		*/
		
		//방법2.
		String result = ""; // 변수를 세팅해둘 때 반드시 초기화해놓는 습관을 들이자!! **
		if(gender == 'M' || gender =='m') {
			result = "남학생";
		}else if(gender == 'F' || gender == 'f') {
			result = "여학생";
		}else {
			System.out.println("성별을 잘못 입력하셨습니다.");
			return; // 해당 메소드를 빠져나가는 명령어
		}
		
		System.out.println(name + "님은 " + result + "이다.");
		
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		/*
		if(name == "홍길동") {
			System.out.println("홍길동님 반갑습니다.");
		}else {
			System.out.println("홍길동님이 아니신가보네요. 안녕히가세요.");
		}
		// 결과: 홍길동 입력시에도 "홍길동님이 아니신가보네요~~~"가 출력됨.
		*/
		
		/*
		 * 	byte 수		1		1	  2		4	 8		4		8	  2
		 * 기본자료형 : boolean, byte, short, int, long, float, double, char (8개)
		 * 참조자료형: String
		 * 
		 * 기본자료형들끼리 동등 비교시에는 ==, != 사용가능 (정상적으로 비교됨)
		 * 단, 참조자료형은 동등 비교시 ==, != 사용시 정상적으로 비교가 안됨
		 * 		=> equals() 메소드를 이용해서 비교해야됨
		 * 			문자열.equals(문자열)
		 * 
		 */
		
		if(name.equals("홍길동")) {
			System.out.println("홍길동님 반갑습니다.");
		}else {
			System.out.println("홍길동님이 아니신가보네요. 안녕히가세요.");
		}
		
	}
	
	//조건문 중첩사용
	public void method7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수(양수) 입력: ");
		int num = sc.nextInt();
		
		if (num>0) { // 양수일 경우
			
			if(num % 2 ==0) {
				System.out.println("짝수입니다.");	
			}else {
				System.out.println("홀수입니다.");
			}
			
		}else { // 양수가 아닐 경우
			System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
