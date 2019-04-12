package com.simple;

public class Testing {

	public static void main(String[] srgs)
	{
		String s1 = new String("AHmed");
		String s2 = new String("AHmed");
		
		System.out.println(s1.equals(s2));
		
		String s3 = "AHmed";
		String s4 = "AHmed";
		System.out.println(s3.equals(s4));
		
		
		StringBuilder s5 = new StringBuilder("AHmed");
		StringBuilder s6 = new StringBuilder("AHmed");
		
		System.out.println(s5.equals(s6));
	}
}
