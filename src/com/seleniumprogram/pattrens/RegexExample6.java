package com.seleniumprogram.pattrens;

import java.util.regex.*;  
public class RegexExample6{  
   public static void main(String args[]){  
      String content = "This is @ Chaitanya" +
	    "from Beginnersbook.com.";

      String pattern = ".*[\\W]*";

      boolean isMatch = Pattern.matches(pattern, content);
      
      System.out.println("The text contains 'book'? " + isMatch);
      
      
      
      
   }
}  
