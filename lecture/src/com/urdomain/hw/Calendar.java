package com.urdomain.hw;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		Scanner user= new Scanner(System.in);
		
		int year; // -, 0 ����
		int[] month = new int[12]; // 1~12�� 
		int day; //1~31
		String[] week = {"��","��","ȭ","��","��","��","��"};
		
		//���� ����
		
		System.out.println("������ �Է��ϼ���");
		
		year= user.nextInt();
		if(year<=0) {
			System.out.println("������ �ٽ� Ȯ�����ּ���");
		// �ٽ� ���� �Է�â���� ���ư��� �Լ�?
		} else {
			//�޺����ֱ�
			System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12");
			System.out.println("���� �������ּ���");
		}	
		
		//�� ����
		month[] = user.nextInt();
		if((month[]<1)||(month[]>12)) {
			System.out.println("���� �ٽ� Ȯ�����ּ���.");
		} else {
			System.out.println("��¥�� �������ּ���.");
		}// �ٽ� �� �Է�â���� ���ư��� �Լ�?
		//��¥�����ֱ� (������)
		
		
		//��¥����
		day = user.nextInt();
		// 31: 1,3,5,7,8,10,12�� 30: 4,6,9,11�� 28�Ǵ�29: 2��
		//2�� ���� ���
		if(((year% 4== 0) &&(year% 100 != 0))||((year% 400==0))) {
			//2�� 29�ϱ���
			month[1] = 29;
		} else {
			month[1] = 28;
		}
		
		
		
	}

}









