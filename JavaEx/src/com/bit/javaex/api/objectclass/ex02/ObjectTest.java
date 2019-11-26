package com.bit.javaex.api.objectclass.ex02;

public class ObjectTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		// java의 최상위 클래스는 Object -> 모든 클래스는 Object 클래스 내 모든 메소드 사용 가능
		System.out.println(p.getClass().getName());
		System.out.println("Hashcode: " + p.hashCode());
		System.out.print("toString: " + p.toString());	// toString() 생략 가능
		System.out.print("Point	: " + p);					// toString() 생략
		
		// == 은 객체의 동일성 비교 : 동일한 객체인가 비교
		// .equals는 객체의 값의 비교 : 같은 값인가 비교
		Point p2 = new Point(10, 10);
		System.out.println("p와 p2는 같은 객체인가? " + (p == p2));
		// Point p 와 Point p2의 값을 비교
		System.out.println("P와 p2는 같은 값인가? " + p.equals(p2));
	}

}
