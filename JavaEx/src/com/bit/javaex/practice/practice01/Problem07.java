package com.bit.javaex.practice.practice01;

import java.util.Scanner;

public class Problem07 {
	public static void problem07() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			System.out.println("=========================\n"
					+ "     [숫자맞추기게임 시작]\n=========================");
			int num = (int)(Math.random()*100) + 1;	// Random 수 생성
			while(true) {
				System.out.print(">>");
				int i = sc.nextInt();
				if(i < num) {
					System.out.println("더 높게");
					continue;
				}
				else if(i > num) {
					System.out.println("더 낮게");
					continue;
				}
				else {
					System.out.println("정답입니다!");
					break;
				}
			}
			System.out.print("게임을 종료하시겠습니까?(Y/N) >>");
			String con  = sc.next();
			if(con.equals("N") || con.equals("n"))
				continue;
			else
				break;
		}
		System.out.println("=========================\n"
				+ "     [숫자맞추기게임 종료]\n=========================");
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem07();
	}

}
