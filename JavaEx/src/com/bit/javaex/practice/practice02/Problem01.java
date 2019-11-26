package com.bit.javaex.practice.practice02;

public class Problem01 {

	public static void main(String[] args) {
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int count = 0, sum = 0;
		/*for(int i = 0; i < data.length; i++) {
			if(data[i] % 3 == 0) {
				count++;
				sum += data[i];
			}
		}
		*/
		for(int i:data) {
			if(i % 3 == 0) {
				count++;
				sum += i;
			}
		}
		System.out.printf("주어진 배열에서 3의 배수의 개수=>%d%n주어진 배열에서 3의 배수의 합=>%d", count,sum);
	}
}
