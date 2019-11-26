package com.bit.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static String dirName = "D:\\javastudy\\files";
	static String fileName = dirName + "\\primitives.txt";
	// DataInputStream과 DataOutputStream : 기본 데이터 타입을 ByteStream으로 다루기 위한 보조스트림 클래스(변환 작업 대신 수행)
	public static void main(String[] args) {
		try {
			// 메인 스트림 열기
			OutputStream fos = new FileOutputStream(fileName);
			// 보조 스트림 연결
			DataOutputStream dos = new DataOutputStream(fos);
			
			// 기본 데이터 출력 : String -> boolean -> int -> float
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("장길산");
			dos.writeBoolean(false);
			dos.writeInt(30);
			dos.writeFloat(99.9f);
			
			dos.close();
			
			// InputStream 설정
			InputStream fis = new FileInputStream(fileName);
			// 기본 타입으로 변환을 위한 보조 스트림 연결
			DataInputStream dis = new DataInputStream(fis);
			
			// 루프를 통해 내용 읽어오기
			for (int i = 0; i < 2; i++) {
				// 데이터 읽어올 시 출력 순서와 동일하게 입력 **
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
//				double d = dis.readDouble();	// error : 출력 하지 않은 값
				System.out.printf("%s:%b:%d:%f%n", s, b, val, f);
			}
			
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
