package com.seleniumprogram.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListExample1{  
	enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}
public static void main(String args[]){  
	
	
	ArrayList<String> al = new ArrayList<String>(); 
    al.add("Geeks For Geeks"); 
    al.add("Friends"); 
    al.add("Dear"); 
    al.add("Is"); 
    al.add("Superb"); 

    /* Collections.sort method is sorting the 
    elements of ArrayList in ascending order. */
    try {
		Collections.sort(al);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    
    String str[]= {};

    // Let us print the sorted list 
    System.out.println("List after the use of" + 
                       " Collection.sort() :\n" + al); 
    
    System.out.println(Arrays.asList(al));
    
    System.out.println(Arrays.toString(str));
    
    int [] numbers = {1, 2, 3, 4, 5, 6};
    int [] positiveNumbers = numbers;    // copying arrays

    for (int number: positiveNumbers) {
        System.out.print(number + ", ");
    }
  
}  


} 
