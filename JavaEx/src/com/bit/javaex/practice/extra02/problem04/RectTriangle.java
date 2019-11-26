package com.bit.javaex.practice.extra02.problem04;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	public RectTriangle(double w, double h) {
		width = w;
		height = h;
	}

	@Override
	public double getArea() {
		return width * height / 2;
	}

	@Override
	public double getPerimeter() {
		return width + height + (Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2)));
	}
	
}
