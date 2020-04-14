package com.example.demo.bean;

public class limitsConfiguration {

	private int maximum; 
	private int minimum;
	
	protected limitsConfiguration()
	{
		
	}

	public limitsConfiguration(int maximum , int minimum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	
	
	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}


	
}
