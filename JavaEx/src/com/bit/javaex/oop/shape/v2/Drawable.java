package com.bit.javaex.oop.shape.v2;

public interface Drawable {
	// 상속 관계에 상관 없이 비슷한 기능이 있을 경우
	// 부자연스러운 상속 관계를 피해 기능을 횡적 확장
	public void draw();
}
