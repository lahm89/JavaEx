package com.bit.javaex.api.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEx {

	public static void main(String[] args) {
		// java.util 안에 있으므로 명시적으로 import
		Date now = new Date();
		String nowStr = now.toString();
		
		System.out.println("현재시간: " + nowStr);
		System.out.println(now.toLocaleString());	// deprecated
		
		// 날짜 출력 형식 사용
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(now));
		
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(now));
		// DateFormat FULL, LONG, MEDIUM, SHORT
		
		// SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("포매팅된 날짜 정보: " + sdf.format(now));
	}

}
