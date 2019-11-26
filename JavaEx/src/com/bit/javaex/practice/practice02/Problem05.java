package com.bit.javaex.practice.practice02;

public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scoreboard[][] = {    
				{ 80, 75, 90, 95, 78 },     
				{ 92, 88, 89, 92, 70 },     
				{ 78, 80, 85, 86, 63 },     
				{ 83, 84, 89, 87, 75 },     
				{ 89, 83, 93, 94, 78 }   };
		int total = 0, count = 0;
		for(int i = 0; i < scoreboard.length; i++) {
			for(int j = 0; j < scoreboard[i].length; j++) {
				if(scoreboard[i][j] >= 85) {
					total += scoreboard[i][j];
					count++;
				}
			}
		}
		System.out.printf("총 합 : %d%n평균값 : %d", total, total / count);
	}

}
