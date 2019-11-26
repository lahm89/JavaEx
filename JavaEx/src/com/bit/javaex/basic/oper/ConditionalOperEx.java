package com.bit.javaex.basic.oper;

public class ConditionalOperEx {

	public static void main(String[] args) {
		// 3항 연산자 : 조건식 ? 참일 경우 : 거짓일 경우
		int a = 10;
		String result = a % 2 == 0 ? "짝수야" : "홀수야";
		
		System.out.println(a + "는 " + result);
		
		// score가 80점 이상이면 Good, 80점 미만 50점 이상이면 Pass, 그렇지 않으면 Fail
		int score = 40;
		String message;
		message = score >= 80 ? "Good!" : score >= 50 ? "Pass" : "Fail~";
		System.out.println("Score:" + score + ", Result:" + message);
		
	}

}
