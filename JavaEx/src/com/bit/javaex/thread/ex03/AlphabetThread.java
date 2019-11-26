package com.bit.javaex.thread.ex03;

public class AlphabetThread implements Runnable 	{
	// Runnable 인터페이스를 구현한 스레드 클래스
	@Override
	public void run() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("AlphabetThread : " + ch);
			// 출력 속도 제한 : Thread.sleep()
			try {
				Thread.sleep(300);	// 0.3초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}

}
