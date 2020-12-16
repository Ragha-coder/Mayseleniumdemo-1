package com.seleniumprogram.practice;

public class nonezero {

	
	public static void main(String[] args) {
		
		
		int arr[]= {1,0,1,0,0,1,1};
		
		//0001111
		
		//1111000
		
	String zeros="";
	
	String nonzero="";		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==0) {
				zeros=zeros+arr[i];   //2===0+""=0  4=="0"+"0"=000
			}else {
				nonzero=nonzero+arr[i];       //1 ===1+""=1    3==1+1==11111
			}
			
		}
		
		System.out.println("my result ===================" +nonzero+zeros);
	}
}

