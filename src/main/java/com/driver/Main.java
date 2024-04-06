package com.driver;

public class Main {
  
	public static void main(String[] args) {
		
		RWOnly rw=new RWOnly();
//		rw.Name="Ashish";
//		
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The field RWOnly.Name is not visible
//
		rw.SetRWOnly(1);
		rw.SetRWOnly("Akanksha");
		
		System.out.println(rw.GetRWOnly());
		System.out.println(rw.getRWOnly());
		
	}
}