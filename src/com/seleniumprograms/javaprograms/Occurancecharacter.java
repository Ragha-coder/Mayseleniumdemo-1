package com.seleniumprograms.javaprograms;

import java.util.HashMap;

public class Occurancecharacter {
	
	public static void main(String[] args) {
		
		
		String value= " java is a programing language ";
		
		HashMap<Character,Integer> hmap= new HashMap<Character, Integer>();
		
		for (int i = 0; i < value.length(); i++) {
			
			Character ch= value.charAt(i);
			
			if (hmap.containsKey(ch)) {
				
				hmap.put(ch, hmap.get(ch)+1);
			}else {
				hmap.put(ch,1);
			}
		}
		
		
		System.out.println(hmap);
	}

}
