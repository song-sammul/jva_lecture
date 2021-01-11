package sec13.exam03_field_method_access.package1;

public class A {
	//필드
	public int field1;
	int field2;
	private int field3;
	
	//생성자
	public A() {
		field1 = 1; //(0)
		field2 = 1; //(0)
		field3 = 1; //(0)
		
		method1();	//(0)
		method2();	//(0)
		method3();	//(0)
	}
	
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}
