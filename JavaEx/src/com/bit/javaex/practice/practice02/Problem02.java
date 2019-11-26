package com.bit.javaex.practice.practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int sum = 0;
		/*for(int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}*/
		for(int i: num) {
			i = sc.nextInt();
			sum += i;
		}
		System.out.printf("평균은 %.1f 입니다.", (float)sum/num.length);
		sc.close();
	}

}
