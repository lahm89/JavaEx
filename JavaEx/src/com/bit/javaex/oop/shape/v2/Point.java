package com.bit.javaex.oop.shape.v2;

public class Point implements Drawable {
	// 필드 생성(protected : 상속받은 클래스에서 접근 가능)
	protected int x;
	protected int y;
	
	// 생성자
//	public Point() {
//		// 기본생성자
//	}
	public Point(int x, int y) {
		// super();가 생략된 상태
		this.x = x;
		this.y = y;
	}
	
	// Getter and Setter
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드
	@Override
	public void draw() {
		System.out.printf("점 [%d, %d]을 그렸습니다.%n", x, y);
	}
	// 메소드 오버로딩(다형성) -> 인자값에 따라 다른 기능을 수행하는 같은 리턴 타입, 같은 이름의 메소드를 중복 선언
	public void draw(boolean show) {
		// boolean show가 true -> 그렸습니다, false -> 지웠습니다
		String message = String.format("점 [%d, %d]을 ", x, y);
		if(show) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		System.out.println(message);
	}
}
