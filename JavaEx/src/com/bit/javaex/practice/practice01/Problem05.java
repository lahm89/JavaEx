package com.bit.javaex.practice.practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numC;
		int max = 0;
		
		System.out.println("몇 개의 숫자를 비교하고 싶으신가요?");
		numC = sc.nextInt();
		int num[] = new int[numC];
		System.out.printf("%d 개의 숫자를 입력해주세요.%n", num.length);
			
		for(int i = 0; i < num.length; i++	) {
			System.out.printf("숫자 %d: ", i + 1);
			num[i] = sc.nextInt();
		}
		for(int j = 0; j <num.length; j++) {
			if(num[j] > max) {
				max = num[j];
			}
		}
		System.out.printf("최대값은 %d입니다.", max);
		sc.close();
	}

}
