package com.urdomain.test;



import java.util.Scanner;
	
	public class Calendar {

		public static void main(String[ ] args) {
			
//			//���� �޷�
					
	
			Scanner sc = new Scanner(System.in);
			
			
			int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};  		
			int y, m, day, i, week;
			
			
			
			
			do { 
				System.out.println("���ϴ� ������ �Է��ϼ���:");
				y= sc.nextInt();

				
			} while(y<1);
			 do{
				System.out.println("���ϴ� ���� �Է��ϼ���:");	//12
				m= sc.nextInt();
			
			
			}while(m<1|| m>12); 	
			//���⿡ ���� 2���� ���� ���
			if(y% 4== 0 && y% 100!=0 || y% 400 == 0) {
				months[1] = 29;
			}
			//1�� 1�� 1�Ϻ��� y-1�� 12�� 31�ϱ����� ����
			day = (y-1) * 365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
			
//		int yy = (y-1)/4-(y-1)/100+(y-1)/400;
//			System.out.println(nalsu);
//			System.out.println(yy);
	
			
			//��   : 1  2  3  4  5  6  7  8  9  10 11 12
			//�迭 : 31,28,31,30,31,30,31,31,30,31,30,31
			//idx  : 0  1  2  3  4  5  6  7  8  9  10 11
			for(i=0; i<(m-1); i++) {
				day += months[i];
			}
			
			
			//1�� 1�� 1�Ϻ��� y�� m�� 1�ϱ����� ����

			day += 1;
			//y�� m�� 1���� ���� �� ���
			

			week = day%7;
	
			
		
			System.out.println("            " + y + "-" + m);
	
			System.out.println("\n ��   ��   ȭ   ��  ��   ��   ��");
			//��������
	
			for(i=0; i< week; i++) {
				System.out.print("    ");
			}
			
			
			//��   : 1  2  3  4  5  6  7  8  9  10 11 12
			//�迭 : 31,28,31,30,31,30,31,31,30,31,30,31
			//idx  : 0  1  2  3  4  5  6  7  8  9  10 11
			//�ش� ���� ��¥ ���
	
			for(i=1; i<= months[m-1]; i++) {
				System.out.printf("%4d", i); //%4d : �ڸ��� 4�ڸ�(4byte) �������.
			
			week++;
			

				if(week%7 ==0)
					System.out.println();
				
		}
		if(week%7 !=0)
			System.out.println();
	
		System.out.printf("--------------------------------");
	
		sc.close();
	}
	
			
}
