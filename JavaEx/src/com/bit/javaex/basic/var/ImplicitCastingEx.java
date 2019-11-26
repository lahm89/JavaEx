package com.bit.javaex.basic.var;

public class ImplicitCastingEx {

	public static void main(String[] args) {
		// 암묵적 캐스팅(Promotion)
		// 표현범위가 좁은 데이터를 넓은 데이터로 변경할 때 java에서 자동으로 캐스팅
		
		byte b = 25;	// 1바이트 정수형
		System.out.println("BYTE:" + b);
		
		short s = b;	// 2바이트 정수형
		// b는 1바이트이므로 short에 할당이 가능
		System.out.println("SHORT:" + s);
		
		int i = s;	// 4바이트 정수형
		System.out.println("INT:" + i);
		
		long l = i;	// 8바이트 정수형
		System.out.println("LONG:" + l);
		
		float f = l;	// 4바이트 실수형
		// 바이트수는 long형보다 작지만 범위가 넓으므로 암묵적캐스팅 가능
		System.out.println("FLOAT:" + f);
		
		char ch = 'A';
		//short s2 = ch; //범위가 작아 암묵적캐스팅 불가능
		int i2 = ch;
	}

}
