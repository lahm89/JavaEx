package com.bit.javaex.oop.shape.v1;

// 도형을 작성하기 위한 부모 설계 클래스
// 실체화할 필요 없음 -> 추상 클래스
public abstract class Shape {
	// 필드 선언
	protected int x;
	protected int y;
	
	// 생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 메소드 : 구현부가 없으므로 상속받은 자식 클래스에서 반드시 구현 필요
	public abstract void draw();
	public abstract double area();
		
}
