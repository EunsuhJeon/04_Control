package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
		
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("�Է¸޴��Դϴ�.");
		}else if (num == 2) {
			System.out.println("�����޴��Դϴ�.");
		}else if (num ==3) {
			System.out.println("��ȸ�޴��Դϴ�.");
		}else if (num == 4) {
			System.out.println("�����޴��Դϴ�");
		}else if (num == 9) {
			System.out.println("���α׷��� ����˴ϴ�.");
		}else
			System.out.print("�߸� �Է��ϼ̽��ϴ�.");	
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num % 2 ==0 && num > 0) {
			System.out.println("¦����");
		}else if(num % 2 == 1 && num > 0) {
			System.out.println("Ȧ����");
		}else {
			System.out.println("����� �Է����ּ���.");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��������: ");
		int kor = sc.nextInt();
		
		System.out.print("��������: ");
		int math = sc.nextInt();
		
		System.out.print("��������: ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3;
		
		if(kor >= 40 && math >=40 && eng >=40 && avg >=60) {
			System.out.println("����: " + kor);
			System.out.println("����: " + math);
			System.out.println("����: " + eng);
			System.out.println("�հ�: " + sum);
			System.out.println("���: " + avg);
			
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}else
			System.out.println("���հ��Դϴ�.");
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12�� ������ ���� �Է�: " );
		int month = sc.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2: System.out.println(month + "���� �ܿ��Դϴ�.");break;
		case 3: 
		case 4:
		case 5:	System.out.println(month + "���� ���Դϴ�.");break;
		case 6:
		case 7:
		case 8:System.out.println(month + "���� �����Դϴ�.");break;
		case 9:
		case 10:
		case 11:	System.out.println(month + "���� �����Դϴ�.");break;
		default: System.out.println(month + "���� �߸� �Էµ� ���Դϴ�");	
			
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵�: ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ: ");
		String pw = sc.nextLine();
		
		String ID = "helloworld";
		String PW = "123456";
		
		if(id.equals(ID) && pw.equals(PW)) {
			System.out.println("�α��� ����");
		}else if (id.equals(ID)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else if (pw.equals(PW)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else {
			System.out.println("��й�ȣ�� ���̵� Ʋ�Ƚ��ϴ�.");
		}
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ���: ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "������": System.out.println("ȸ������, �Խñ� ����");
		case "ȸ��" : System.out.println("�Խñ��ۼ�, ��� �ۼ�");
		case "��ȸ��" : System.out.println("�Խñ���ȸ"); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		
		}

	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ���: " );
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ���: ");
		int weight = sc.nextInt();
		
		double BMI =  weight / ( height * height);
		
		String result = "";
		if(BMI < 18.5) {
			result = "��ü��";
		}else if (BMI < 23) {
			result = "����ü��";
		}else if (BMI < 25) {
			result = "��ü��";
		}else if (BMI < 30) {
			result = "��";
		}else {
			result = "����";
		}
		
		System.out.println("BMI ����: " + BMI);
		System.out.println(result);
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է�: ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է�: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%): ");
		char ch = sc.nextLine().charAt(0);
		
		int result = 0;
		if(ch == '+') {
			result = num1 + num2;
		}else if(ch == '-') {
			result = num1 - num2;
		}else if (ch == '*') {
			result = num1 * num2;
		}else if (ch == '/') {
			result = num1 / num2;
		}else if (ch == '%') {
			result = num1 % num2;
		}
		
		System.out.printf("%d %s %d = %d", num1, ch, num2, result);
			
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.print("����: ");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1: practice1(); break;
		case 2: practice2(); break;
		case 3: practice3(); break;
		case 4: practice4(); break;
		case 5: practice5(); break;
		case 6: practice6(); break;
		case 7: practice7(); break;
		case 8: practice8(); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

}
