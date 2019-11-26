package com.bit.javaex.practice.practice02;

public class Problem04 {

	public static void main(String[] args) {
		
		int nums[] = new int[6];
		int i = 0;
		
		while(i < nums.length) {
			int randomNum = (int)(Math.random() * 45) + 1;
			boolean isDuplicated = false;
			
			for(int num:nums) {
				if(randomNum == num ) {
					isDuplicated = true;
				}
			}
			
			if(isDuplicated) {
				continue;
			}
			
			nums[i] = randomNum;
			System.out.print(nums[i] + "\t");
			i++;
		}
		System.out.println();		
	}

}
