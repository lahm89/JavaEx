package com.bit.javaex.io.charstream;

import java.io.File;
import java.util.Scanner;

public class ScannerEx {
	// Scanner : 다양한 입력 소스로부터 다양한 타입의 값을 입력받는 범용 클래스
	//			  데이터 입력 시 Scanner로 구현 가능하면 Scanner를  사용할 것을 권장
	static String dirName = "D:\\javastudy\\files";
	static String fileName = dirName + "\\thieves.txt";
	
	public static void main(String[] args) {
		// Scanner에 넘겨 주기 위한 File의 정보
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			String name;
			float height;
			float weight;
			while(scanner.hasNextLine()) {
				name = scanner.next();
				height = scanner.nextFloat();
				weight = scanner.nextFloat();
				System.out.printf("%s, 키 : %f, 체중 : %f%n", name, height, weight);
				scanner.nextLine();	// 개행문자 읽어오기용
			}
			scanner.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
