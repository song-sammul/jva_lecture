package com.urdomain.cho2;

public class FlaotDoubleExample {
	public static void main(String[]args) {
		//�Ǽ��� ����
		double var1 = 3.14;
		//float var2= 3.14 //�����Ͽ��� (type mismatch)
		float var3 = 3.14f;
		
		//���е� �׽�Ʈ
		
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println("var1: " + var1);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e ����ϱ�
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 =3e6f;
		double var9 =2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
	}
}
