package com.bit.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();	// 사용자 정의 생성자가 있어 컴파일러가 기본 생성자를 추가 안함
//				
		// 생성자를 이용한 초기화
		Goods camera = new Goods("Samsung", 400000);
		camera.showInfo();
		
		Goods laptop = new Goods("LG 그램", 900000);
		laptop.showInfo();
	}

}
