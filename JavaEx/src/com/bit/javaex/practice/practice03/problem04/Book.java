package com.bit.javaex.practice.practice03.problem04;

public class Book {
    // 필드 생성
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	// 생성자
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
    
	// 메소드
	public int getBookNo() {
		return bookNo;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	public void rent() {
		if(stateCode == 1) {
			stateCode = 0;
			System.out.printf("%s이(가) 대여 됐습니다.%n", title);
		}
		else {
			System.out.println("이미 대여중인 책입니다.");
		}
	}
	public void print() {
		System.out.printf("%d 책 제목: %s, 작가: %s, 대여 유무: ", bookNo, title, author);
		if(stateCode == 1) {
			System.out.println("재고있음");
		}
		else {
			System.out.println("대여중");
		}
	}    
}
