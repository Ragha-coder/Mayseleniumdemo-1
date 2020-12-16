package com.seleniumprogram.practice;

public class Traingale {
	
	public static void main(String[] args) {
		int num =6;
		
		for (int i = 0; i < num; i++) {
			
			for (int j = num-i; j >1; j--) {
				System.out.print(" ");
			}
			//changing for loops makes right angle traingle
			
			for (int j = 0; j < i; j++) {
				System.out.print("* "); //remove space it will became left angle trainagle
			}
			
			System.out.println();
			
		}
	}

}
