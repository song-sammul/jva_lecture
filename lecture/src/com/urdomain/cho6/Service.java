package com.urdomain.cho6;

public class Service {
	
	@PrintAnnotation
	public void method1() {
		System.out.println("���� ����1");
	}
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("���� ����2");
	}
	@PrintAnnotation("*")
	public void method3() {
		System.out.println("���� ����3");
	}
}
