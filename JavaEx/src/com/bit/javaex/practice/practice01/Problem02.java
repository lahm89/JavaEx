package com.bit.javaex.practice.practice01;

import java.util.Scanner;

public class Problem02 {
	public static void problem02_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int i = 1;	// 제어변수
		while(i <= num) {
			int j = 0;	// 두번째 제어변수
			while(j < i) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
		sc.close();
	}
	public static void problem02_2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
	
		for(int i = 1; i <= num; i++) {
			for(int k = 1; k <= num - i; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}
	public static void main(String[] args) {
		problem02_1();
//		problem02_2();		
	}

}
