package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class IfElse2Ex {

	public static void main(String[] args) {
		System.out.print("과목을 선택하세요.\n(1: C  2: C++  3: Java)\n과목번호: ");
		
		// 키보드로부터 정수 입력 1->R101, 2->R102, 3->R103, 그외->문의
		Scanner scanner = new Scanner(System.in);
		int subject = scanner.nextInt();
		String message;
		
		// 조건문 시작
		if (subject == 1) {
			message = "R101호 입니다.";
		} else if (subject == 2) {
			message = "R102호 입니다.";
		} else if(subject == 3) {
			message = "R103호 입니다.";
		} else {
			message = "상담원에게 문의하세요.";
		}
		
		scanner.close();
		System.out.println(message);

	}

}
