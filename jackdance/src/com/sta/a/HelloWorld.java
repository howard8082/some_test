package com.sta.a;

public class HelloWorld {
	
	private String saySome;
	
    public HelloWorld(String word) {
        this.saySome = word;
    }

	public String getSaySome() {
		return saySome;
	}

	public void setSaySome(String saySome) {
		this.saySome = saySome;
	}
    
	public static void main(String[] args) {
		System.out.println("This is a clone from local exists repo A. And A is clone from github");
	}
}
