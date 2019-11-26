package com.bit.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// Wrapper 클래스(포장 클래스)
		// 자바는 객체지향 언어라 객체만 사용 가능한 메소드가 다수
		// 메소드에 기본 타입을 사용하고 싶은 경우 포장클래스를 통해 객체로 포장
		Integer i = new Integer(10);
		Character c = new Character('c');
		// new를 이용한 Wrapper클래스의 생성은 JDK9부터 deprecated->앞으로는 valueOf를 활용
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		
		// valueOf의 경우 문자열로 입력 가능
		Integer i2 = Integer.valueOf("10");
		Double d = Double.valueOf("3.14159");
		// *valueOf에 넘겨준 문자열이 해당 자료형 타입일 경우만 가능
//		Integer i3 = Integer.valueOf("a123");	// error : a123은 정수가 아님
		
		// 변환 관련 메소드 : parse 메소드->문자열을 해당 데이터 타입으로 변경 또는 다른 형태로 출력
		System.out.println(Integer.parseInt("-123"));		// 문자열->정수
		System.out.println(Integer.parseInt("FF", 16));		// 16진수 FF->정수
		System.out.println(Integer.toBinaryString(2019));	// 2진수 문자열
		System.out.println(Integer.toHexString(2019));		// 16진수 문자열
		
		// 형 변환
		double d2 = i2.doubleValue();	// 정수 i2->double로 변환
		
		// 박싱
		Integer i3 = 2019;	// JDK5 이후 자동 박싱
		// 언박싱
		System.out.println(i3.intValue());
	}

}
