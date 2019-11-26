package com.bit.javaex.practice.extra02.problem01;

public class Mul extends Operator {

	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;		
	}

	@Override
	public int calculate() {
		return a * b;
	}


}
