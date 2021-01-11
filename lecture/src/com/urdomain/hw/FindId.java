package com.urdomain.hw;

public class FindId {
	public static void main(String[] args) {
		
	
	
	String[] user = {"이름", "qwer.com", "asfd"};
	
		String name = "song";
		String email = "@.com";
		String urId = "zxcv";
		
		if( name == user[0] && email == user[1]) {
			System.out.println("ID: " + user[2] + "");
		} else {
			System.out.println("이름과 이메일을 다시 한번 확인해주세요.");
		}
}		
}

