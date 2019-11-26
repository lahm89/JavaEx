package com.bit.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	// FileInputStream과 FileOutputStream
	static String dirName = "D:\\javastudy\\files";
	static String source = dirName + "\\img.jpg";
	static String target = dirName + "\\img_copy.jpg";
	public static void main(String[] args) {
		// source 파일을 FileInputStream으로 열어서
		// target 파일에 FileOutputStream으로 복사
		try {
			// Stream 열기
			InputStream is = new FileInputStream(source);
			OutputStream os = new FileOutputStream(target);
			
			int data = 0;	// 데이터 저장 변수
			// InputStream으로부터 불러온 데이터를 OutputStream으로 저장
			while((data = is.read()) != -1) {
				System.out.print("*");
				os.write(data);
				// 1바이트 단위로 복사 시도 -> 효율상 문제
				// TODO: 버퍼 방식으로 변경해보기
			}
			// Stream 닫기
			os.close();
			is.close();
			System.out.println("파일을 복사했어요!");
		} catch (IOException e)	{
			e.printStackTrace();
		}
	}

}
