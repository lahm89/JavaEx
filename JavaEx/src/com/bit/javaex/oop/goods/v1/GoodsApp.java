package com.bit.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.name = "Samsung";
		camera.price = 400000;
		
//		System.out.println("Camera:" + camera);
		System.out.printf("Camera: %s, %d원%n", camera.name, camera.price);
		
		Goods laptop = new Goods();
		laptop.name = "LG 그램";
		laptop.price = 900000;
		System.out.printf("Notebook: %s, %d원%n", laptop.name, laptop .price);
	}

}
