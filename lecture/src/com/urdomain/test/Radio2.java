package com.urdomain.test;

import java.util.Scanner;

public class Radio2 {

	public static void main(String[] args) {	
	}
		
		Scanner sc = new Scanner(System.in);
		
		
		Radio radio = new Radio();
		int turnOn = 0;
		int a= 2;	//����
		int s= 3;	//���ļ�
		int f= 5;	//���� ����
		int h= 7;	//���� ����
		
		//�Լ�
		// ���� ��
		
		public int turnOn() {
			turnOn = sc.nextInt();
			if(turnOn == 1) {
				// ���� üũ
					System.out.println("������ �����ϼ���(1~10):");
				
			return 1;
		} else {
			System.out.println("AS ��ȭ�� ����");
			return -1;
		}
		//1.����
			
			public int aa(int a) {
				a = sc.nextInt();
			if(a<0 || a>10) {
			System.out.println("������ �����ϼ���");
			
			return -1;	
			} else {
			System.out.println("���ļ��� �����ϼ���");
			return a;
		}
		//���ļ�
			
			public int ss(int s) {
				s = sc.nextInt();
				if(s<0 || s>100) {
			System.out.println("���ļ��� �����ϼ���");
			return -1;
		} else {
			System.out.println("ä�θ� �����ϼ���");
			return s;
		}
		//���� ����
		
		public int ff(int f) {
			f = sc.nextInt();
			if(a<0 || a>100) {
			System.out.println("���ļ��� �����ϼ���");
			return -1;
		} else {
			System.out.println("���� "SS" ä�� �۵�");
			return f;
		}
		
		//���� ����
		
		public String turnoff(int j) {
			turnoff = sc.nextInt();
			if(turnoff==0) {
			System.out.println("������ �����ϴ�");
			return "off";
		} else {
			System.out.println("~~~~~");
			return "on";
	 	}
		
}
			}
//��������: �˼�����
