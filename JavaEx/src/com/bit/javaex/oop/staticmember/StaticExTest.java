package com.bit.javaex.oop.staticmember;

public class StaticExTest {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		// 처음 StaticEx Class를 불러오므로 static 블록이 1회 호출 후 StaticEx 생성자 호출
		System.out.println("참조 갯수: " + StaticEx.refCount);	// static 멤버는 인스턴스화 없이도 접근 가능
		
		StaticEx s2 = new StaticEx();
		StaticEx s3 = new StaticEx();
		
		s2 = null;	// 사용 해제
		System.out.println("s2를 해제");
		
		System.gc();// 가비지 컬렉터 호출 -> 일반적인 상황에서는 사용 권장하지 않음
		try {
			Thread.sleep(3000);
			System.out.println("참조 갯수: " + StaticEx.refCount);
		} catch(Exception e) {
			
		}
	}

}
