package com.bit.javaex.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
	// List 인터페이스 : List는 설계도, 실제 클래스는 LinkedList, ArrayList 등으로 구현
	// LinkedList	-> 중간에 값이 빈번하게 삽입, 삭제되는 경우 효율적
	// ArrayList	-> 맨뒤에 값이 추가 되는 경우, 중간에서는 빈번하지 않을 경우 효율적
	public static void main(String[] args) {
//		List<String> list = new LinkedList<>();
		List<String> list = new ArrayList<>();	// Linked->Array 교체 가능
		
		// 객체 추가
		list.add("Java");	// 맨 마지막에 객체 추가
		list.add("Python");
		list.add("C");
		list.add("C++");
		
		// 객체 삽입
		list.add(2, "Linux");		// list는 원래 인덱스 사용이 불가, 자바에서 제공해주는 편의
		System.out.println("List:" + list);
		System.out.println("Size of List:" + list.size());
		// size는 확인이 되나 capacity는 확인 불가
		
		// 객체 삭제
		list.remove(2);			// 인덱스로 삭제
		list.remove("Python");	// 객체로 삭제
		list.remove("C#");		// 없는 객체의 삭제
		System.out.println("List:" + list);
		
		/* 루프
		for(String item: list) {
			System.out.println("Element:" + item);
		}*/	
		// Iterator : List, Set
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {	// 다음 데이터 여부 확인
			String item = it.next();
			System.out.println("Element:" + item);
		}
		
		
		// 비우기
		list.clear();
		System.out.println("List:" + list);
	}

}
