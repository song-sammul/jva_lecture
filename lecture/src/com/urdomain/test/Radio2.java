package com.urdomain.test;

import java.util.Scanner;

public class Radio2 {

	public static void main(String[] args) {	
	}
		
		Scanner sc = new Scanner(System.in);
		
		
		Radio radio = new Radio();
		int turnOnResult = 0;
		int a= 2;	//����
		int s= 3;	//���ļ�
		int d= 4;	//ä��
		int f= 5;	//���� ����
		int g= 6;	//���� ���
		int h= 7;	//���� ����
		
		//�Լ�
		// ���� ��
	turnOnResult = radio.turnOn();
				
				
			if(turnOnResult == 1) {
		// ���� üũ
			System.out.println("������ �����ϼ���(1~10):");
		} else {
			System.out.println("AS ��ȭ�� ����");
		}
		//1.����
		public int aa(int a) {
			if(a<0 || a>10) {
			System.out.println("������ �����ϼ���");
			return -1;	
			} else {
			System.out.println("���ļ��� �����ϼ���");
			return a;
		}
		//���ļ�
		public double ss(double s) {
			if(a<0 || a>100)
			System.out.println("���ļ��� �����ϼ���");
			return -1.0;
		} else {
			System.out.println("ä�θ� �����ϼ���");
			return s;
		}
		//���� ����
		public int ff(int f) {
			return f;
		}
		//������
		public int gg(int g) {
			return g;
		}
		//���� ����
		public String turnoff(int j) {
	 		return "off";
	 	}
		
}
}

