package com.scarlett.softdev;

public class MyCounter {
	private int count = 0;
	public void addTwo() {
		this.count += 2;
	}
	public void subtractTwo() {
		this.count -= 2;
	}
	public int countValue () {
		return this.count;
	}
}
