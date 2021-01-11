package com.urdomain.hw;

public class LogIn {
	public static void main(String[] args) {
		
		
		String[] user = {"asdf", "1234"}; // 중괄호 사용

		String urId = "tony";	// 입력받은 id
		String password = "1111";		// input password
				
		if( urId==user[0] && password==user[1]) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}


		
