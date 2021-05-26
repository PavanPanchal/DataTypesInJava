package com.capg.stringmethods;

public class StringCompare {

	public static void main(String[] args) {
		String a = new String("Third String");
		String b = new String("First");
		String c = new String("Third String");
		String d="Third String";
		String e="Fourth String";
		String f="Third String";

		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));
		System.out.println(a.equals(f));
		System.out.println(d.equals(f));
		
		System.out.println("-------------------------------------");

		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(a==e);
		System.out.println(a==f);
		System.out.println(d==f);
		

	}

}
