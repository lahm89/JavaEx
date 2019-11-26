package com.bit.javaex.oop;
// 기본적으로 class나 interface 등은 각자 개별 파일에 작성할 것
abstract class Animal {
	// 추상 클래스 -> 객체화 불가
	// 필드
	protected String name;
	protected int age;	
	// 생성자
	public Animal(String name) {
		this.name = name;
	}
	public Animal(String name, int age) {
		this(name);
		this.age = age;
	}	
	// 메소드
	public void eat() {
		System.out.printf("%s is eating...%n", name);
	}
	public abstract void say();	// 추상 메소드이므로 반드시 Override
}

class Human extends Animal {
	public Human(String name, int age) {
		super(name, age);
	}
	
	@Override	
	public void say() {
		System.out.printf("안녕, 내 이름은 %s야%n", name);
	}
}

class Panda extends Animal {
	public Panda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void say() {
		System.out.println("zzz....");
	}
}

interface Kungfu {
	public void kungfu();	// 추상 메소드 -> 인터페이스는 abstract 작성 안함
}

interface Flyable {
	public void fly();
}

class KungfuPanda extends Panda implements Kungfu {
	public KungfuPanda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kungfu() {
		System.out.println(name + ": 아뵤~!");
	}
}

class KungfuHuman extends Human implements Kungfu {
	public KungfuHuman(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kungfu() {
		System.out.println(name + ": I know kungfu!");
	}
}

class TheOne extends Human implements Kungfu, Flyable{
	//	상속은 단일 부모, 인터페이스는 다중 구현 가능
	public TheOne(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		System.out.println(name + ": I can fly!");
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": I do the Kungfu!");
	}
}

public class SummaryApp {

	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 28);
		Human h2 = new KungfuHuman("네오", 40);
		Panda p1 = new Panda("하오", 30);
		Panda p2 = new KungfuPanda("포", 15);
		
		TheOne neo = new TheOne("NEO", 40);
		
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		fight(neo);
		
		// 쿰푸를 할 수 있는 배열(도장) 생성
		// 같은 인터페이스를 구현한 객체는 같은 인터페이스 타입으로 참조 가능
		Kungfu[] dojang = {
//				(Kungfu)h1,		// error : 캐스팅 에러
				(Kungfu)h2,
//				(Kungfu)p1,
				(Kungfu)p2,
				neo
		};
		
		neo.fly();
	}
	
	public static void fight(Animal a) {
		// 대련
		if(a instanceof Kungfu) {	// 겍체가 인터페이스를 구현한 객체인지 먼저 확인
			((Kungfu)a).kungfu();
		} else {
			System.out.println(a.name + ": 쿵푸 못해요!");
		}
	}
}
