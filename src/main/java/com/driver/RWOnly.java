package com.driver;

public class RWOnly {
	
	private  int Id;
	private String Name ;
	
    public void  SetRWOnly(int Id){
	  	this.Id=Id;
	}
    public void  SetRWOnly(String Name){
	  	this.Name=Name;
	}
    public int GetRWOnly() {
    	return Id;
    }
    public String getRWOnly() {

    	return Name;
    }
    
}
