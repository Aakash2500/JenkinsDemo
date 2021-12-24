package com.Jenkins_Git;

public class Demo {

	
	int i=10;
	String s="Akash";
	public void m1()
	{
		System.out.println("M1....Method");
	}
	public void m3()
	{
		System.out.println("M3....Method");
	}
	
	public static void main(String[] args) {
		System.out.println("Hiii");
		
		System.out.println("Heloooo");
		
		Demo d=new Demo();
		d.m1();
		d.m3();
		
		System.out.println(d.i);
		System.out.println(d.s);
	
	}
}
