package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * <�ݺ���>
	 * ���α׷� �帧�� �����ϴ� ��� �� �ϳ�
	 * � �����ڵ带 �ݺ������� ���������
	 * 
	 * ũ�� �� ������ ����(for��, while��(do-while��))
	 * 
	 * * for��
	 * 
	 * for(�ʱ�� ; ���ǽ� ; ������) { // �ݺ� Ƚ���� �����ϱ� ���� �����ϴ� �͵�
	 * 		�ݺ������� �����Ű���� �ϴ� ����;
	 * }
	 * 
	 * - �ʱ�� : �ݺ����� ����� �� "ó���� �� �ѹ��� ����Ǵ� ����"
	 * 			(���� �ݺ��� �ȿ��� ���� ������ ���� �� �ʱ�ȭ�ϴ� ����)
	 * 
	 * - ���ǽ� : "�ݸ��� ����� ����"�� �ۼ��ϴ� ����
	 * 			(���ǽ��� true�� ��� �ش� ������ ����)
	 * 			(���ǽ��� false�� �Ǵ� ���� �ݺ��� ���߰� ��������)
	 * 
	 * - ������ : �ݺ����� �����ϴ� ���� ���� ������Ű�� ����
	 * 			(���� �ʱ�Ŀ� ���õ� ������ ������ ����������(++ --)�� �����.)
	 * 
	 * * for���� ������ ����
	 * �ʱ�� --> ���ǽ� �˻� --> true�� ��� ���౸�� ���� --> ������
	 * 		--> ���ǽ� �˻� --> true�� ��� ���౸�� ���� --> ������
	 * 		--------------�� ������ ��� �ݺ� ----------------
	 * 		--> ���ǽ� �˻� --> false�� ��� ���౸�� ����x --> �ݺ��� ��������.
	 * 
	 * * �˾Ƶ� ��
	 * 	for�� �ȿ� �ʱ��, ���ǽ�, ������ ���� ���� �����ϱ� �� (��, ; �ΰ��� �ʼ��� �ۼ�)
	 * 
	 * 
	 */
	
	public void method1() {
		
		// "�ȳ��ϼ���"�� 5�� �ݺ��ؼ� ����ϱ�
		// *** for�� �ȿ��� ������ ������ for��{} �ȿ����� ����. -> ���� for�������� �Ȱ��� ���� ���� ����
		for(int i=1; i<=5 ;i++) { // i���� 1�������� 5�� �� ������ �Ź� 1�� �����ϴ� ���� �ݺ� ���� (1, 2, 3, 4, 5 => 5ȸ)
			System.out.println("�ȳ��ϼ���");
		}
		
		for(int i=0; i<=4; i++) { // 0,1,2,3,4
			System.out.println("�ݰ����ϴ�");
		}
		
		for(int i=11; i<16; i++) { // 11, 12, 13, 14, 15 
			System.out.println("����������");
		}
		
		for(int i=1; i<10; i+=2) {// 1, 3, 5, 7, 9 // ������ �ڸ��� �� ���������ڸ� �� �ʿ�� ����!
			System.out.println("��𰡼���");
		}
		
		// System.out.println(i);	
	}
	
	public void method2() {
		// 1���� 5���� ���
	
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
		
		// 1���� 10 ������ Ȧ������ ���
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
		for(int i=0; i<=9; ++i) { // i���� 0�������� 9���� �Ź� 1�� �����Ǵ� �ݺ� (10ȸ)
			System.out.print(i + 1 + " ");
		}
	}
	
	public void method6() {
		// 1�������� 10������ �� �԰�
		
		//���1.
		/*
		 * int sum = 0;
		 * sum += 1;
		 * sum += 2;
		 * ...
		 * sum += 10;
		 * 
		 * ��Ģ: sum ������ �����ؼ� �ջ��ϴ� ���� �ݺ������� �����
		 * ��, �����ؼ� ���ϰ��� �ϴ� ���� 1�������� 10���� 1�� �����ȴٴ� ���� �ľ��� �� �ִ�.
		 */
		
		int sum = 0;
		
		for(int i=1; i<=10; ++i) {
			sum += i;
		}
		System.out.println("1���� 10������ ���հ�: " + sum);
	}
	
	public void method7() {
		
		//1�������� ������ �Է��� �������� ���հ�
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("1 �̻��� ������ �Է��ϼ���: ");
			int num = sc.nextInt();
			
			if(num>=1) {
				
				int sum = 0;
				
				for(int i=1; i<=num; ++i) {
					sum += i;
				} 
				
				System.out.println("1�������� " + num + "������ ���հ�: " + sum);
				break;
				
			}else {
				System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}
	}
	
	public void method8() {
		// 1�������� ��� ������(1~10 ����)������ ���հ�
		/*
		 * java.lang.Math Ŭ�������� �����ϴ� random() �޼ҵ� ȣ���ؼ� �Ź� �ٸ� �������� �� �� ����!!
		 * 
		 * Math.random() ȣ�� �� --> 0.0~0.99999999999 ������ ������ �߻�
		 * 						 (0.0 <=        <1.0)
		 */
		
		//int random = Math.random(); // double���̶� �ȵ�.
		//           0.0<=     <1.0   => 0.0 ~ 0.99999999
	
		//int random = Math.random() * 10;
		//			 0.0<=     <10.0  => 0.0 ~9.999999999
		
		//int random = Math.random() *10 + 1;
		// 			 1.0 <=    <11.0  => 1.0 ~ 10.9999999
		
		int random = (int)(Math.random() * 10 + 1);
		//			   1 <=    < 11	  => 1 ~ 10
		
		System.out.println("1~10 ������ ������: " + random);
		
		int sum = 0;
		for(int i=1; i<=random ;++i) {
			sum += i;
		}
		
		System.out.print("1���� "+ random + "������ �� �հ�: " + sum);
	}
	
	public void method9() {
		
		String str = "Hello";
		
		// �� �ε����� ���� �̾Ƽ� ���
		/* 
		 * H	-> str.charAt(0) ���
		 * e	-> str.charAt(1) ���
		 * l	-> str.charAt(2) ���
		 * l	-> str.charAt(3) ���
		 * o	-> str.charAt(4) ���
		 */
		
		for(int i=0; i<=4; ++i) {
			System.out.println(str.charAt(i));
		}
	
	}
	
	public void method10() {
		
		// ��������� ���ڿ� �Է¹޾Ƽ� (str ������ ����)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String str = sc.nextLine();
		
		
		// �� �ε��� �� ���ڸ� �̾Ƽ� ���
		
		// apple 5����
		// 01234
		
		// strawberry 10����
		// 0123456789
		
		//kiwi 4����
		//0123
		
		// ������ �ε����� �׻� (���ڿ��� ���� -1) ��� ���� �� �� ����!
		// �����ϰ��� �ϴ� �ε��� ���� 0~ (���ڿ��Ǳ���-1) ���� �Ź� 1�� ����
		System.out.println("���ڿ��� ����: " + str.length());
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method11() {
		// 2�� ����ϱ�
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
		
		System.out.print("������ �Է��ϼ���(2~9): ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d X %d = %d\n", num,i,num*i);
			}
		}else {
			System.out.print("�߸� �Է��߽��ϴ�.");
		}	
	
	}
	
	public void method13() {
		
		//2���� 9���� ���������� ������
		int dan = (int) (Math.random() * 8 + 2);
				// 0.0 <= ~ < 1.0
				// 0.0 <= ~ < 8.0
				// 2.0 <= ~ < 10.0
				// 2   <= ~ < 10
		
		System.out.println("=== " + dan + "��===");
		for(int su=1; su<=9; su++) {
			System.out.printf("%d x %d = %d\n", dan, su, dan * su);
		}
			
	}
	
	//��ø for��
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
		
		// 1***		=> 1�� 1���� ��
		// *2**		=> 2�� 2���� ��
		// **3*		=> 3�� 3���� ��
		// ***4		=> 4�� 4���� ��
		// ��, ��� ���� ��ġ�� �� ���ڸ� ����Ѵ�.
		
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
			
			System.out.println(i + "�� ���");
			for(int t=1; t<=9; t++) {
				System.out.printf("%d x %d = %d\n", i,i,t,t*i);
			}		
		}
	}
	
	public void method18() {
		
		for(;;) { // ���ǽ� ���� �� �⺻������ true => ���ѹݺ��ȴ�.
			System.out.println("�ȳ�");
		}
	
	
	
	}
	
	

}
