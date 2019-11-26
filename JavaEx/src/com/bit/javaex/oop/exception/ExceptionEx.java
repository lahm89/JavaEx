package com.bit.javaex.oop.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	// ArithmeticException
	public static void ArithExceptionEx() {
		// 상황 1 : scanner로부터 입력받은 정수로 100을 나눌 경우
		double result = 0;
		Scanner scanner = new Scanner(System.in);
		int num = 0;	// 입력 값 변수
		
		try {
			// 오류 발생 가능 영역 시작
			System.out.print("정수를 입력하세요: ");
			num = scanner.nextInt();
			result = 100 / num;
			
			System.out.println("결과: " + result);
			// 오류 발생 가능 영역 끝
		} catch(InputMismatchException e) {
			System.out.println("정수만 입력하세요.");
		} catch(ArithmeticException e) {
			// ArithmeticException 발생 시 처리
			System.out.println("0 입력하지 마세요.");
			System.out.println("ERROR 메세지: " + e.getMessage());
		} catch(Exception e) {
			// Exception catch 블록은 맨 마지막에 위치 -> 모든 예외를 다 처리하기 때문
			e.printStackTrace();
		} finally {
			// 예외 여부 상관 없이 항상 마지막에 실해
			System.out.println("Finally 실행");
		}
		scanner.close();
	}
	
	public static void arrayException() {
		// ArrayIndexOutOfBoundsException
		int intArray[] = { 3, 6, 9 };
		// intArray의 Length == 3, 인덱스 범위 0 ~ 2
		System.out.println("길이: " + intArray.length	);
		try {
			intArray[4] = 12;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: 인덱스 범위는 " + (intArray.length - 1) + "까지 입니다.");
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
//		ArithExceptionEx();
		arrayException();
	}

}
