package com.urdomain.cho3;

public class CheckOverflowExample {
	public static void main(String[]args) {
		try {
			int result = safeAdd(200000000, 200000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		}
	}
	public static int safeAdd(int left, int right) {
		throw new ArithmeticException("�������ο� �߻�");
		
	}
} else {
	if(left<(Integer.MIN_VALUE - right)) {
		throw new ArithmeticEception("�������ο� �߻�");
	
	}
}
		return left + right;
}
}