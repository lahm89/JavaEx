package com.bit.javaex.practice.extra01;

public class Question05 {
	private int scores[];
	
	public Question05(int scores[]) {
		this.scores = scores;
	}
	
	public int getTotal() {
		int total = 0;
		//	TODO: 여기에 로직 코드를 작성합니다
		for(int score: scores) {
			if (score >= 0 && score <= 100) {
				total += score;
			}
		}
		
		return total;
	}
	
	public double getAverage() {
		int total = 0, count = 0;
		//	TODO: 여기에 로직 코드를 작성합니다
		for(int score: scores) {
			if(score >= 0 && score <= 100) {
				total += score;
				count++;
			}
		}
		return total / count;
	}
}
