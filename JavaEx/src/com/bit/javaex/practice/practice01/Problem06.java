package com.bit.javaex.practice.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		if(num % 2 ==0) {
			for(int i = 2; i <= num; i += 2) {
				sum += i;
			}
		}
		else {
			for(int i = 1; i <= num; i += 2) {
				sum += i;
			}
		}
		System.out.printf("결과값: %d", sum);
		sc.close();
	}

}
