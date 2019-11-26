package com.bit.javaex.practice.project_euler;

public class Problem03 {
	public static boolean primeNumCheck(long num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return true;
			}
		}
		return false;
	}
	public static int nextPrimeNum(int num) {
		for(int i = num +1; ; i++) {
			if(!primeNumCheck(i)) {
				return i;
			}
		}
	}
	public static void main(String[] args) {
		long num = 600851475143L;
		int primeNum = 2;
		String result = "";
		boolean check = primeNumCheck(num);
		
		while(check) {
			if(num % primeNum == 0) {
				result += primeNum + "*";
				num /= primeNum;
			} else {
				primeNum = nextPrimeNum(primeNum);
				continue;
			}
			
			check = primeNumCheck(num);
		}
		result += num;
		
		System.out.println("소인수분해 결과 : " + result);
		
	}

}
