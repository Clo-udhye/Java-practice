package com.exam;

public class Car {
	private String name;
	private int numberOfWheels;
	private String color;

	// default 생성자 (ctrl + space - 자동생성)
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	//마우스 오른쪽 - Source - Generate Constructor using Fields
	// omit ~ 체크
	public Car(String name, int numberOfWheels, String color) {
		this.name = name;
		this.numberOfWheels = numberOfWheels;
		this.color = color;
	}
	
	//마우스 오른쪽 - Source - Generate toString()
	@Override
	public String toString() {
		return "Car [name=" + name + ", numberOfWheels=" + numberOfWheels + ", color=" + color + "]";
	}
	
	//setter/getter
	// 마우스 오른쪽 - Source - Generate Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
