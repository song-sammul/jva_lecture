package com.urdomain.hw;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		Scanner user= new Scanner(System.in);
		
		int year; // -, 0 제외
		int[] month = new int[12]; // 1~12월 
		int day; //1~31
		String[] week = {"일","월","화","수","목","금","토"};
		
		//연도 선택
		
		System.out.println("연도를 입력하세요");
		
		year= user.nextInt();
		if(year<=0) {
			System.out.println("연도를 다시 확인해주세요");
		// 다시 연도 입력창으로 돌아가는 함수?
		} else {
			//달보여주기
			System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12");
			System.out.println("달을 선택해주세요");
		}	
		
		//달 선택
		month[] = user.nextInt();
		if((month[]<1)||(month[]>12)) {
			System.out.println("달을 다시 확인해주세요.");
		} else {
			System.out.println("날짜를 선택해주세요.");
		}// 다시 달 입력창으로 돌아가는 함수?
		//날짜보여주기 (윤년고려)
		
		
		//날짜선택
		day = user.nextInt();
		// 31: 1,3,5,7,8,10,12월 30: 4,6,9,11월 28또는29: 2월
		//2월 윤년 계산
		if(((year% 4== 0) &&(year% 100 != 0))||((year% 400==0))) {
			//2월 29일까지
			month[1] = 29;
		} else {
			month[1] = 28;
		}
		
		
		
	}

}









