package com.urdomain.test;

public class Test10 {
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			��ü ���� : ������ �׳� �Ѿ����
			Test10 test10 = new Test10();
			String name ="Tony";
			int phoneNum = 0;
			String resultPositionStr = "";
//			test10.getPhoneNumber() �Լ� ȣ��/���
			phoneNum = test10.getPhoneNumber(name);
//			test10.printConsole() �Լ� ȣ��/���
			test10.printConsoleForInt(phoneNum);
//			test10.checkPosition() �Լ� ȣ��/���
			resultPositionStr = test10.checkPosition(name);
//			test10.printConsoleForString() �Լ� ȣ��/���
			test10.printConsoleForString(resultPositionStr);
		}
//		�Լ� ����
//		input: �̸�, output: ��ȭ��ȣ �޿� 4�ڸ�
		public int getPhoneNumber (String urName) {
			// ������ Ÿ���� int�� ���� �Ǿ� �ִ� ����� ���ڸ� �ѱ�ϴ�.
			return 7570;
		}
//		�Լ� ����
//		input: ������ : output: ����
		public void printConsoleForInt (int num) {
			System.out.println(num);
		}
//		�Լ� ����
//		input: ���ڿ� : output: ����
		public void printConsoleForString (String str) {
			System.out.println(str);
		}
//		�Լ� ����
//		input: ���ڿ� : output: ���ڿ�
		public String checkPosition (String position) {
			String resultStr = "";
			if(position == "Tony") {
				resultStr = "���� ���� ������ !";
			} else {
				resultStr = "���� ����/�߻��� �л� !!";
			}
			return resultStr;
		}
	}

