package com.seleniumprogram.practice;

public class Overridingex extends overloadingoverriding {

	void m1(int num) {
		System.out.println("child");
	}

	public static void main(String[] args) {

		Overridingex oex = new Overridingex();
		oex.m1(20);
	}

}
