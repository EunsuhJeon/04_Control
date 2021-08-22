package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨(for문, while문(do-while문))
	 * 
	 * * for문
	 * 
	 * for(초기식 ; 조건식 ; 증감식) { // 반복 횟수를 지정하기 위해 제시하는 것들
	 * 		반복적으로 실행시키고자 하는 구문;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"
	 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
	 * 
	 * - 조건식 : "반목문이 수행될 조건"을 작성하는 구문
	 * 			(조건식이 true일 경우 해당 구문을 실행)
	 * 			(조건식이 false가 되는 순간 반복을 멈추고 빠져나옴)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++ --)를 사용함.)
	 * 
	 * * for문을 만나는 순간
	 * 초기식 --> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 		--> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 		--------------이 내용이 계속 반복 ----------------
	 * 		--> 조건식 검사 --> false일 경우 실행구문 실행x --> 반복문 빠져나옴.
	 * 
	 * * 알아둘 것
	 * 	for문 안에 초기식, 조건식, 증감식 각각 생략 가능하긴 함 (단, ; 두개는 필수로 작성)
	 * 
	 * 
	 */
	
	public void method1() {
		
		// "안녕하세요"를 5번 반복해서 출력하기
		// *** for문 안에서 선언한 변수는 for문{} 안에서만 사용됨. -> 다음 for문에서도 똑같은 변수 선언 가능
		for(int i=1; i<=5 ;i++) { // i값이 1에서부터 5가 될 때까지 매번 1씩 증가하는 동안 반복 수행 (1, 2, 3, 4, 5 => 5회)
			System.out.println("안녕하세요");
		}
		
		for(int i=0; i<=4; i++) { // 0,1,2,3,4
			System.out.println("반갑습니다");
		}
		
		for(int i=11; i<16; i++) { // 11, 12, 13, 14, 15 
			System.out.println("저리가세요");
		}
		
		for(int i=1; i<10; i+=2) {// 1, 3, 5, 7, 9 // 증감식 자리에 꼭 증감연산자를 쓸 필요는 없음!
			System.out.println("어디가세요");
		}
		
		// System.out.println(i);	
	}
	
	public void method2() {
		// 1부터 5까지 출력
	
		for(int i=1; i<=5; ++i) {
			//System.out.println(i);
			System.out.print(i+ " ");
		}
	
	}
	
	public void method3() {
		
		for(int i=5; i>=1; --i) { // 5, 4, 3, 2, 1
			System.out.print(i+ " ");
		}
		
	}
	
	//QUIZ
	public void method4() {
		
		// 1부터 10 사이의 홀수만을 출력
		// 1 3 5 7 9
		
		/*
		for(int i=1; i<=10; i+=2){
		//for(int i=9; i>=1; i-=2) {
			System.out.print(i + " ");
		}
		*/
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i+ " ");
			}
		}
	}
	
	public void method5() {
		//1 2 3 4 ... 8 9 10
		for(int i=0; i<=9; ++i) { // i값이 0에서부터 9까지 매번 1씩 증가되는 반복 (10회)
			System.out.print(i + 1 + " ");
		}
	}
	
	public void method6() {
		// 1에서부터 10까지의 총 함계
		
		//방법1.
		/*
		 * int sum = 0;
		 * sum += 1;
		 * sum += 2;
		 * ...
		 * sum += 10;
		 * 
		 * 규칙: sum 변수에 누적해서 합산하는 것이 반복적으로 진행됨
		 * 단, 누적해서 더하고자 하는 값이 1에서부터 10까지 1씩 증가된다는 것을 파악할 수 있다.
		 */
		
		int sum = 0;
		
		for(int i=1; i<=10; ++i) {
			sum += i;
		}
		System.out.println("1부터 10까지의 총합계: " + sum);
	}
	
	public void method7() {
		
		//1에서부터 사용사자 입력한 수까지의 총합계
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("1 이상의 정수를 입력하세요: ");
			int num = sc.nextInt();
			
			if(num>=1) {
				
				int sum = 0;
				
				for(int i=1; i<=num; ++i) {
					sum += i;
				} 
				
				System.out.println("1에서부터 " + num + "까지의 총합계: " + sum);
				break;
				
			}else {
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
			}
			
		}
	}
	
	public void method8() {
		// 1에서부터 어떠한 랜덤값(1~10 사이)까지의 총합계
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드 호출해서 매번 다른 랜덤값을 얻어낼 수 있음!!
		 * 
		 * Math.random() 호출 시 --> 0.0~0.99999999999 사이의 랜덤값 발생
		 * 						 (0.0 <=        <1.0)
		 */
		
		//int random = Math.random(); // double형이라서 안됨.
		//           0.0<=     <1.0   => 0.0 ~ 0.99999999
	
		//int random = Math.random() * 10;
		//			 0.0<=     <10.0  => 0.0 ~9.999999999
		
		//int random = Math.random() *10 + 1;
		// 			 1.0 <=    <11.0  => 1.0 ~ 10.9999999
		
		int random = (int)(Math.random() * 10 + 1);
		//			   1 <=    < 11	  => 1 ~ 10
		
		System.out.println("1~10 사이의 랜덤값: " + random);
		
		int sum = 0;
		for(int i=1; i<=random ;++i) {
			sum += i;
		}
		
		System.out.print("1부터 "+ random + "까지의 총 합계: " + sum);
	}
	
	public void method9() {
		
		String str = "Hello";
		
		// 각 인덱스별 문자 뽑아서 출력
		/* 
		 * H	-> str.charAt(0) 출력
		 * e	-> str.charAt(1) 출력
		 * l	-> str.charAt(2) 출력
		 * l	-> str.charAt(3) 출력
		 * o	-> str.charAt(4) 출력
		 */
		
		for(int i=0; i<=4; ++i) {
			System.out.println(str.charAt(i));
		}
	
	}
	
	public void method10() {
		
		// 사용자한테 문자열 입력받아서 (str 변수에 대임)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		
		// 각 인덱스 별 문자를 뽑아서 출력
		
		// apple 5글자
		// 01234
		
		// strawberry 10글자
		// 0123456789
		
		//kiwi 4글자
		//0123
		
		// 마지막 인덱스는 항상 (문자열의 길이 -1) 라는 것을 알 수 있음!
		// 추출하고자 하는 인덱스 값이 0~ (문자열의길이-1) 까지 매번 1씩 증가
		System.out.println("문자열의 길이: " + str.length());
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method11() {
		// 2단 출력하기
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 */
		
		for(int i=1; i<=9; i++) {
			// System.out.println("2 x " + i + " = " + (2*i));
			System.out.printf("%d X %d = %d\n", 2,i,2*i);
		}
		
	}
	
	public void method12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요(2~9): ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d X %d = %d\n", num,i,num*i);
			}
		}else {
			System.out.print("잘못 입력했습니다.");
		}	
	
	}
	
	public void method13() {
		
		//2부터 9사이 랜덤값으로 구구단
		int dan = (int) (Math.random() * 8 + 2);
				// 0.0 <= ~ < 1.0
				// 0.0 <= ~ < 8.0
				// 2.0 <= ~ < 10.0
				// 2   <= ~ < 10
		
		System.out.println("=== " + dan + "단===");
		for(int su=1; su<=9; su++) {
			System.out.printf("%d x %d = %d\n", dan, su, dan * su);
		}
			
	}
	
	//중첩 for문
	public void method14() {
		
		// 1 2 3 4 5 
		// 1 2 3 4 5 
		// 1 2 3 4 5 
		for(int t=1; t<=3; t++) {
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
	
		System.out.println();
		}
	}
	
	public void method15() {
		// ****
		// ****
		// ****
		// ****
		
		for(int t=1; t<=4; t++) {
			for(int i=1; i<=4; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public void method16() {
		
		// 1***		=> 1행 1열일 때
		// *2**		=> 2행 2열일 때
		// **3*		=> 3행 3열일 때
		// ***4		=> 4행 4열일 때
		// 즉, 행과 열이 일치할 때 숫자를 출력한다.
		
		for(int t=1; t<=4; t++) {
			for(int i=1; i<=4; i++) {
				
				if(t == i) {
					System.out.print(t);
				}else {
					System.out.print("*");
				}
			} 
			System.out.println();
		}

	}
	
	public void method17() {
		
		for(int i=2; i<=9; i++) {
			
			System.out.println(i + "단 출력");
			for(int t=1; t<=9; t++) {
				System.out.printf("%d x %d = %d\n", i,i,t,t*i);
			}		
		}
	}
	
	public void method18() {
		
		for(;;) { // 조건식 생략 시 기본적으로 true => 무한반복된다.
			System.out.println("안녕");
		}
	
	
	
	}
	
	

}
