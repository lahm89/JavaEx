package com.bit.javaex.oop.exception;
// 사용자 정의 예외 생성 -> 예외 발생 시의 데이터를 담아 catch 블록에서 어떤 데이터의 오류인지 확인 가능
public class CustomArithException extends ArithmeticException {
	// 필드 : 오류 발생 당시의 데이터를 적재
	private int num1;
	private int num2;
	// 생성자
	public CustomArithException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}
	// Getter
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
}
