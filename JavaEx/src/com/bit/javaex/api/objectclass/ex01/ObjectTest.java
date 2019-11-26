package com.bit.javaex.api.objectclass.ex01;

public class ObjectTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		// java의 최상위 클래스는 Object -> 모든 클래스는 Object 클래스 내 모든 메소드 사용 가능
		System.out.println(p.getClass().getName());
		System.out.println("Hashcode: " + p.hashCode());
		System.out.print("toString: " + p.toString());	// toString() 생략 가능
		System.out.print("Point	: " + p);					// toString() 생략
	}

}
