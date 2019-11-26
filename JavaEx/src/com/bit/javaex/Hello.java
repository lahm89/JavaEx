package com.bit.javaex;

//	Hello 객체 : 첫 번째 java 프로그램
public class Hello {
	//	main 메서드 : 프로그램의 시작 지점
	public static void main(String[] args) {
		int a=10;
		double b;
		b=a;
		System.out.println(b);
		a=(int)b;
		System.out.println(a);
		b=10/3;
		System.out.println(b);
		b=(double)10/3;
		System.out.println(b);
		b=(int)10.2+(int)3.3;
		System.out.println(b);
		b=(int)10.2+3.3;
		System.out.println(b);
	}

}
