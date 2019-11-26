package com.bit.javaex.practice.project_euler;

import java.util.Scanner;

public class BinarySum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 필드 생성
		int num1, num2, sum = 0, i = 0;
		
		System.out.println("2개의 정수를 입력해주세요.");
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
			
			// 답의 출력
			System.out.print("답 >> ");
			if(bins[i] == -1) {					// 음수의 출력식
				System.out.print("-0b");
				for(int j = i; j >= 0; j--) {
						System.out.print(bins[j]*-1);
				}
			} else {							// 음수를 제외한 나머지 출력식
				for(int j = i; j >= 0; j--) {
					System.out.print(bins[j]);
				}
			}
		} catch(Exception e) {
			System.out.print("정수를 입력해주세요.");
		}
		sc.close();
	}

}
