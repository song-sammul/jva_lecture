package sec13.exam03_field_method_access.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;	//(0)
		a.field2 = 1;	//(0)
		a.field3 = 1;	//(x)
	
		a.method1();	//(0)
		a.method2();	//(0)
		a.method3();	//(x)
	}
		
}
