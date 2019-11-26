package com.bit.javaex.collection;

import java.util.HashSet;

public class HashSetEx {
	// HashSet(집합) : 순서는 중요하지않음, 내부 데이터는 중복 삽입 불가
	public static void basicHashSet() {
		// Java의 기본 객체들을 테스트
		// HashSet 생성
		HashSet<String> hs = new HashSet<>();
		// 객체 추가
		hs.add("Java");
		hs.add("Python");
		hs.add("C");
		hs.add("C++");
		hs.add("Java");	// 중복삽입 -> 실행안됨
		System.out.println("SET:" + hs);
		System.out.println("SIZE:" + hs.size());
		
		// 포함 여부 확인
		System.out.println("C++ 포함하고 있는가?" + hs.contains("C++"));
		System.out.println("없는 데이터의 확인:" + hs.contains("Linux"));
		
		// 객체 삭제
		hs.remove("C++");
		System.out.println("SET:" + hs);
		
		// 셋 비우기
		hs.clear();
		System.out.println("SET:" + hs);
	}
	
	public static void customClassHashSet() {
		// 사용자 정의 클래스를 HashSet에서 사용
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("장길산", 20);
		Student s3 = new Student("홍길동", 10);
		
		// HashSet에 담기
		hs.add(s1); hs.add(s2); hs.add(s3);
		System.out.println("HashSet:" + hs);
		
		// s1과 s2의 hashCode 확인
		System.out.println("hashcode of s1:" + s1.hashCode());
		System.out.println("hashcode of s2:" + s2.hashCode());
		System.out.println("hashcode of s3:" + s3.hashCode());
		// hashCode : 빠른 검색을 위해 객체를 식별하기 위한 하나의 정수값
		//			  Object 클래스는 hashCode로 메모리 주소값 사용
		
		// Student 객체의 이름, id가 동일 -> 동등 객체로 판단
		// 같은 값을 가진 객체가 넘어올 때 중복 삽입 방지
	}
	public static void main(String[] args) {
//		basicHashSet();
		customClassHashSet();
	}

}
