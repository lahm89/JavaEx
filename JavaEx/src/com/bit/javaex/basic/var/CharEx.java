package com.bit.javaex.basic.var;

public class CharEx {

	public static void main(String[] args) {
		// char 2바이트 유니코드
		// 홑따옴표(') 사용, 내부적으로는 코드값이 입력
		char ch1 = 'A';
		char ch2 = 'a';
		char ch3 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.println(ch1 + ch2);
		
		// 문자열 String을 사용(기본자료형 X, 참조자료형)
		// 쌍따옴표(") 사용
		String str = "Hello Java";
		System.out.println(str);
	}

}
