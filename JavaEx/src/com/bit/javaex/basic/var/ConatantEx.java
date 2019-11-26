package com.bit.javaex.basic.var;

public class ConatantEx {
	// 상수 static final
	// final은 한번 할당되면 재할당 불가함
	static final double PI = 3.14159;
	// 상수의 이름은 모두 대문자
	// 단어의 구분은 _로 함
	static final int SPEED_LIMIT = 100;
	
	public static void main(String[] args) {
		
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		// 1. 가독성 높임 2. 동일값 일괄 관리 3. 값 보호
		
		System.out.println("현재 제한 속도는 " + SPEED_LIMIT + "입니다.");
		//SPEED_LIMIT = 120;	// final은 변경 불가능
		
		System.out.println(SPEED_LIMIT + "이하로 주행해 주십시오.");
		
		// java는 상수를 많이 활용함
		System.out.println(Math.PI);	// 내장 Math 객체의 상수

	}

}
