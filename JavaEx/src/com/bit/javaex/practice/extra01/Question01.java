package com.bit.javaex.practice.extra01;

public class Question01 {
	public void printAnswer(int toNum) {
		//	TODO: 이곳에 해답을 작성합니다.
		for(int i = 1; i <= toNum; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				System.out.print("* ");
			else
				System.out.print(i + " ");
		}
		System.out.println();
	}
}
