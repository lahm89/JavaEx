package com.bit.javaex.api.objectclass.ex02;
// 특정 클래스를 extends 하지 않아도 java.lang.Objict 클래스 자동 상속
// java의 최상위 클래스는 언제나 Object 클래스
public class Point {
	// 필드
	private int x;
	private int y;
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// Getter
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	// 문자열 출력을 위한 toString 메소드 오버라이드
	@Override
	public String toString() {
		return String.format("Point(%d, %d)%n", x, y);	// 출력할 데이터를 리턴
	}
	
	// 내부 값의 비교를 위해서 equals 메소드 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {		// obj는 Point의 객체인지 확인 -> 캐스팅 가능
			Point other = (Point)obj;	// 캐스팅을 하여 x, y의 값 비교 가능해짐
			return x == other.x && y == other.y;
		}
		return super.equals(obj);	// obj가 Point가 아닐 경우
	}
}
