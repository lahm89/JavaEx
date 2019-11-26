package com.bit.javaex.quiz02;

public class Quiz02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 6;
		char c= 'A';
		System.out.println(a + "는 짝수입니까? "+ (a % 2 == 0));
		System.out.println(b + "는 3의 배수입니까? " + (b % 3 == 0));
		boolean r1 = (a % 2 == 0) && (b % 3 ==0);
		System.out.println(r1);
		int r2 = c + 4;
		System.out.println((char)r2);

	}

}
