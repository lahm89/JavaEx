package com.bit.javaex.oop.shape.v2;

public class ShapeApp {
	public static void main(String[] args) {
//		Shape s = new Shape();	// error : 추상 클래스이므로 인스턴스화 불가
		Drawable r = new Rectangle(10, 10, 100, 50);
		r.draw();
		
		Drawable c = new Circle(20, 20, 10);
		c.draw();
		
		// Rectangle, Circle은 Shape를 상속받은 객체
		// Point는 직접 상속관계에 포함되지않은 별개의 객체
		// 인터페이스 Drawalbe을 공통적으로 구현한 객체이므로 Drawable 타입으로 참고 가능
		
		c = new Point(10, 10);
		
		if (c instanceof Drawable) {
			c.draw();
		}
		
		Drawable[] objs = new Drawable[3];
		objs[0] = new Rectangle(10, 10, 100, 50);
		objs[1] = new Circle(20, 20, 50);
		objs[2] = new Point(30, 30);
		
		for (Drawable obj: objs) {
			obj.draw();
		}
	}

}
