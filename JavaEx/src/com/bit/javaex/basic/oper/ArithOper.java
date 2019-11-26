package com.bit.javaex.basic.oper;

public class ArithOper {

	public static void main(String[] args) {
		// 산술연산자
		int a = 7;
		int b = 3;
		
		// 부호 연산자 : +, - (일항 연산자)
		System.out.println(-a);	// 부호를 반전
		System.out.println(-1 * a);
		
		// 사칙 연산자 : +, -, *, /, %(나머지)
		System.out.println("정수의 나눗셈:" + (a / b));	// 정수와 정수의 나눗셈의 몫은 정수
		System.out.println("나머지:" + (a % b));
		// 나눗셈의 해
		System.out.println("나눗셈의 해:" + ((float)a / (float)b));
		System.out.println("나눗셈의 해:" + ((float)a / b));	//암묵적 캐스팅
		
		// 증감 연산자 : ++, --
		// 연산순서에 유의, a++와 ++a의 차이 확인
		System.out.println("A:" + a);
		System.out.println("++A:" + (++a));
		System.out.println("A:" + a);
		
		System.out.println("B:" + b);
		System.out.println("B++:" + (b++));
		System.out.println("B:" + b);
		// 증감 연산자는 연산식에 포함시 가독성이 매우 낮아지므로 독립적으로 사용 지향
		
		// 나눗셈 보충, 정수를 0으로 나눴을 경우
//		System.out.println(4 / 0);	//ArithmeticException
		System.out.println(4.0 / 0);	//Infinity
		// 피연산자 값이 Infinity인지 체크 해야할 경우
		System.out.println(Double.isInfinite(4.0 / 0));
		System.out.println(Double.isNaN(4.0 / 0));	// Not a Number
		// 4.0 / 0 은 Infinity값이며 수치 값
	}

}
