package com.driver;

public class Main {
  
	public static void main(String[] args) {
		
		RWOnly rw=new RWOnly();
//		rw.Name="Ashish";
//		
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The field RWOnly.Name is not visible
//
		rw.setId(1);
		rw.setName("Akanksha");
		
		System.out.println(rw.getId());
		System.out.println(rw.getName());
		
	}
}