package com.urdomain.cho6;

public class Car9Example {

	public static void main(String[] args) {
		Car9 myCar = new Car9();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("����ӵ�: " + myCar.getSpeed());
		
	}
}
