package com.bit.javaex.basic.var;

public class ExplicitCastingEx {

	public static void main(String[] args) {
		// 명시적 캐스팅
		// 표현범위가 넓은 자료형을 좁은 자료형으로 변환
		// 자료 유실 발생될 수 있어 자동 변환 불가
		
		byte b;
		int i = 2019;
		float f = 123.456f;
		
		System.out.println("INT:" + i);
		
		b = (byte)i;	// int가 byte보다 범위가 넓으므로 강제 캐스팅
		System.out.println("BYTE:" + b);
		
		i = (int)f;
		System.out.println("FLOAT:" + f + " -> INT:" + i);

	}

}
