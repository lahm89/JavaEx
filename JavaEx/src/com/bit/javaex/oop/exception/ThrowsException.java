package com.bit.javaex.oop.exception;
// 강제 예외 발생 : 메소드 내에서 예외 처리 가능하지만 
// 호출하는 메소드에서 호출되는 메소드의 예외를 일괄 처리하는 것이 보다 좋은 처리방법
public class ThrowsException {
	// 외부에서 호출되는 메소드에 강제 예외 처리를 하지않고 호출한 메소드에 예외처리 위임
	public void executeRuntimeException() {
		System.out.println("강제 예외 발생");
		// Runtime Exception을 강제로 발생
		throw new RuntimeException("강제 예외");
	}
	
	public double divide(int num1, int num2) {
		if (num2 == 0) {
			// 호출한 메소드로 사용자 정의 Exception을 발생 -> 처리를 위임
			throw new CustomArithException("사용자 정의 예외", num1, num2);
			// num1, num2는 예외 발생 당시의 데이터
		}
		return num1 / num2;
	}
}
