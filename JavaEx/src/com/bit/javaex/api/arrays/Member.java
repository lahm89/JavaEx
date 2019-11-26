package com.bit.javaex.api.arrays;
// 사용자 정의 클래스 정렬은 Comparable 인터페이스 구현 필요
public class Member implements Comparable {
	// 필드
	String name;
	
	// 생성자
	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		// 두 개의 객체를 비교하기 위해 compareTo 메소드에 비교 방법 기술
		// name 필드를 대상으로 대소 비교
		if (o instanceof Member) {
			// 다운캐스팅 가능
			Member other = (Member)o;
			return name.compareTo(other.name);
			// 비교대상이 작은 경우 : -1, 비교대상이 동일한 경우 : 0, 비교대상이 큰 경우 : 1
		}
		return 0;
	}
}
