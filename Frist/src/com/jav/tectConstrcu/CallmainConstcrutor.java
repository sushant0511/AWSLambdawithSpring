package com.jav.tectConstrcu;

public class CallmainConstcrutor {

	public static void main(String[] args) {
		
		Addition a1,a2;
		
		 a1=new Addition();  // garbage collector called by default
		a2=new Addition(12, 3);
		System.out.println(a1);
		System.out.println(a2);
		a1=null;
		System.out.println(a1);
	}
}












