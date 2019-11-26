package com.bit.javaex.practice.extra02.problem04;

public class Rectangle extends Shape implements Resizeable {
	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;		
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}
}