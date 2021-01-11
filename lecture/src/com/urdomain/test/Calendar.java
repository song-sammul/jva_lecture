package com.urdomain.test;



import java.util.Scanner;
	
	public class Calendar {

		public static void main(String[ ] args) {
			
//			//만년 달력
					
	
			Scanner sc = new Scanner(System.in);
			
			
			int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};  		
			int y, m, day, i, week;
			
			
			
			
			do { 
				System.out.println("원하는 연도를 입력하세요:");
				y= sc.nextInt();

				
			} while(y<1);
			 do{
				System.out.println("원하는 달을 입력하세요:");	//12
				m= sc.nextInt();
			
			
			}while(m<1|| m>12); 	
			//윤년에 따른 2월의 날수 계산
			if(y% 4== 0 && y% 100!=0 || y% 400 == 0) {
				months[1] = 29;
			}
			//1년 1월 1일부터 y-1년 12월 31일까지의 날수
			day = (y-1) * 365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
			
//		int yy = (y-1)/4-(y-1)/100+(y-1)/400;
//			System.out.println(nalsu);
//			System.out.println(yy);
	
			
			//월   : 1  2  3  4  5  6  7  8  9  10 11 12
			//배열 : 31,28,31,30,31,30,31,31,30,31,30,31
			//idx  : 0  1  2  3  4  5  6  7  8  9  10 11
			for(i=0; i<(m-1); i++) {
				day += months[i];
			}
			
			
			//1년 1월 1일부터 y년 m월 1일까지의 날수

			day += 1;
			//y년 m월 1일의 주의 수 계산
			

			week = day%7;
	
			
		
			System.out.println("            " + y + "-" + m);
	
			System.out.println("\n 일   월   화   수  목   금   토");
			//공백지정
	
			for(i=0; i< week; i++) {
				System.out.print("    ");
			}
			
			
			//월   : 1  2  3  4  5  6  7  8  9  10 11 12
			//배열 : 31,28,31,30,31,30,31,31,30,31,30,31
			//idx  : 0  1  2  3  4  5  6  7  8  9  10 11
			//해당 월의 날짜 출력
	
			for(i=1; i<= months[m-1]; i++) {
				System.out.printf("%4d", i); //%4d : 자릿수 4자리(4byte) 만들어줌.
			
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
