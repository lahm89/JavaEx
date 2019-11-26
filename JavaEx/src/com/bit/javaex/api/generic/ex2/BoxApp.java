package com.bit.javaex.api.generic.ex2;

public class BoxApp {

	public static void main(String[] args) {
		// Box 클래스 테스트
		Box<Integer> intBox = new Box<>();
		intBox.setContent(2019);
//		intBox.setContent("String");	// error : 내부데이터 타입 불일치
		// 내용 반환
		// 내용 타입을 객체 생성시 지정하므로 다운캐스팅 무필요
		int retVal = intBox.getContent();
		System.out.println(retVal);
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");
		String strVal = strBox.getContent();
		System.out.println(strVal);
		// Object 타입을 데이터 참조하면 캐스팅 문제 등 부가적 문제 발생
		
		// 캐스팅이 잘못된 경우
		// Generic 클래스는 내부 데이터 타입을 강제했기 때문에 컴파일 타임에서 캐스팅 오류
//		strVal = (String)intBox.getContent(); 
	}

}
