package com.bit.javaex.api.objectclass.examples;

public class Circle {
	// 필드
	private int x, y, radius;
	// 생성자
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	// 메소드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			return radius == ((Circle)obj).radius;
		}
		return super.equals(obj);
	}
		
}
