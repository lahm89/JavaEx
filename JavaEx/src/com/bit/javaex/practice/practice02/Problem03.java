package com.bit.javaex.practice.practice02;

public class Problem03 {

	public static void main(String[] args) {
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};
		
		for(int i = 0; i < c.length; i++)	{
			System.out.print(c[i]);
			if(c[i] == ' ') {
				c[i] = ',';
			}
		}
		System.out.println();
		/*for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		for(char i: c) {
			System.out.print(i);
			if(i == ' ') {
				i = ',';
			}
		}
		System.out.println();*/
		for(char i: c) {
			System.out.print(i);
		}
	}

}
