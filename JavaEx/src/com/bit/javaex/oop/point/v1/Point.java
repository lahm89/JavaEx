package com.bit.javaex.oop.point.v1;

public class Point {
	// 필드 생성(private)
	private int x;
	private int y;
	
	// Getter and Setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드
	public void draw() {
		System.out.printf("점 [%d, %d]을 그렸습니다.%n", x, y);
	}
}
