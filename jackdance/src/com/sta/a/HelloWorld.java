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
		// 噗~~
		System.out.println("This is a clone from local exists repo A. And A is clone from github");
		System.out.println("查看git view下的情况。。。");
		System.out.println("连着变2次");
	}
}
