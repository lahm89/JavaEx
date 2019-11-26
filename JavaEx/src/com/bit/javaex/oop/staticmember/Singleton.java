package com.bit.javaex.oop.staticmember;
// Singleton 예제
// 전체 프로그램 내에서 단 하나의 인스턴스만 유지해야 할 결우
public class Singleton {
	static Singleton instance = new Singleton();
	
	private Singleton() {
		// new 생성 불가
	}
	
	// new로 생성 불가하므로 instance를 확보할 수 있는 메소드 필요
	public static Singleton getInstance() {
		return instance;	// 프로그램 전체에서 단일 instance 유지
	}
}
