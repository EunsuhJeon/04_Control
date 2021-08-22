package com.kh.chap03.branch;

public class B_Continue {

	/*
	 * continue; : �ݸ� �ȿ� ����Ǵ� ����
	 * 				continue; ���� ���� �� �� ���� �������� ������� �ʰ� ��ٷ� ���� �����ִ� �ݺ��� ���� �ö�.
	 */
	
	public void method1() {
		
		//1���� 10���� Ȧ�� ���
		
		/*
		for(int i=1; i<=10; i++) { // i���� 1�������� 10���� �Ź� 1�� �����ϴ� ���� �ݺ�(10ȸ)
			
			if(i % 2 == 1) {
			System.out.print(i + " ");
			}
		}
		*/
		
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 0) { // i���� ¦���� ���
				continue; // �ݺ��� ���� ���� �������� ������� �ʰ� �ݺ��� ���� �ö�(������)
			}
			System.out.print(i + " ");
			
		}
	}
	
	public void method2() {

		// 1���� 100������ �� �հ�

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				continue;
			}

			sum += i;
		}

		System.out.print("���: " + sum);
	}
	
	
	public void method3() {

		// 2~9�� ���
		// ��, 3�� ������� ���� ���

		for (int t = 2; t <= 9; t++) {
			if (t % 3 == 0) {
				continue;
			}
			System.out.println(t + "��");
			for (int i = 1; i <= 9; i++) {

				System.out.println(t + "x" + i + "= " + t * i);
			}
		}
		
		
		
		
		
		
	}
	
	
}
