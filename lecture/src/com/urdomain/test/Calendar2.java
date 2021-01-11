package com.urdomain.test;


	import java.util.Scanner;

	public class Calendar2 {

		public static void main(String[] args) {
//			//년,월,일을 입력받아 요일
//			//2018년 12월 3일 월요일
			

			Scanner sc = new Scanner(System.in);

			int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

			int y = 2;
			int m= 2;
			int d= 3;
			int week= 4;
			int day= 5;
			int i;

			char ch[] = {'일','월','화','수','목','금','토'};
			
			System.out.println("연도를 입력하세요:");
			
			y = sc.nextInt();
//			
			
			if(y<1) {
				System.out.println("연도를 입력하세요:");
			} else {
				System.out.println("월을 입력하세요:");
				m= sc.nextInt();
			} if(m<1 || m> 12) {
				System.out.println("월을 입력하세요:");
			} else {
				System.out.println("일을 입력하시오:");
				d = sc.nextInt();
			} if(d<1 || d> months[m-1]) {
				System.out.println("일을 입력하시오:");
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

			System.out.println(y + "년" + m + "월" + d + "일" + ch[week] + "요일");
			sc.close();
		}
		}
}
	