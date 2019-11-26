package com.bit.javaex.api.objectclass.examples;

public class Rectangle {
	// 두 사각형의 면적이 같으면 equals(같다) 판정
	// 필드
	private int width;
	private int height;
	// 생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	// 메소드
	public int getArea() {
		return width * height;
	}
	@Override
	public boolean equals(Object obj) {
		// obj가 비교가능한 객체인지 먼저 확인
		if (obj instanceof Rectangle) {
			// obj는 Rectangle로 캐스팅 가능
			Rectangle other = (Rectangle)obj;
			return getArea() == other.getArea();
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			return getArea() == ((Rectangle) obj).getArea();
		}
		else return super.equals(obj);
	}*/
}
