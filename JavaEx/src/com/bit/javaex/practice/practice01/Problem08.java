package com.bit.javaex.practice.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i;
		int dep = 0;
		do {
			System.out.print("\n-------------------------\n1.예금 |2.출금 |3.잔고 |4.종료\n-------------------------\n선택>");
			num = sc.nextInt();
			switch(num){
			case 1:
				System.out.print("예금액>");
				i = sc.nextInt();
				dep += i;
				break;
			case 2:
				System.out.print("출금액>");
				i = sc.nextInt();
				dep -= i;
				break;
			case 3:
				System.out.println("잔고액>" + dep);
				break;
			case 4:
				System.out.print("프로그램 종료");
				break;
			default:
				System.out.println("다시 입력해 주세요.");
			}
		}while(num != 4);
		sc.close();
	}

}
