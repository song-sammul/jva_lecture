package com.urdomain.hw;

public class QWER {
	public int loginProcess(String id, String pw) {
		String[] db = {"tonytony", "1234"};

		int result = 0;

		if (id == db[0] && pw == db[1] ) {
			result = 1;
		} else {
			result = 0;
		}
		return result; // ��ȯ�� ���� �Ǵ� ��
		
	}
}


//�Լ����
int result = 1;
result = loginprocess(getAccount, getPassword);