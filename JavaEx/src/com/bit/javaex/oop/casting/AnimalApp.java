package com.bit.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		Dog d = new Dog("Snoopy");
		d.walk();
		d.eat();
		d.bark();
		
		Animal pet = d;	// 업 캐스팅 : 자식 인스턴스를 부모 클래스 타입으로 참조
		pet.walk();
		pet.eat();
//		pet.bark();		// 실행 불가능
		
		pet = new Cat("아즈라엘");
		pet.walk();
		pet.eat();
		
		// 다운 캐스팅 : 인스턴스의 참조타입을 부모에서 원래 클래스로 변경
		((Cat)pet).meow();
		
		// 다운캐스팅 시, 해당 인스턴스가 특정 클래스의 객체인지 확인
		if(pet instanceof Dog) {
			((Dog)pet).bark();
		} else {
			System.out.println("개가 아닌데요!");
		}
	}
}
