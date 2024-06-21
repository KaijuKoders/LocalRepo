package com.app;

public class Sum 
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		Sum sm = new Sum();
		sm.add(5, 6);
	}
}
