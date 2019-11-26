package com.bit.javaex.practice.extra01;

public class Question02 {
	public int getAnswer(int toNum) {
		//	TODO: 이곳에 해답을 작성합니다.
		int result = 1;
		for (int i = 2; i <= toNum; i++) {
			for(int j = result; result > 0; j--) {
				if(result % j == 0 && i % j == 0) {
					result = result*i/j;
					break;
				}
			}
		}
		return result;
	}
}
