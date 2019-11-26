package com.bit.javaex.io;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	// File Class 예제
	static String dirName = "D:\\javastudy\\files";
	public static void main(String[] args) {
		// File 객체
		// new File : 실제 파일이 생성 되는 것이 아닌 해당 파일 정보를 확인하는 객체를 생성
		File root = new File(dirName);
		// 파일 존재 여부 확인
		System.out.println(dirName + " : " + root.exists());
		// 파일 혹은 디렉터리 생성 전 해당 파일 존재 여부 확인 후 생성
		if(!root.exists()) {
			root.mkdirs();	// 하위 디렉터리 일괄 생성
		}
		// 디렉터리 안에 새 파일 생성
		File file = new File(dirName + "\\myfile.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		printInfo(root);
		// 파일 지우기
		if(file.exists()) {
			file.delete();
		}
		printInfo(root);
	}
	
	// 지정된 디렉터리 내부의 정보를 출력하는 메소드
	static void printInfo(File f) {
		// 파일 정보를 받아서	디렉터리라면 내부의 파일 목록을 출력
		//				디렉터리가 아니면 파일의 속성을 출력
		System.out.println("File List");
		//	디렉터리인지 여부 확인
		if(f.isDirectory()) {	// 디렉터리라면 내부에 파일을 담고 있을 것
			File[] files = f.listFiles();	// 파일의 목록
			System.out.println("Directoy : " + f.getName());
			for (File file:files) {
				System.out.print(file.isDirectory() ? "d " : "f ");
				System.out.println(file.getName() + " " + file.length());
			}
		} else {	// 디렉터리가 아니라면
			System.out.println("File : " + f.getName());
		}
	}
}
