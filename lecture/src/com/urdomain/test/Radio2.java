package com.urdomain.test;

import java.util.Scanner;

public class Radio2 {

	public static void main(String[] args) {	
	}
		
		Scanner sc = new Scanner(System.in);
		
		
		Radio radio = new Radio();
		int turnOnResult = 0;
		int a= 2;	//음량
		int s= 3;	//주파수
		int d= 4;	//채널
		int f= 5;	//라디오 구동
		int g= 6;	//포즈 기능
		int h= 7;	//라디오 오프
		
		//함수
		// 전원 온
	turnOnResult = radio.turnOn();
				
				
			if(turnOnResult == 1) {
		// 음량 체크
			System.out.println("음량을 선택하세요(1~10):");
		} else {
			System.out.println("AS 전화해 보기");
		}
		//1.음량
		public int aa(int a) {
			if(a<0 || a>10) {
			System.out.println("음량를 선택하세요");
			return -1;	
			} else {
			System.out.println("주파수을 선택하세요");
			return a;
		}
		//주파수
		public double ss(double s) {
			if(a<0 || a>100)
			System.out.println("주파수를 선택하세요");
			return -1.0;
		} else {
			System.out.println("채널를 선택하세요");
			return s;
		}
		//라디오 구동
		public int ff(int f) {
			return f;
		}
		//포즈기능
		public int gg(int g) {
			return g;
		}
		//라디오 오프
		public String turnoff(int j) {
	 		return "off";
	 	}
		
}
}

