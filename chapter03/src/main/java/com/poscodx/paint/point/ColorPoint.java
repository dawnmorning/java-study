package com.poscodx.paint.point;

public class ColorPoint extends Point {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("점[x=" + getX() + ",y=" + getY() + ", color=" + color + "]을 그렸습니다.");
	}
	
//	@Override
//	public void show() {
//		System.out.println("점[x=" + x + ",y=" + y + "]을 그렸습니다.");
//	}
}
