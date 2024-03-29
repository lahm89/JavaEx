package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class LoopEx {
	public static void whileEx() {
		// while문 연습
		// 100 이하의 정수를 합산하여 결과를 출력
		int num = 1;	// 반복 조건 확인을 위한 제어변수
		int total = 0;	// 합산 변수
		
		// while 루프 시작
		while(num <= 100) {
			total += num;
			num++;	// 반복 지속 여부 판단을 위한 변수는 직접 제어
		}
		System.out.println("TOTAL:" + total);
	}
	public static void whileEx2() {
		// 연습문제 : 키보드로부터 숫자 입력받아 해당 숫자에 해당하는 구구단을 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		int num = 1;	// 제어변수
		while(num<=9) {
			System.out.println(dan + "*" + num + "=" + dan * num);
			num++;	//제어변수 증감
		}
		scanner.close();
	}
	public static void forEx() {
		// whileEx2의 내용을 for문으로 작성
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		// for 루프 시작
		for(int num = 1; num <= 9; num++) {
			System.out.println(dan + "*" + num + "=" + dan * num);
		}
		scanner.close();
	}
	public static void continueEx() {
		// continue : 반복문에서 남아있는 코드 실행 않고 다음 루프 진행
		// 1부터 100까지의 수 중에서 2의 배수와 3의 배수를 제외한 수를 출력
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				continue;	// 다음 루프로 이동
			}
			System.out.println(i);
		}
	}
	public static void breakEx() {
		// break : 반복문을 종료하고 반복문 다음 문장으로 이동
		// 1부터 차례로 반복하여 6과 14로 동시에 나누어 떨어지는 수를 출력
		// 루프를 얼마나 돌려야할지 알 수 없을 때 -> while문
		int num = 1;
		
		while(true) {	// 무한루프
			if(num % 6 == 0 && num % 14 == 0) {
				break;	// 수를 찾았을 때 루프 중단
			}
			num++;
		}
		System.out.println(num);
	}
	public static void doWhileEx() {
		// do ~ while은 코드가 최소 1번은 무조건 실행되어야 하는 경우, 반복 조건 판별은 나중에 하고자 하는 경우
		// 정수를 입력받고 0이 아니면 합산 후 다음 루프, 0이면 루프 종료
		Scanner scanner = new Scanner(System.in);
		int total = 0, value = 0;
		
		do {
			System.out.print("정수 입력(0이면종료):");
			value = scanner.nextInt();
			total += value;
		} while(value != 0);
		System.out.println("TOTAL: " + total);
		scanner.close();
	}
	public static void main(String[] args) {
//		whileEx();
//		whileEx2();
//		forEx();
//		continueEx();
//		breakEx();
		doWhileEx();
	}

}
