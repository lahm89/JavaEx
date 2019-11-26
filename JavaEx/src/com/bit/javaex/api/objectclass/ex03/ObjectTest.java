package com.bit.javaex.api.objectclass.ex03;

public class ObjectTest {

	public static void main(String[] args) {
		// Point 클래스의 복제 테스트
		Point p = new Point(10, 10);
		System.out.print(p);
		Point p2 = p;
		System.out.print(p2);
		// 두 객체는 별개의 객체인가?
		System.out.println(p == p2);	// 두 식별자는 같은 객체를 참조
		
		// 객체 복제(얕은 복제)
		p2 = p.getClone();
		// point 클래스는 Cloneable 인터페이스 구현, getClone 메소드 구현하였기 때문에 복제 객체 생성 가능
		System.out.print(p2);
		System.out.println(p == p2);
		// p2는 복제된 새로운 객체
		
		// Scoreboard 복제 테스트
		// Scoreboard는 내부에 참조형(배열)을 소유
		Scoreboard s1 = new Scoreboard(new int[] {10, 20, 30, 40});
		System.out.println("s1=" + s1);
		Scoreboard s2 = s1.getClone();
		System.out.println("s2=" + s2);
		// s1과 s2는 같은 객체인가?
		System.out.println(s1 == s2);	// s2는 복제된 새 객체
		
		// s2 내부의 참조차료(배열)의 값을 변경
		s2.getScores()[2] = 100;
		System.out.println("s2=" + s2);
		System.out.println("s1=" + s1);
		// 얕은 복제의 경우, 참조자료형은 주소값만 복제
		// 내부 참조자료형은 clone 시 새로 복제해서 다시 참조 -> 깊은 복제 *매우중요*
	}

}
