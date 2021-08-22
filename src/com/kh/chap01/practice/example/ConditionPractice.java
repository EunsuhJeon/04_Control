package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호를 입력하세요: ");
		
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("입력메뉴입니다.");
		}else if (num == 2) {
			System.out.println("수정메뉴입니다.");
		}else if (num ==3) {
			System.out.println("조회메뉴입니다.");
		}else if (num == 4) {
			System.out.println("삭제메뉴입니다");
		}else if (num == 9) {
			System.out.println("프로그램이 종료됩니다.");
		}else
			System.out.print("잘못 입력하셨습니다.");	
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요: ");
		int num = sc.nextInt();
		
		if(num % 2 ==0 && num > 0) {
			System.out.println("짝수다");
		}else if(num % 2 == 1 && num > 0) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수: ");
		int math = sc.nextInt();
		
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3;
		
		if(kor >= 40 && math >=40 && eng >=40 && avg >=60) {
			System.out.println("국어: " + kor);
			System.out.println("수학: " + math);
			System.out.println("영어: " + eng);
			System.out.println("합계: " + sum);
			System.out.println("평균: " + avg);
			
			System.out.println("축하합니다, 합격입니다!");
		}else
			System.out.println("불합격입니다.");
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12월 사이의 정수 입력: " );
		int month = sc.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2: System.out.println(month + "월은 겨울입니다.");break;
		case 3: 
		case 4:
		case 5:	System.out.println(month + "월은 봄입니다.");break;
		case 6:
		case 7:
		case 8:System.out.println(month + "월은 여름입니다.");break;
		case 9:
		case 10:
		case 11:	System.out.println(month + "월은 가을입니다.");break;
		default: System.out.println(month + "월은 잘못 입력된 달입니다");	
			
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String pw = sc.nextLine();
		
		String ID = "helloworld";
		String PW = "123456";
		
		if(id.equals(ID) && pw.equals(PW)) {
			System.out.println("로그인 성공");
		}else if (id.equals(ID)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if (pw.equals(PW)) {
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("비밀번호와 아이디가 틀렸습니다.");
		}
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "관리자": System.out.println("회원관리, 게시글 관리");
		case "회원" : System.out.println("게시글작성, 댓글 작성");
		case "비회원" : System.out.println("게시글조회"); break;
		default : System.out.println("잘못 입력하셨습니다.");
		
		}

	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요: " );
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요: ");
		int weight = sc.nextInt();
		
		double BMI =  weight / ( height * height);
		
		String result = "";
		if(BMI < 18.5) {
			result = "저체중";
		}else if (BMI < 23) {
			result = "정상체중";
		}else if (BMI < 25) {
			result = "과체중";
		}else if (BMI < 30) {
			result = "비만";
		}else {
			result = "고도비만";
		}
		
		System.out.println("BMI 지수: " + BMI);
		System.out.println(result);
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%): ");
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
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.print("선택: ");
		
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
		default: System.out.println("잘못 입력하셨습니다.");
		}

	}

}
