package com.bit.javaex.oop.goods.v3;

public class Goods {
	// 필드 선언
	// private으로 접근 제한
	private String name;
	private int price;
	
	// 생성자
	// 코드에 생성자가 하나도 없을 경우 컴파일러가 기본 생성자를 자동으로 추가
	// 생성자는 반드시 1개 이상 존재해야함
	public Goods(String name) {
		this.name = name;
	}
	public Goods(String name, int price) {
		//super();	// 부모 생성자 호출 -> 부모로부터 물려받은 필드 초기화
					// 명시적으로 부모생성자를 호출하지 않으면 컴파일러가 기본 부모 생성자를 추가
//		this.name = name;
		this(name);
		this.price = price;
	}
	
	// Getter와 Setter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	// Setter가 없을 시 field는 Read only
	public void setName(String name) {
		this.name = name;	// this는 해당 인스턴스
	}
	public void setPrice(int price) {
		if(price > 0)
			this.price = price;
	}
	
	//메서드
	public void showInfo() {
		System.out.println("상품이름 : "+ name);
		System.out.println("가격 : "+ price);
		System.out.println();
	}

}
