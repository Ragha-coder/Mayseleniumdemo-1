package com.seleniumprograms.javaprograms;



public class SeperationAlphaNumberSpecial 
{ 
    static void splitString(String str) 
    { 
        StringBuffer alpha = new StringBuffer(),  
        num = new StringBuffer(), special = new StringBuffer(); 
          
        for (int i=0; i<str.length(); i++) 
        { 
            if (Character.isDigit(str.charAt(i))) 
                num.append(str.charAt(i)); 
            else if(Character.isAlphabetic(str.charAt(i))) 
                alpha.append(str.charAt(i));
            else
                special.append(str.charAt(i)); 
        } 
       
        System.out.println(alpha); 
        System.out.println(num); 
        System.out.println(special); 
    } 
    
    
    
    static void splitstringnumber() {
    	String str = "abcd1234";
    	String[] part = str.split("(?<=\\D)(?=\\d)");
    	System.out.println(part[0]);
    	System.out.println(part[1]);
    	
    	 String str1 = "word1, word2 word3@word4?word5.word6"; 
         String[] arrOfStr = str.split("[, ?.@]+"); 
			/*
			 * String str10="ABDSRaasdcdv";
			 * 
			 * String[] arrOfStr10 = str.split("[0-9]+");
			 * 
			 */
         for (String a : arrOfStr) 
             System.out.println(a); 

    	String st = "abcd1234";
    	String st1=st.replaceAll("[^A-Za-z]", "");
    	String st2=st.replaceAll("[^0-9]", "");
    	System.out.println("String b = "+st1);
    	System.out.println("Int c = "+st2);
    }
    
    static void confirmail() {
    	String str="shruthi@gmail.com";
    	
    	if (str.contains("@")) {
		
    		if (str.contains(".com")) {
    			
    			if (str.endsWith(".com")) {
					System.out.println("mail");
				}
				
			}
		}
    }
      
    // Driver method 
    public static void main(String args[]) 
    { 
        String str = "geeks01$$for02geeks03!@!!"; 
        splitString(str); 
        splitstringnumber();
        confirmail();
    } 
} 

