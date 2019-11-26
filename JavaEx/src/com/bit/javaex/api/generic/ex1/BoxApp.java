package com.bit.javaex.api.generic.ex1;

public class BoxApp {

	public static void main(String[] args) {
		// Box 클래스 테스트
		Box intBox = new Box();
		intBox.setContent(2019);
		
		// 내용 반환
		int retVal = (int)intBox.getContent();
		System.out.println(retVal);
		
		Box strBox = new Box();
		strBox.setContent("Java");
		String strVal = (String)strBox.getContent();
		System.out.println(strVal);
		// Object 타입을 데이터 참조하면 캐스팅 문제 등 부가적 문제 발생
		
		// 캐스팅이 잘못된 경우
		strVal = (String)intBox.getContent();	// 컴파일은 가능하나 에러 발생
	}

}
