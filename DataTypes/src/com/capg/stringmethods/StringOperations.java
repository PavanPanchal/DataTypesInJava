package com.capg.stringmethods;


public class StringOperations {

	public static void main(String[] args) {
		
		String a = new String ("  Today is Sunday  ");
		String b = new String ("This is another String");
		
		
		System.out.println("Converting string to uppercase : " + a.toUpperCase());
				
		System.out.println("Converting string to lowercase : " +a.toLowerCase());
		
		System.out.println("index of T is : "+a.indexOf('T'));
		
		System.out.println("Last index of b is :" + b.lastIndexOf('n'));
		
		System.out.println("Index of b after letter 's' is : "+b.indexOf('s',5));

		System.out.println("Character at 9th index is : "+a.charAt(9));
		
		System.out.println("Is string empty? "+ a.isEmpty());
	
		System.out.println("Length of string a is : "+a.length());

		System.out.println("Replacing letter 's' whith 'm' : " +a.replace('S','M'));
			
		System.out.println("Replacing words in string : "+a.replaceAll("Today","Tomorrow"));

		System.out.println("Trimmed string : "+a.trim());
		
		System.out.println("Getting substring from index 5 to 9 : "+a.substring(5,10));
		
		System.out.println("If string contains letter 'i'? "+a.contains("i"));

		System.out.println(b.concat(" Concated"));

		System.out.println(b.concat(a));



	}

}
