package com.kh.chap03.branch;

public class B_Continue {

	/*
	 * continue; : 반목문 안에 기술되는 구문
	 * 				continue; 구문 실행 시 그 뒤의 구문들은 실행되지 않고 곧바로 현재 속해있는 반복문 위로 올라감.
	 */
	
	public void method1() {
		
		//1부터 10까지 홀수 출력
		
		/*
		for(int i=1; i<=10; i++) { // i값이 1에서부터 10까지 매번 1씩 증가하는 동안 반복(10회)
			
			if(i % 2 == 1) {
			System.out.print(i + " ");
			}
		}
		*/
		
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 0) { // i값이 짝수일 경우
				continue; // 반복문 내의 뒤의 구문들은 실행되지 않고 반복문 위로 올라감(증감식)
			}
			System.out.print(i + " ");
			
		}
	}
	
	public void method2() {

		// 1부터 100까지의 총 합계

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				continue;
			}

			sum += i;
		}

		System.out.print("결과: " + sum);
	}
	
	
	public void method3() {

		// 2~9단 출력
		// 단, 3의 배수단은 빼고 출력

		for (int t = 2; t <= 9; t++) {
			if (t % 3 == 0) {
				continue;
			}
			System.out.println(t + "단");
			for (int i = 1; i <= 9; i++) {

				System.out.println(t + "x" + i + "= " + t * i);
			}
		}
		
		
		
		
		
		
	}
	
	
}
