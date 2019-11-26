package com.bit.javaex.api.generic.ex2;
// Generic을 이용해서 설계 시 내부 데이터 타입을 지정하지않고 설계
// 객체화 할때 내부 데이터 타입을 사용하도록 강제

// 많이 사용하는 파라미터 관례
// T:Type	R:Return Type	K:Key	V:Value
public class Box<T> {
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
}
