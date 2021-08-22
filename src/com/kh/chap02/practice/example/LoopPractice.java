package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
				}	
		}else {
			System.out.print("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ���: ");
			int num = sc.nextInt();
			
				if(num>=1) {
					for(int i=1; i<=num; i++) {
						System.out.print(i + " ");
						}
					break;
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}

		}
	
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=num; i>=1; i--) {
				
				System.out.print(i + " ");
			
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ���: ");
			int num = sc.nextInt();
			
			if(num>=1) {
				for(int i=num; i>=1; i--) {
					
					System.out.print(i + " ");
				} break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ���: ");
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
		
		System.out.print("ù ��° ����: ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ����: ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			
			// 1) �� ���� ������ �ּҰ�, �ִ밪�� �˾Ƴ�����!!
			
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

			// 2) �ּҰ����� �ִ밪���� �Ź� 1�� �����ϴ� ���� ���
			for(int i = min; i<=max; i++) {
				System.out.print(i + " ");
			}
		
		}else {
			System.out.print("1 �̻��� ���ڸ��� �Է����ּ���");
		}
		
	}
	
	public void practice7() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("ù ��° ����: ");
			int num1 = sc.nextInt();
			System.out.print("�� ��° ����: ");
			int num2 = sc.nextInt();

			if (num1 >= 1 && num2 >= 1) {

				int min = Math.min(num1, num2);
				int max = Math.max(num1, num2);

				for (int i = min; i <= max; i++) {
					System.out.print(i);
				}
				break;
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}

		}

	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int dan = sc.nextInt();
		
		System.out.println("========" + dan + "��=========");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("����: ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {
			for (int i1 = dan; i1 <= 9; i1++) {

				System.out.println("========" + i1 + "��=========");
				for (int i2 = 1; i2 <= 9; i2++) {

					System.out.println(i1 + " * " + i2 + " = " + i1 * i2);
				}
			}

		} else {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("����: ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {
				for (int i1 = dan; i1 <= 9; i1++) {

					System.out.println("========" + i1 + "��=========");
					for (int i2 = 1; i2 <= 9; i2++) {

						System.out.println(i1 + " * " + i2 + " = " + i1 * i2);
					}
				}
				break;

			} else {
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
			}
		}

	}
	
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ����: ");
		int start = sc.nextInt();
		
		System.out.print("����: ");
		int num = sc.nextInt();
		
		// start ���������� �Ź� num �� �����Ǵ� ���� ���!
		
		for(int i=1; i<=10; i++) {
			
			System.out.print(start + " ");
			start += num;
		
		}
		
	}
	

	
	
	public void practice12() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			
			// 1. ������ �Է� �ޱ�
			System.out.print("������(+, -, *, /, %): ");
			String op = sc.nextLine();
			
			// ����ڰ� �Է��� �����ڰ� "exit"�� ��� => "���α׷��� �����մϴ�." ��� �� �ݺ��� ����
			if(op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			// 2. ���� �ΰ� �Է¹ޱ�
			System.out.print("����1: ");
			int num1 = sc.nextInt();
			System.out.print("����2: ");
			int num2 = sc.nextInt();
			sc.nextLine(); // ���۸� ����ϰ� ����� **
			
			
			// �����ڰ� "/"�ų� "%"�� �� �ι�° �������� 0�� ��� => "0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���." ����� �ݺ��� �ٽ� ����
			if((op.equals("/") || op.equals("%")) && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
				continue;
			}
			
			
			// 3. ���� ��ȣ�� ���� �ش� ���� ��� ���
			int result = 0;
			switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			case "%": result = num1 % num2; break;
			default : System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.\n"); continue;
			
			}
			System.out.printf("%d %s %d = %d\n\n" , num1, op, num2, result);

		}
		
	}
}
