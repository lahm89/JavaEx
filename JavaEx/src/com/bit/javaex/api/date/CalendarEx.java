package com.bit.javaex.api.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// 캘린더의 획득
		Calendar now = Calendar.getInstance();
		// 캘린더는 new 생성 불가->getInstance() 메소드로 객체 생성
		Calendar custom = Calendar.getInstance();
		// custom 캘린더의 날짜 변경
		custom.set(Calendar.YEAR, 2012);
		custom.set(Calendar.MONTH, 8);	// 월은 0부터 시작(=9월)
		custom.set(Calendar.DATE, 24);
		
		// set 메소드를 이용, 년월일시분초 일괄 변경 가능
		custom.set(2012, 8, 24);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n",
				now.get(Calendar.YEAR),
				now.get(Calendar.MONTH) + 1,	// Calendar MONTH + 1 주의
				now.get(Calendar.DATE));
		
		// 미래로 이동
		Calendar future = Calendar.getInstance();	// 현재
		// 10년 후 오늘 : add 메서드
		future.add(Calendar.YEAR, 10);
		// 날짜확인
		System.out.printf("10년 뒤 오늘: %d년 %d월 %d일%n",
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));
		// 요일 확인
		System.out.println("요일: " + future.get(Calendar.DAY_OF_WEEK));
		// 일요일 == 1
		int dow = future.get(Calendar.DAY_OF_WEEK);
		switch(dow) {
		case Calendar.SUNDAY:
			System.out.println("일요일");
			break;
		case Calendar.MONDAY:
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;
		}
	}

}
