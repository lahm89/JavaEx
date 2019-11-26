package com.bit.javaex.collection;

import java.util.Stack;

public class StackEx {
	// Stack : Last Input First Output
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// Stack은 Vector를 상속함 -> 버퍼가 있는 자료형
		// 루프를 돌며 Stack에 값 저장
		for(int i = 1; i <= 10; i++) {
			stack.push(i);	// stack에 input
		}
		System.out.println("STACK:" + stack);
		
		// 가장 마지막 값을 확인 : peek
		int out = stack.peek();	// 데이터 추출 없음
		System.out.println("PEEK:" + out);
		System.out.println("STACK:" + stack);
		
		// 데이터 추출 : pop
		out = stack.pop();
		System.out.println("POP:" + out);
		System.out.println("STACK:" + stack);
		
		// 루프를 돌며 데이터를 pop
		while(!stack.empty()) {
			// 비어있는 stack에서 데이터를 pop할 경우 예외발생
			System.out.println("POP:" + stack.pop());
			System.out.println("STACK:" + stack);
		}
	}
}
