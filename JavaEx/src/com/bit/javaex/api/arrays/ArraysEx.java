package com.bit.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {
	public static void arrayCopyEx() {
		// 배열의 복사->Arrays 클래스를 이용해 복사하기
		char src[] = "Java Programming".toUpperCase().toCharArray();
		// 출력 : Arrays.toString()
		System.out.println("Arrays.toString: " + Arrays.toString(src));
		
		// 복사
		char target[] = Arrays.copyOf(src, src.length);
		System.out.println("복제된 배열: " + Arrays.toString(target));
		
		// src와 target은 같은 객체인가?
		System.out.println(src == target);
		
		// 일부 복사 : copyRangeOf
		target = Arrays.copyOfRange(src, 5, 10);	// src 배열 5번 인덱스부터 10번 인덱스 전까지 복사
		System.out.println("범위 복사: " + Arrays.toString(target));
	}
	
	public static void sortEx() {
		// 배열의 정렬
		int scores[] = { 80, 70, 90, 75, 65, 50, 77, 88 };
		System.out.println("원본 배열: " + Arrays.toString(scores));
		Arrays.sort(scores);	// 기본 정렬 : 오름차순
		System.out.println("기본 정렬: " + Arrays.toString(scores));
		// 내림차순 정렬
		Integer[] scores2 = { 80, 70, 90, 75, 65, 50, 77, 88 };
		Arrays.sort(scores2, Collections.reverseOrder());
		System.out.println("역순 정렬: " + Arrays.toString(scores2));
	}
	
	public static void binarySearchEx() {
		// 기본 타입의 검색
		int[] nums = { 5, 3, 6, 1, 4, 2, 7, 10 };
		
		// nums로부터 5 검색
		// binarySearch는 정렬되어있는 데이터에서만 가능
		Arrays.sort(nums);
		int index = Arrays.binarySearch(nums, 5);
		System.out.println("5의 인덱스: " + index);
		System.out.println("nums 배열: " + Arrays.toString(nums));
		
		String[] words = "Java C C++ Python Linux".split(" ");
		// words에서 Python 검색
		Arrays.sort(words);
		index = Arrays.binarySearch(words, "Python");
		System.out.println("Python의 인덱스: " + index);
		System.out.println(Arrays.toString(words));
	}
	
	public static void customClassSortEx() {
		// Member의 배열 생성 후 정렬
		Member[] members = {
				new Member("홍길동"),
				new Member("장길산"),
				new Member("전우치")
		};
		System.out.println("원본 배열: " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬 배열: " + Arrays.toString(members));
	}
	public static void main(String[] args) {
//		arrayCopyEx();
//		sortEx();
//		binarySearchEx();
		customClassSortEx();
	}

}
