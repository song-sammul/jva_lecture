package com.urdomain.ch06;

public class Car4 {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car4() {
		
	}
	Car4(String model) {
		this(model, "����", 250);
	}
	Car4(String model, String color) {
		this(model, color, 250);
	}
	
	Car4(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}



}
