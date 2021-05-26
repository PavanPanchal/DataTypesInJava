package com.capg.datatypes;

public class test {
	//global variables
	
	byte a=4;               
	short j=6565;			
	int b=89;				
	int i=-567;
	long c=-787878995;		
	float d=34.89f;
	double e=-99887.87;
	char f ='l';
	boolean g; 
	String xyz ="This is String";
	 
	long h=a;
	float k= h;
	
	double l= (int)b;
	
	
	
	
	public void display(){
		

	/*	
		System.out.println("Display method called!");
		System.out.println("Value of a="+ a);
		System.out.println("Value of b="+ b);
		System.out.println("Value of c="+ c);
		System.out.println("Value of d="+ d);
		System.out.println("Value of e="+ e);
		System.out.println("Value of f="+ f);
		System.out.println("Value of g="+ g);
		System.out.println("Value of xyz="+ xyz);  */
		
		System.out.println("Value of h="+ k);
		System.out.println("Value of k="+ h);
		System.out.println("Value of l="+ l);
		
		if ( a>0 && b<90 || c>0 ) {
			System.out.println("Either...A is greater than zero and b is less than 90 OR C is greater than 0");
		}

	}

	public static void main(String[] args) {
		
		boolean isRaining=true;
		
		test t = new test();
				
				t.display();
				
				if (isRaining) {
					System.out.println("Carry raincoats wlile stepping outside home..");
				}
				else {
					System.out.println("Weather is Clear..");

				}
				
			
				
	}

}
