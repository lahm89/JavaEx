package com.bit.javaex.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	// Queue : 입력 방향과 출력 방향이 반대, 중간의 값 입출력 불가
	public static void main(String[] args) {
		// Queue 생성 :	Queue는 클래스가 아닌 Interface이므로
		//				실체 클레스는 LinkedList, ArrayList의 기능을 이용
		Queue<Integer> queue = new LinkedList<>();
		
		// 데이터 입력 : offer
		for(int i = 1; i <= 10; i++) {
			queue.offer(i);
		}
		System.out.println("QUEUE:" + queue);
		
		// 가장 처음 입력된 값을 확인 : peek
		int out = queue.peek();
		System.out.println("PEEK:" + out);
		System.out.println("QUEUE:" + queue);
		
		// 데이터 출력 : poll
		out = queue.poll();
		System.out.println("POLL:" + out);
		System.out.println("QUEUE:" + queue);
		
		// 루프를 통한 데이터 전체 출력
		while(!queue.isEmpty()) {
			System.out.println("POLL:" + queue.poll());
			System.out.println("QUEUE:" + queue);
		}
	}
}
