package com.bit.javaex.oop;

public class MethodEx {
	public static double getSum(double a, double b) {
		// a, b는 고정 인수, double 값 반환
		return a + b;
	}
	
	public static double getSumVar(double...values) {
		// ... 표기는 가변 인수를 의미, values는 배열로 전달
		double total = 0;
		for(double num: values) {
			total += num;
		}
		return total;
	}
	
	public static void printTotal(String message, double...values) {
		// 반환할 값이 없을 경우 선언부에서는 리턴 타입 void 입력
		// 고정 인수와 가변 인수를 같이 쓸 경우 순서에 유의 -> 고정 인수, 가변 인수 순으로 선언
		System.out.println(message + " " + getSumVar(values));
		// 리턴 타입이 void 이므로 return문 불필요(void 타입의 return은 돌아가시오의 의미)
	}
	public static void main(String[] args) {
		System.out.println("3 + 5 = " + getSum(3, 5));
		System.out.println(getSumVar(3, 5, 6, 1, 3, 2, 7, 5));
		printTotal("결과는?", 3, 5, 6, 1, 3, 2, 7, 5, 9, 3, 1, 2);
	}

}
