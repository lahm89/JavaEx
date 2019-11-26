package com.bit.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape();	// error : 추상 클래스이므로 인스턴스화 불가
		Shape r = new Rectangle(10, 10, 100, 50);
		r.draw();
		
		Shape c = new Circle(20, 20, 10);
		c.draw();
	}

}
