package com.bit.javaex.basic.reftype;

public class ArrayEx {
	public static void defineArray() {
		// 배열의 선언
		String[] names;	// = String names[];
		int scores[];	// = int[] scores;
		
		// names 배열 초기화
		names = new String[] {
				"홍길동", "전우치", "장길산"
		};	// 데이터가 이미 있는 경우 개수 표기 X
		
		// 선언 시 이미 데이터를 알고 있는 경우
		int height[] = {
				175, 180, 176
		};	// 선언과 동시에 초기화
		
		scores = new int[4];	// 4개의 공간을 가진 빈 배열
		// 배열 내부 공간 접근시 인덱스 사용, * 인덱스는 0 ~ Array.lenght-1 *
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 80;
//		scores[4] = 100;	// 배열 범위를 벗어남 -> 에러
		
		// scores 배열의 점수를 합산한 총점과 평균을 출력
		int total = 0;
		
		for(int i =0; i < scores.length; i++) {
			total += scores[i];
		}
		
		System.out.printf("총점 %d, 평균 %.2f%n", total, (float)total / scores.length);
	}
	public static void multiDim() {
		// 2차원 배열(배열의 배열)
		int[][] twoDim = new int[5][10];	// 5행 10열 빈 배열
		
		int table[][] = {
				{1, 2, 3, 4, 5},
				{2, 3, 4, 5, 1},
				{3, 4, 5, 1, 2},
				{4, 5, 1, 2, 3}
		};
		
		System.out.println("table의 행 수:" + table.length);
		System.out.println("table의 0번 인덱스:" + table[0]);
		System.out.println("table의 열 수:" + table[1].length);
		
		// table 배열 안에 있는 모든 정수를 합산
		int total = 0;
		// 루프 시작
		for(int row = 0; row < table.length; row++) {			// 행 루프
			for(int col= 0; col < table[row].length; col++) {	// 열 루프
				int value = table[row][col];
				System.out.print(value + "\t");	//출력
				total += value;
			}
			System.out.println();
		}
		System.out.println("table의 총 합:" + total);
	}
	public static void arrayCopy() {
		// 배열은 생성되면 크기 변경 불가능 -> solution : 더 큰 크기의 새 배열 생성 후 항목값 복사
		int source[] = {1, 2, 3};
		int target[] = new int[10];	// 10개짜리 빈 배열
		
		//복사를 위한 루프 시작
		for(int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
		for(int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
		
		// Enhanced For : 증감 변수 없이 순차 자료형(배열 포함)의 요소를 처음부터 한개씩 끝까지 반환
		for(int val: target) {
			System.out.print(val + "\t");
		}
		System.out.println();
	}
	public static void arrayCopySystem() {
		int source[] = {1, 2, 3};
		int[] target = new int[10];
		
		System.arraycopy(source,		// 원본 배열 
						0,				// 원본 배열의 시작 인덱스
						target,			// 대상 배열(target)
						5,				// 타겟 배열의 인덱스 
						source.length);	// 복사할 길이
		
		for(int val: target) {
			System.out.print(val + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
//		defineArray();
//		multiDim();
		arrayCopy();
		arrayCopySystem();
	}

}
