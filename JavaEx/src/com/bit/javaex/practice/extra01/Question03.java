package com.bit.javaex.practice.extra01;

import java.util.Scanner;

public class Question03 {
	public void printAnswer() {
		int num;
		Scanner scanner;
		
		System.out.println("정수를 입력하세요:");
			
		scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		
		//	TODO: 이곳에 코드를 작성합니다.
		boolean primeNumCheck = false;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				primeNumCheck = false;
				break;
			}
			else
				primeNumCheck = true;
		}
		if(primeNumCheck) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
	}
}
