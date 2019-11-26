package com.bit.javaex.io.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static String dirName = "D:\\javastudy\\files";
	static String fileName = dirName + "\\mytext.txt";
	
	public static void writeText() {
		// 새로 텍스트 파일 생성 후 FileWriter를 이용하여 텍스트 파일에 내용을 저장
		try {
			// Writer 생성(Char Writer Stream의 최상위 클래스)
			Writer writer = new FileWriter(fileName);
			writer.write("Bit Computer\r\n");	// \r\n 윈도우의 개행
			writer.write("Java Programming\r\n");
			writer.write("2019.09\r\n");
			writer.flush();	// 버퍼 비우기
			writer.close();
			
			System.out.println("텍스트 파일 기록");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readText() {
		// mytext.txt로부터 문자 읽어 와서 출력
		// FileReade 열기
		try {
			Reader reader = new FileReader(fileName);
			
			int data = 0;
			while((data = reader.read()) != -1) {
				System.out.println("Char : " + ((char)data));
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		writeText();
		readText();
	}

}
