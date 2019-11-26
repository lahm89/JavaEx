package com.bit.javaex.practice.project_euler;

import java.util.Scanner;

public class BinarySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, sum = 0, i = 0;
		
		System.out.println("두 수를 입력해주세요.");
		try {
			System.out.print("숫자1 >> ");
			num1 = sc.nextInt();
			System.out.print("숫자2 >> ");
			num2 = sc.nextInt();
			
			sum = num1 + num2;
			// 이진법으로 변환
			int[] bins = new int[32];
		
			while(true) {
				bins[i] = sum % 2;
				sum /= 2;
				if(sum == 1) {
					i++;
					bins[i] = sum;
					break;
				} else if(sum == 0) {
					break;
				}
				i++;				
			}
			System.out.print("답 >> ");
			for(int j = i; j >= 0; j--) {
				System.out.print(bins[j]);
			}
		} catch(Exception e) {
			System.out.print("잘못 입력하셨습니다.");
		}
		sc.close();
	}

}
