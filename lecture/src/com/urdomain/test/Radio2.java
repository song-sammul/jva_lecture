package com.urdomain.test;

import java.util.Scanner;

public class Radio2 {

	public static void main(String[] args) {	
	}
		
		Scanner sc = new Scanner(System.in);
		
		
		Radio radio = new Radio();
		int turnOn = 0;
		int a= 2;	//음량
		int s= 3;	//주파수
		int f= 5;	//라디오 구동
		int h= 7;	//라디오 오프
		
		//함수
		// 전원 온
		
		public int turnOn() {
			turnOn = sc.nextInt();
			if(turnOn == 1) {
				// 음량 체크
					System.out.println("음량을 선택하세요(1~10):");
				
			return 1;
		} else {
			System.out.println("AS 전화해 보기");
			return -1;
		}
		//1.음량
			
			public int aa(int a) {
				a = sc.nextInt();
			if(a<0 || a>10) {
			System.out.println("음량를 선택하세요");
			
			return -1;	
			} else {
			System.out.println("주파수을 선택하세요");
			return a;
		}
		//주파수
			
			public int ss(int s) {
				s = sc.nextInt();
				if(s<0 || s>100) {
			System.out.println("주파수를 선택하세요");
			return -1;
		} else {
			System.out.println("채널를 선택하세요");
			return s;
		}
		//라디오 구동
		
		public int ff(int f) {
			f = sc.nextInt();
			if(a<0 || a>100) {
			System.out.println("주파수를 선택하세요");
			return -1;
		} else {
			System.out.println("라디오 "SS" 채널 작동");
			return f;
		}
		
		//라디오 오프
		
		public String turnoff(int j) {
			turnoff = sc.nextInt();
			if(turnoff==0) {
			System.out.println("라디오가 꺼집니다");
			return "off";
		} else {
			System.out.println("~~~~~");
			return "on";
	 	}
		
}
			}
//에러원인: 알수없음
