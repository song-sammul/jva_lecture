package com.urdomain.test;


	import java.util.Scanner;

	public class Calendar2 {

		public static void main(String[] args) {
//			//��,��,���� �Է¹޾� ����
//			//2018�� 12�� 3�� ������
			

			Scanner sc = new Scanner(System.in);

			int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

			int y = 2;
			int m= 2;
			int d= 3;
			int week= 4;
			int day= 5;
			int i;

			char ch[] = {'��','��','ȭ','��','��','��','��'};
			
			System.out.println("������ �Է��ϼ���:");
			
			y = sc.nextInt();
//			
			
			if(y<1) {
				System.out.println("������ �Է��ϼ���:");
			} else {
				System.out.println("���� �Է��ϼ���:");
				m= sc.nextInt();
			} if(m<1 || m> 12) {
				System.out.println("���� �Է��ϼ���:");
			} else {
				System.out.println("���� �Է��Ͻÿ�:");
				d = sc.nextInt();
			} if(d<1 || d> months[m-1]) {
				System.out.println("���� �Է��Ͻÿ�:");
			} else {
//			
			if(y%4 ==0 && y% 100!=0 || y%400==0) {
				months[1] = 29;
			}
			day = (y-1) * 365 + (y-1)/4 -(y-1)/100 + (y-1)/400;
		


			for(i=0; i<(m-1); i++) {	
			day += months[i];
			}

			day += d;	

			week = day % 7;

			System.out.println(y + "��" + m + "��" + d + "��" + ch[week] + "����");
			sc.close();
		}
		}
}
	