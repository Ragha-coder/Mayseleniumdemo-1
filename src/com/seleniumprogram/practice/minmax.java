package com.seleniumprogram.practice;

public class minmax {

	public static void main(String[] args) {

		int arr[] = { 10, 27, 2, 87, 89, 90, 2 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min);
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
