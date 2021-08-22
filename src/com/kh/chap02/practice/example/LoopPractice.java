package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
				}	
		}else {
			System.out.print("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1 이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();
			
				if(num>=1) {
					for(int i=1; i<=num; i++) {
						System.out.print(i + " ");
						}
					break;
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}

		}
	
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=num; i>=1; i--) {
				
				System.out.print(i + " ");
			
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();
			
			if(num>=1) {
				for(int i=num; i>=1; i--) {
					
					System.out.print(i + " ");
				} break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		int sum=0;
		for(int i=1; i<=num; i++) {
			
			sum += i;
			
			if(i < num) {
			System.out.print(i + " + ");
			}else {
			System.out.print(i + " = ");
			}
		} System.out.print(sum);
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			
			// 1) 두 수를 가지고 최소값, 최대값을 알아내야함!!
			
			/*
			int min = 0;
			int max = 0;
			
			if(num1 > num2) {
				max = num1;
				min = num2;
			}else if (num1 < num2) {
				min = num1;
				max = num2;
			}
			*/
			
			int min = Math.min(num1, num2);
			int max = Math.max(num1, num2);

			// 2) 최소값부터 최대값까지 매번 1씩 증가하는 값을 출력
			for(int i = min; i<=max; i++) {
				System.out.print(i + " ");
			}
		
		}else {
			System.out.print("1 이상의 숫자만을 입력해주세요");
		}
		
	}
	
	public void practice7() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("첫 번째 숫자: ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자: ");
			int num2 = sc.nextInt();

			if (num1 >= 1 && num2 >= 1) {

				int min = Math.min(num1, num2);
				int max = Math.max(num1, num2);

				for (int i = min; i <= max; i++) {
					System.out.print(i);
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}

		}

	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int dan = sc.nextInt();
		
		System.out.println("========" + dan + "단=========");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자: ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {
			for (int i1 = dan; i1 <= 9; i1++) {

				System.out.println("========" + i1 + "단=========");
				for (int i2 = 1; i2 <= 9; i2++) {

					System.out.println(i1 + " * " + i2 + " = " + i1 * i2);
				}
			}

		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자: ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {
				for (int i1 = dan; i1 <= 9; i1++) {

					System.out.println("========" + i1 + "단=========");
					for (int i2 = 1; i2 <= 9; i2++) {

						System.out.println(i1 + " * " + i2 + " = " + i1 * i2);
					}
				}
				break;

			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}

	}
	
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		int start = sc.nextInt();
		
		System.out.print("공차: ");
		int num = sc.nextInt();
		
		// start 값에서부터 매번 num 씩 증가되는 값을 출력!
		
		for(int i=1; i<=10; i++) {
			
			System.out.print(start + " ");
			start += num;
		
		}
		
	}
	

	
	
	public void practice12() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			
			// 1. 연산자 입력 받기
			System.out.print("연산자(+, -, *, /, %): ");
			String op = sc.nextLine();
			
			// 사용자가 입력한 연산자가 "exit"일 경우 => "프로그램을 종료합니다." 출력 후 반복문 종료
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 2. 정수 두개 입력받기
			System.out.print("정수1: ");
			int num1 = sc.nextInt();
			System.out.print("정수2: ");
			int num2 = sc.nextInt();
			sc.nextLine(); // 버퍼를 깔끔하게 비워줌 **
			
			
			// 연산자가 "/"거나 "%"일 때 두번째 정수값이 0일 경우 => "0으로 나눌 수 없습니다. 다시 입력해주세요." 출력후 반복문 다시 시작
			if((op.equals("/") || op.equals("%")) && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
				continue;
			}
			
			
			// 3. 연산 기호에 따라 해당 연산 결과 출력
			int result = 0;
			switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			case "%": result = num1 % num2; break;
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요.\n"); continue;
			
			}
			System.out.printf("%d %s %d = %d\n\n" , num1, op, num2, result);

		}
		
	}
}
