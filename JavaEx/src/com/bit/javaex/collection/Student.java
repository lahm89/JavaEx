package com.bit.javaex.collection;

public class Student {
	// 필드
	private String name;	// 이름
	private int id;			// 학번
	
	// 생성자
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {		// obj가 Student의 객체인지 확인
			Student other = (Student)obj;	// 다운캐스팅
			return name.equals(other.name) && id == other.id;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// 객체를 식별하는 정수, 객체를 빠르게 검색하기 위한 코드값
		// 두 객체의 hashCode가 다를 경우->다른 객체
		// hashCode가 일치할 경우->내부 값을 추가로 비교(equals
		return id;
	}
	
}
