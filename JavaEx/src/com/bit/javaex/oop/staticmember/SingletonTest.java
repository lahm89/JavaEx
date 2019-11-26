package com.bit.javaex.oop.staticmember;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();	// error : 생성자가 private
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);	// 같은 객체를 참조하고 있는가?
	}

}
