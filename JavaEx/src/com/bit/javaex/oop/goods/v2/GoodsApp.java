package com.bit.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
//		camera.name = "Samsung";
//		camera.price = 400000;
		camera.setName("Samsung");
		camera.setPrice(400000);
		
//		System.out.println("Camera:" + camera);
//		System.out.printf("Camera: %s, %d원%n", camera.getName(), camera.getPrice());
		camera.showInfo();
		
		Goods laptop = new Goods();
		laptop.setName("LG 그램");
		laptop.setPrice(900000);
//		System.out.printf("Notebook: %s, %d원%n", laptop.getName(), laptop.getPrice());
		laptop.showInfo();
	}

}
