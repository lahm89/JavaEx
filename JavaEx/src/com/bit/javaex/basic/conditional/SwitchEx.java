package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
//		switchEx1();		
//		switchEx2();
		switchEx3();
	}
	public static void switchEx1() {
		// 일반적인 switch ~ case 문의 사용법
		// 과목을 입력받아 과목별 강의실을 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("1:C  2:C++  3:Java");
		System.out.print("과목명:");
		int subject = scanner.nextInt();
		
		// switch는 조건 판별이 아닌 값의 판별
		String message;
		
		switch(subject) {
		case 1:
			message = "R101";
			break;
		case 2:
			message = "R102";
			break;
		case 3:
			message = "R103";
			break;
		default:
			message = "문의 바람";
		}
		System.out.println(message);
		scanner.close();
	}
	public static void switchEx2() {
		// C언어의 switch는 수치형 판별만 가능, Java는 char, String도 가능
		char grade = 'A';
		// grade A->Excellent, B->Good, C->So so, D->Pass, F->Fail, 나머지->What?
		String message;
		switch (grade) {
		case 'A':
			message = "Excellent!";
			break;
		case 'B':
			message = "Good!";
			break;
		case 'C':
			message = "So so";
			break;
		case 'D':
			message = "Pass";
			break;
		case 'F':
			message = "Fail";
			break;
		default:
			message = "What?";
		}
		System.out.println(grade + ":" + message);
	}
	public static void switchEx3() {
		// 여러 값을 한번에 묶어서 case로 처리할 경우
		// 요일에 따라 다른 행동을 출력
		// SUN->휴식, MON, TUE, WED, THU->열공, FRI->불금, SAT->방전
		// TODO NOTE : 코드값 등을 만들 때 문자열은 바람직하지 않음, 이럴 경우 상수 혹은 ENUM 타입을 활용해서 데이터의 범위를 강제하거나 축소함
		// TODO NOTE : 이 메소드는 ENUM으로 다시 작성
		String dow = "WED";
		String message;
		switch (dow) {
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			message = "열공";
			break;
		case "FRI":
			message = "불금";
			break;
		case "SAT":
			message = "방전";
			break;
		case "SUN":
			message = "휴식";
			break;
		default:
			message = "여긴 어디지?";
		}
		System.out.println(message);
	}

}
