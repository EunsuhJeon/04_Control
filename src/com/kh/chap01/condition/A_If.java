package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/*
	 *  �⺻������ ���α׷��� ������ ���������� ����
	 *  ��, �� �������� �帧�� �ٲٰ��� �� �� ����̶��� ���� �̿��ؼ� ���� ���� ����
	 *  
	 *  ���������� �����Ű���� �� �� -> ���ǹ�
	 *  �ݺ������� �����Ű���� �� �� -> �ݺ���
	 *  �� ���� �帧 ���� -> �б⹮
	 *  
	 *  * ���ǹ�
	 *    '���ǽ�'�� ���� ���̳� �����̳ĸ� �Ǵ��ؼ� ���� ��� �׿� �ش��ϴ� �ڵ� ����
	 *    
	 *    ���ǽ��� ����� true/false�� ���;���!
	 *    ���� ���ǽĿ����� �񱳿�����(���, ����), ��������(&&,||)�� �ַ� ���
	 *    
	 *    * ���ǹ��� ũ�� if���� switch������ ����
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num = sc.nextInt();
		
		/* 
		 * * �ܵ� if��
		 *
		 *	if (���ǽ�) {
		 *		.. �����Ű���� �ϴ� �ڵ�..
		 *	} 
		 *
		 * ==> ���ǽ��� true�� ��� -> �߰�ȣ �� ���� �ڵ尡 �����.
		 * ==> ���ǽ���false�� ��� -> �߰�ȣ �� ���� �ڵ� �����ϰ� �Ѿ.
		 */
		
		if(num > 0) {
			System.out.println("�����. ");
		}
		
		if(num <= 0) {
			System.out.println("����� �ƴϴ�. ");
		}
			
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("����: ");
		int num = sc.nextInt();
		
		/*
		 * * if-esle��
		 *  if(���ǽ�){
		 *  	..�����ڵ�1..
		 *  } else {
		 *  	..�����ڵ�2..
		 *  }
		 *  
		 *  ���ǽ��� ����� true�� ��� �����ڵ� 1 ���� �� if-else�� ��������
		 *  ��, ����� false�� ��� ������ �����ڵ�2 ����
		 *  
		 */
		
		if(num > 0) {
			System.out.println("�����.");
		}else {
			System.out.println("����� �ƴϴ�.");
		}

	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num = sc.nextInt();
		
		/* 
		 * * if-else if��
		 * 
		 * 	���� �񱳴������ �������� ������ �����ؾ��� ���
		 * 
		 * 	if(���ǽ�1) {
		 * 		�����ڵ�1;
		 * 	}else if (���ǽ�2) {
		 * 		�����ڵ�2;
		 * 	}else if (���ǽ�3) {
		 * 		�����ڵ�3;
		 * 	}[else {
		 * 		���� ���ǵ��� �� false�� ��� ������ �ڵ� *���� ����
		 * 	}]
		 * 
		 */
		
		if(num > 0) {
			System.out.println("�����.");
		} else if(num == 0) {
			System.out.println("0�̴�");
		} else /*if (num < 0)*/ {
			System.out.println("������.");
		}
		
	}
	
	public void method4() {
		
		// 13�� ����: ���
		// 13�� �ʰ� 19�� ����: û�ҳ�
		// 19�� �ʰ�: ����
		
		Scanner sc = new Scanner(System.in);
		
		//���1.
		System.out.print("����(������): ");
		
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("���");
		}else if (/*age >13 &&*/ age <=19) {
			System.out.println("û�ҳ�");
		}else {
			System.out.println("����");
		}

		//���2.
		String result;
		
		if(age <=13) {
			result = "���";
		}else if (age <= 19) {
			result = "û�ҳ�";
		}else {
			result = "����";
		}
	
		System.out.println(result);
	
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		System.out.print("����(M/F): ");
		char gender = sc.nextLine().charAt(0);
		
		// xxx���� xxx�̴�.
		
		//���1.
		/*
		if(gender == 'M' || gender == 'm') {
			System.out.println(name + "���� ���л��̴�.");
		}else if(gender == 'F' || gender == 'f') {
			System.out.println(name + "���� ���л��̴�.");
		}
		*/
		
		//���2.
		String result = ""; // ������ �����ص� �� �ݵ�� �ʱ�ȭ�س��� ������ ������!! **
		if(gender == 'M' || gender =='m') {
			result = "���л�";
		}else if(gender == 'F' || gender == 'f') {
			result = "���л�";
		}else {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
			return; // �ش� �޼ҵ带 ���������� ��ɾ�
		}
		
		System.out.println(name + "���� " + result + "�̴�.");
		
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		/*
		if(name == "ȫ�浿") {
			System.out.println("ȫ�浿�� �ݰ����ϴ�.");
		}else {
			System.out.println("ȫ�浿���� �ƴϽŰ����׿�. �ȳ���������.");
		}
		// ���: ȫ�浿 �Է½ÿ��� "ȫ�浿���� �ƴϽŰ����׿�~~~"�� ��µ�.
		*/
		
		/*
		 * 	byte ��		1		1	  2		4	 8		4		8	  2
		 * �⺻�ڷ��� : boolean, byte, short, int, long, float, double, char (8��)
		 * �����ڷ���: String
		 * 
		 * �⺻�ڷ����鳢�� ���� �񱳽ÿ��� ==, != ��밡�� (���������� �񱳵�)
		 * ��, �����ڷ����� ���� �񱳽� ==, != ���� ���������� �񱳰� �ȵ�
		 * 		=> equals() �޼ҵ带 �̿��ؼ� ���ؾߵ�
		 * 			���ڿ�.equals(���ڿ�)
		 * 
		 */
		
		if(name.equals("ȫ�浿")) {
			System.out.println("ȫ�浿�� �ݰ����ϴ�.");
		}else {
			System.out.println("ȫ�浿���� �ƴϽŰ����׿�. �ȳ���������.");
		}
		
	}
	
	//���ǹ� ��ø���
	public void method7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(���) �Է�: ");
		int num = sc.nextInt();
		
		if (num>0) { // ����� ���
			
			if(num % 2 ==0) {
				System.out.println("¦���Դϴ�.");	
			}else {
				System.out.println("Ȧ���Դϴ�.");
			}
			
		}else { // ����� �ƴ� ���
			System.out.println("����� �ƴմϴ�. �߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
