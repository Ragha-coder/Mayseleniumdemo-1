package com.seleniumprograms.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sowakkaquestion {
	
	public static void main(String[] args) {
		
		int arr[] = { 12, 52, 56, 85, 69, 124, 30,20,65,86,502,62,59 };
		
		List<Integer> li= new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			li.add(arr[i]);
		}
		
		Collections.sort(li);
	
		
		System.out.println(li);
		
		System.out.println(li.get(9));
		
		
	}

}
