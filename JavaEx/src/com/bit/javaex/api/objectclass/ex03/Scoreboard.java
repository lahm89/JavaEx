package com.bit.javaex.api.objectclass.ex03;

import java.util.Arrays;

// 복제 가능하도록 Clonealbe 인터페이스 구현
public class Scoreboard implements Cloneable {
	// 필드로 참조형이 있을 경우
	private int scores[];
	
	// 생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}
	
	// 복제를 위한 getClone메소드 구현
	public Scoreboard getClone() {
		Scoreboard newBoard = null;
		try {
			newBoard = (Scoreboard)clone();
			// clone 메소드 실행시 내부 참조자료도 복사하여 새로 할당 -> clone 메소드 오버라이드 필요
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return newBoard;
	}
	
	// Getter and Setter
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 1. 먼저 얕은 복제 시도
		// 2. 내부 참조자료형을 복제하여 다시 할당
		Scoreboard newBoard = (Scoreboard)super.clone();
		newBoard.scores = Arrays.copyOf(scores, scores.length);
		return newBoard;
	}

	@Override
	public String toString() {
		String output = "Scoreboard(";
		for (int i = 0; i < scores.length; i++) {
			output += scores[i];
			if (i < scores.length - 1) {
				output += ",";
			}
		}
		output += ")";
		return output;
	}
}
