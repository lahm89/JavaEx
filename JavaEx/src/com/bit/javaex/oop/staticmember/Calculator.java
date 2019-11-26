package com.bit.javaex.oop.staticmember;
// static의 활용
public class Calculator {
	// static 상수와 static 메소드는 인스턴스화 하지않아도 접근 가능하여 기능과 상수 묶음으로 활용 가능
	public static final double PI= 3.14159;
	public static double getSum(double...arg) {
		double total = 0;
		
		for(double num: arg) {
			total += num;
		}
		
		return total;
	}
}
